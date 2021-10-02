package puzzle;

import basics.Piece;
import basics.RandGenerator;

import java.util.Arrays;

public class Puzzle{
    // Tamaño de la matriz (5x5)
    public static final int SIZE = 3;
    public static long a_BruteForce;
    public static long c_BruteForce;

    private Piece[][] puzzle;
    private final Piece[][] bruteForceSolve;



    public Puzzle(){
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
                    x = RandGenerator.randInt(0, SIZE - 1);
                    y = RandGenerator.randInt(0, SIZE - 1);
                } while (tempPuzzle[y][x] != null);
                tempPuzzle[y][x] = puzzle[column][row];
            }
        }
        puzzle = tempPuzzle;
    }

    //Ordenar puzzle metodo bruteForce
    public boolean bruteForce(int x, int y){
        c_BruteForce++; //1 comparison: true or false if
         if(y == SIZE) {
            return true;
        } else {
            a_BruteForce++; //1 assignment: for initialization
            for (int column = 0; column < SIZE; column++) {
                c_BruteForce++; //1 comparison: true for comparison

                a_BruteForce++; //1 assignment: for initialization
                for (int row = 0; row < SIZE; row++) {
                    c_BruteForce++; // 1 comparison: true for comparison

                    c_BruteForce++; //1 comparison: true or false if
                    if (!puzzle[column][row].getUsed()) {

                        c_BruteForce++; //1 comparison: true or false if
                        if ( ((x == 0) || (bruteForceSolve[x - 1][y].getRightSide() == puzzle[column][row].getLeftSide()) ) &&
                                ((y == 0) || (bruteForceSolve[x][y - 1].getDownSide() == puzzle[column][row].getUpperSide() ))) {

                            bruteForceSolve[x][y] = puzzle[column][row];
                            // used piece
                            puzzle[column][row].setUsed();
                            // y = row
                            int new_y = y;
                            // column + 1
                            int new_x = (x + 1);
                            // row ++
                            a_BruteForce += 4; //4 assignments: 1 insertion on matrix, 1 set used puzzle piece, 2 column/row increment

                            c_BruteForce++; //1 comparison: true or false if
                            if (new_x == SIZE) {
                                new_x = 0;
                                new_y++;
                                a_BruteForce += 2; //2 assignments: column/row increment
                            }

                            c_BruteForce++; //1 comparison: true or false if
                            if ( bruteForce(new_x, new_y) ) {
                                return true;
                            }

                            puzzle[column][row].setUnused();
                            a_BruteForce++; //1 assignment: set false puzzle piece

                        }
                    }
                    a_BruteForce++; //1 assignment: for increase
                }
                c_BruteForce++; // 1 comparison: false for comparison
                a_BruteForce++; //1 assignment: for increase
            }
            c_BruteForce++; // 1 comparison: false for comparison
        }
        return false;
    }

    public void setPiece(int y, int x, Piece piece) {
        if (x < SIZE && y < SIZE)
            this.puzzle[y][x] = piece;
    }
    //imprimir asignaciones y comparaciones bruteForce
    public void printAsigCompBF(){
        System.out.println("\n Asignaciones: "+ a_BruteForce );
        System.out.println("\n Comparaciones: "+ c_BruteForce );
        long executedLines = a_BruteForce + c_BruteForce;
        System.out.println("\n Lineas ejecutadas: " + executedLines);
    }

    // Print del puzzle bruteForce
    public void printBruteForce() {
        for (int column = 0; column < SIZE; column++) {
            for (int row = 0; row < SIZE; row++) {
                System.out.print(Arrays.toString(bruteForceSolve[row][column].getSides()));
                if (row == SIZE - 1)
                    System.out.print('\n');
            }
        }
    }

    public void setPiece(int y, int x, Piece piece) {
       PuzzleResolver increment = new PuzzleResolver();
       increment.increaseCompFastForward(1); // incrementar comparaciones avance rapido
        if (x < SIZE && y < SIZE) {
            this.puzzle[y][x] = piece;
            increment.increaseAsigFastForward(1); // incrementar asignaciones avance rapido
        }
   }

    public Piece removePiece(int coordenateY, int coordenateX) {
        PuzzleResolver increment = new PuzzleResolver();
        Piece piece = null;

        increment.increaseAsigFastForward(1); // incrementar asignaciones avance rapido
        increment.increaseCompFastForward(1); // incrementar comparaciones avance rapido
        if (coordenateY >= 0 && coordenateX >= 0) {

            piece = puzzle[coordenateY][coordenateX];
            puzzle[coordenateY][coordenateX] = null;
            increment.increaseAsigFastForward(2); // incrementar asignaciones avance rapido
        }
        return piece;
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
