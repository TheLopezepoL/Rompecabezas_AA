package puzzle;

import basics.*;
import java.util.Arrays;

public class Puzzle {
    // Tamaño de la matriz (5x5)
    public static final int SIZE = 3;

    private Piece[][] puzzle;
    private Piece[][] bruteForceSolve;

    public Puzzle() {
        this.puzzle = new Piece[SIZE][SIZE];
        this.bruteForceSolve = new Piece[SIZE][SIZE];
    }

    public Piece[][] getPuzzle() {
        return puzzle;
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
                puzzle[column][row] = new Piece(valueUp, -1, -1, valueLeft, false);
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
                    x = RandGenerator.randInt(0, SIZE-1);
                    y = RandGenerator.randInt(0, SIZE-1);
                } while (tempPuzzle[y][x] != null);
                tempPuzzle[y][x] = puzzle[column][row];
            }
        }
        puzzle = tempPuzzle;
    }


    //Ordenar puzzle bruteForce
   public boolean bruteForce(int x, int y){
        //
        if (y == SIZE) {

            return true;
        }
        else {
            for (int column = 0; column < SIZE; column++) {
                for (int row = 0; row < SIZE; row++) {
                    if (puzzle[column][row].getUsed() == false) {

                        if ( ((x == 0) || (bruteForceSolve[x - 1][y].getRightSide() == puzzle[column][row].getLeftSide()) ) &&
                                ((y == 0) || (bruteForceSolve[x][y - 1].getDownSide() == puzzle[column][row].getUpperSide() ))) {

                            bruteForceSolve[x][y] = puzzle[column][row];
                            puzzle[column][row].setUsed();

                            // y = row
                            int new_y = y;

                            // column + 1
                            int new_x = (x + 1);

                            // row ++
                            if (new_x == SIZE) {
                                new_x = 0;
                                new_y++;
                            }
                            if ( bruteForce(new_x, new_y) ) {
                                return true;
                            }
                            puzzle[column][row].setUnused();
                        }
                    }
                }
            }
        }
        return false;
   }


    // Print del puzzle
    public void printBruteForce() {
        for (int column = 0; column < SIZE; column++) {
            for (int row = 0; row < SIZE; row++) {
                System.out.print(Arrays.toString(bruteForceSolve[row][column].getSides()));
                if (row == SIZE - 1)
                    System.out.print('\n');
            }
        }

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
