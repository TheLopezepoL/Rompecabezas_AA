package puzzle;

import basics.*;
import java.util.Arrays;

public class Puzzle {
    // Tamaño de la matriz (5x5)
    private static final int SIZE = 5;

    private Piece[][] puzzle;

    Puzzle() {
        this.puzzle = new Piece[SIZE][SIZE];
    }

    // Completa el rompecabezas con al menos 1 solucion posible
    public void fillPuzzle() {
        for (int column = 0; column < SIZE; column++) {
            for (int row = 0; row < SIZE; row++) {
                int valueUp = -1;
                int valueLeft = -1;
                if (column != 0)
                    valueUp = puzzle[column - 1][row].getDownSide();
                if (row != 0)
                    valueLeft = puzzle[column][row - 1].getRightSide();
                puzzle[column][row] = new Piece(valueUp, -1, -1, valueLeft);
            }
        }
    }

    // Revuelve las piezas del puzzle
    public void shufflePuzzle() {
        Piece[][] tempPuzzle = new Piece[SIZE][SIZE];
        for (int column = 0; column < SIZE; column++) {
            for (int row = 0; row < SIZE; row++) {
                int x;
                int y;
                do {
                    x = RandGenerator.randInt(0, SIZE);
                    y = RandGenerator.randInt(0, SIZE);
                } while (tempPuzzle[y][x] != null);
                tempPuzzle[y][x] = puzzle[column][row];
            }
        }
        puzzle = tempPuzzle;
    }

    // Print del puzzle
    public void printPuzzle() {
        for (int column = 0; column < SIZE; column++) {
            for (int row = 0; row < SIZE; row++) {
                System.out.print(Arrays.toString(puzzle[column][row].getSides()));
                if (row == SIZE - 1)
                    System.out.print('\n');
            }
        }
    }
}
