package puzzle;

import basics.Piece;

import java.util.ArrayList;
import java.util.Arrays;

public class PuzzleResolver {

    private final ArrayList<Piece> unsignedPieces = new ArrayList<>();
    private final Puzzle puzzle = new Puzzle();
    private int[][] countPieces;
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

    public void printCountPieces(){
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
        for (Piece unsignedPiece : unsignedPieces) {

            int up = unsignedPiece.getUpperSide();
            int right = unsignedPiece.getRightSide();
            int left = unsignedPiece.getLeftSide();
            int down = unsignedPiece.getDownSide();

            switch (up) {
                case 0 -> countPieces[0][0] += 1;
                case 1 -> countPieces[0][1] += 1;
                case 2 -> countPieces[0][2] += 1;
                case 3 -> countPieces[0][3] += 1;
                case 4 -> countPieces[0][4] += 1;
                case 5 -> countPieces[0][5] += 1;
                case 6 -> countPieces[0][6] += 1;
                case 7 -> countPieces[0][7] += 1;
                case 8 -> countPieces[0][8] += 1;
                case 9 -> countPieces[0][9] += 1;
                case 10 -> countPieces[0][10] += 1;
                case 11 -> countPieces[0][11] += 1;
                case 12 -> countPieces[0][12] += 1;
                case 13 -> countPieces[0][13] += 1;
                case 14 -> countPieces[0][14] += 1;
                case 15 -> countPieces[0][15] += 1;

            }
            switch (right) {
                case 0 -> countPieces[1][0] += 1;
                case 1 -> countPieces[1][1] += 1;
                case 2 -> countPieces[1][2] += 1;
                case 3 -> countPieces[1][3] += 1;
                case 4 -> countPieces[1][4] += 1;
                case 5 -> countPieces[1][5] += 1;
                case 6 -> countPieces[1][6] += 1;
                case 7 -> countPieces[1][7] += 1;
                case 8 -> countPieces[1][8] += 1;
                case 9 -> countPieces[1][9] += 1;
                case 10 -> countPieces[1][10] += 1;
                case 11 -> countPieces[1][11] += 1;
                case 12 -> countPieces[1][12] += 1;
                case 13 -> countPieces[1][13] += 1;
                case 14 -> countPieces[1][14] += 1;
                case 15 -> countPieces[1][15] += 1;
            }
            switch (left) {
                case 0 -> countPieces[2][0] += 1;
                case 1 -> countPieces[2][1] += 1;
                case 2 -> countPieces[2][2] += 1;
                case 3 -> countPieces[2][3] += 1;
                case 4 -> countPieces[2][4] += 1;
                case 5 -> countPieces[2][5] += 1;
                case 6 -> countPieces[2][6] += 1;
                case 7 -> countPieces[2][7] += 1;
                case 8 -> countPieces[2][8] += 1;
                case 9 -> countPieces[2][9] += 1;
                case 10 -> countPieces[2][10] += 1;
                case 11 -> countPieces[2][11] += 1;
                case 12 -> countPieces[2][12] += 1;
                case 13 -> countPieces[2][13] += 1;
                case 14 -> countPieces[2][14] += 1;
                case 15 -> countPieces[2][15] += 1;
            }
            switch (down) {
                case 0 -> countPieces[3][0] += 1;
                case 1 -> countPieces[3][1] += 1;
                case 2 -> countPieces[3][2] += 1;
                case 3 -> countPieces[3][3] += 1;
                case 4 -> countPieces[3][4] += 1;
                case 5 -> countPieces[3][5] += 1;
                case 6 -> countPieces[3][6] += 1;
                case 7 -> countPieces[3][7] += 1;
                case 8 -> countPieces[3][8] += 1;
                case 9 -> countPieces[3][9] += 1;
                case 10 -> countPieces[3][10] += 1;
                case 11 -> countPieces[3][11] += 1;
                case 12 -> countPieces[3][12] += 1;
                case 13 -> countPieces[3][13] += 1;
                case 14 -> countPieces[3][14] += 1;
                case 15 -> countPieces[3][15] += 1;
            }
        }

    }

    // Este algoritmo crea una probabilidad segun countPieces con la formula que escribi
    public void setProbs() {
        for (int i = 0; i < Piece.MAX_NUM; i++) {   // Este for es para sacar la prob de las piezas con i
            int probUp; int probLeft;
            probUp = ((countPieces[0][i] - countPieces[3][i]) / (2 * Puzzle.SIZE * Puzzle.SIZE)) * 100;
            probLeft = ((countPieces[2][i] - countPieces[1][i]) / (2 * Puzzle.SIZE * Puzzle.SIZE)) * 100;
            for (Piece unsignedPiece : unsignedPieces) {    // Este for es para setear la prob sacada en el paso anterior a las piezas
                if ((needUp == -1 || needUp == unsignedPiece.getUpperSide()) && (needLeft == -1 || needLeft == unsignedPiece.getLeftSide())) {
                    if (unsignedPiece.getUpperSide() == i)
                        unsignedPiece.setProbability(probUp);
                    if (unsignedPiece.getLeftSide() == i)
                        unsignedPiece.setProbability(probLeft);
                } else
                    unsignedPiece.resetProbability();
            }
        }
    }

    public void resetProbs() {
        for (Piece unsignedPiece : unsignedPieces)
            unsignedPiece.resetProbability();
    }

    public void solvePuzzle() {
        // while (unasihgnedPieces > size)
        // update count pieces
        // set mandatory numbers
        // update probs
        // pick a piece
    }



}