package puzzle;

import basics.Piece;
import basics.Probability;

import java.util.ArrayList;
import java.util.Arrays;

public class PuzzleResolver {

    private final ArrayList<Piece> unsignedPieces = new ArrayList<>();
    private final ArrayList<Probability> probabilities = new ArrayList<>();
    private final Puzzle puzzle = new Puzzle();
    private ArrayList<Piece> unsignedPieces = new ArrayList<>();
    private int[][] countPieces;
    private Puzzle puzzle = new Puzzle();
    private int needUp;
    private int needLeft;

    public PuzzleResolver() {
        countPieces = new int[4][Piece.MAX_NUM+1];
    }

    // fill UnsignedPieces arrayList with puzzle matrix
    public void fillUnsignedPieces(Puzzle puzzle){
        for (int column = 0; column < Puzzle.SIZE; column++) {
            for (int row = 0; row < Puzzle.SIZE; row++) {
                unsignedPieces.add(puzzle.getPuzzle()[column][row]);
            }
        }
    }

    public void printUnsignedPieces(){
        System.out.println("\n      0  1  2  3  4  5  6  7  8  9");
        System.out.println("up \nright \nleft \ndown");
        for (int i = 0; i < countPieces.length; i++) {
                System.out.println(Arrays.toString(countPieces[i]));
            }
        }



    // Este algoritmo nada mas cuenta las cantidad de piezas que tienen un x numero en un a lado

    //0 1 2 3 4 5 6 7 8 9
    //up
    //right
    //left
    //down
    public void updateCountPieces() {
        for (int i = 0; i < unsignedPieces.size(); i++) {

            int up = unsignedPieces.get(i).getUpperSide();
            int right = unsignedPieces.get(i).getRightSide();
            int left = unsignedPieces.get(i).getLeftSide();
            int down = unsignedPieces.get(i).getDownSide();

            switch (up) {
                case 0:
                    countPieces[0][0] += 1;
                    break;
                case 1:
                    countPieces[0][1] += 1;
                    break;
                case 2:
                    countPieces[0][2] += 1;
                    break;
                case 3:
                    countPieces[0][3] += 1;
                    break;
                case 4:
                    countPieces[0][4] += 1;
                    break;
                case 5:
                    countPieces[0][5] += 1;
                    break;
                case 6:
                    countPieces[0][6] += 1;
                    break;
                case 7:
                    countPieces[0][7] += 1;
                    break;
                case 8:
                    countPieces[0][8] += 1;
                    break;
                case 9:
                    countPieces[0][9] += 1;
                    break;
            }
            switch (right) {
                case 0:
                    countPieces[1][0] += 1;
                    break;
                case 1:
                    countPieces[1][1] += 1;
                    break;
                case 2:
                    countPieces[1][2] += 1;
                    break;
                case 3:
                    countPieces[1][3] += 1;
                    break;
                case 4:
                    countPieces[1][4] += 1;
                    break;
                case 5:
                    countPieces[1][5] += 1;
                    break;
                case 6:
                    countPieces[1][6] += 1;
                    break;
                case 7:
                    countPieces[1][7] += 1;
                    break;
                case 8:
                    countPieces[1][8] += 1;
                    break;
                case 9:
                    countPieces[1][9] += 1;
                    break;
            }
            switch (left) {
                case 0:
                    countPieces[2][0] += 1;
                    break;
                case 1:
                    countPieces[2][1] += 1;
                    break;
                case 2:
                    countPieces[2][2] += 1;
                    break;
                case 3:
                    countPieces[2][3] += 1;
                    break;
                case 4:
                    countPieces[2][4] += 1;
                    break;
                case 5:
                    countPieces[2][5] += 1;
                    break;
                case 6:
                    countPieces[2][6] += 1;
                    break;
                case 7:
                    countPieces[2][7] += 1;
                    break;
                case 8:
                    countPieces[2][8] += 1;
                    break;
                case 9:
                    countPieces[2][9] += 1;
                    break;
            }
            switch (down) {
                case 0:
                    countPieces[3][0] += 1;
                    break;
                case 1:
                    countPieces[3][1] += 1;
                    break;
                case 2:
                    countPieces[3][2] += 1;
                    break;
                case 3:
                    countPieces[3][3] += 1;
                    break;
                case 4:
                    countPieces[3][4] += 1;
                    break;
                case 5:
                    countPieces[3][5] += 1;
                    break;
                case 6:
                    countPieces[3][6] += 1;
                    break;
                case 7:
                    countPieces[3][7] += 1;
                    break;
                case 8:
                    countPieces[3][8] += 1;
                    break;
                case 9:
                    countPieces[3][9] += 1;
                    break;
            }

        }

    }




    // Este algoritmo crea una probabilidad segun countPieces con la formula que escribi
    public void setProbs(){



    }

    public void solvePuzzle(){
        // while (unasihgnedPieces > size)
        // update count pieces
        // set mandatory numbers
        // update probs
        // pick a piece
    }



}