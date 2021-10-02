package puzzle;

import basics.Piece;
import basics.RandGenerator;

import java.util.ArrayList;

public class PuzzleResolver {

    public static double MAX_REPS = Math.pow(Puzzle.SIZE, 5);
    public static long a_FastForward;
    public static long c_FastForward;
    private final ArrayList<Piece> unsignedPieces = new ArrayList<>();
    private final Puzzle puzzle = new Puzzle();
    private final int[][] countPieces;
    private int needUp;
    private int needLeft;

    public PuzzleResolver() {
        countPieces = new int[4][Piece.MAX_NUM + 1];
        a_FastForward++; //1 assignment: new CountPieces
    }

    // funciones para incrementar asig y comp en puzzle
    public void increaseAsigFastForward(int num) {
        a_FastForward = a_FastForward + num;
    }

    public void increaseCompFastForward(int num) {
        c_FastForward = c_FastForward + num;
    }


    // fill UnsignedPieces arrayList with puzzle matrix
    public void fillUnsignedPieces(Puzzle puzzle) {
        a_FastForward++; //1 assignment: for initialization
        for (int column = 0; column < Puzzle.SIZE; column++) {
            c_FastForward++; //1 comparison: true for comparison

            a_FastForward++; //1 assignment: for initialization
            for (int row = 0; row < Puzzle.SIZE; row++) {
                c_FastForward++; //1 comparison: true for comparison

                unsignedPieces.add(puzzle.getPuzzle()[column][row]);
                a_FastForward++; //1 assignment: add in unsignedPieces
                a_FastForward++; //1 assignment: for increment
            }
            c_FastForward++; //1 comparison: false for comparison
            a_FastForward++; //1 assignment: for increment
        }
        c_FastForward++; //1 comparison: false for comparison
    }

    // Este algoritmo nada mas cuenta las cantidad de piezas que tienen un x numero en un y lado
    //0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
    //up
    //right
    //left
    //down
    public void updateCountPieces() {
        a_FastForward++; //1 assignment: for initialization
        for (Piece unsignedPiece : unsignedPieces) {
            c_FastForward++; //1 comparison: true for comparison
            int up = unsignedPiece.getUpperSide();
            int right = unsignedPiece.getRightSide();
            int left = unsignedPiece.getLeftSide();
            int down = unsignedPiece.getDownSide();
            a_FastForward += 4; //4 assignments: up/right/left/down

            switch (up) {
                case 0 -> {
                    countPieces[0][0] += 1;
                    a_FastForward++; //1 assignment: countPieces Matrix assignment
                    c_FastForward++; //1 comparison: true case
                }
                case 1 -> {
                    countPieces[0][1] += 1;
                    a_FastForward++; //1 assignment: countPieces Matrix assignment
                    c_FastForward += 2; //2 comparison: true case and prev false case
                }
                case 2 -> {
                    countPieces[0][2] += 1;
                    a_FastForward++; //1 assignment: countPieces Matrix assignment
                    c_FastForward += 3; //3 comparison: true case and prev false case
                }
                case 3 -> {
                    countPieces[0][3] += 1;
                    a_FastForward++; //1 assignment: countPieces Matrix assignment
                    c_FastForward += 4; //4 comparison: true case and prev false case
                }
                case 4 -> {
                    countPieces[0][4] += 1;
                    a_FastForward++; //1 assignment: countPieces Matrix assignment
                    c_FastForward += 5; //5 comparison: true case and prev false case
                }
                case 5 -> {
                    countPieces[0][5] += 1;
                    a_FastForward++; //1 assignment: countPieces Matrix assignment
                    c_FastForward += 6; //6 comparison: true case and prev false case
                }
                case 6 -> {
                    countPieces[0][6] += 1;
                    a_FastForward++; //1 assignment: countPieces Matrix assignment
                    c_FastForward += 7; //7 comparison: true case and prev false case
                }
                case 7 -> {
                    countPieces[0][7] += 1;
                    a_FastForward++; //1 assignment: countPieces Matrix assignment
                    c_FastForward += 8; //8 comparison: true case and prev false case
                }
                case 8 -> {
                    countPieces[0][8] += 1;
                    a_FastForward++; //1 assignment: countPieces Matrix assignment
                    c_FastForward += 9; //9 comparison: true case and prev false case
                }
                case 9 -> {
                    countPieces[0][9] += 1;
                    a_FastForward++; //1 assignment: countPieces Matrix assignment
                    c_FastForward += 10; //10 comparison: true case and prev false case
                }
                case 10 -> {
                    countPieces[0][10] += 1;
                    a_FastForward++; //1 assignment: countPieces Matrix assignment
                    c_FastForward += 11; //11 comparison: true case and prev false case
                }
                case 11 -> {
                    countPieces[0][11] += 1;
                    a_FastForward++; //1 assignment: countPieces Matrix assignment
                    c_FastForward += 12; //12 comparison: true case and prev false case
                }
                case 12 -> {
                    countPieces[0][12] += 1;
                    a_FastForward++; //1 assignment: countPieces Matrix assignment
                    c_FastForward += 13; //13 comparison: true case and prev false case
                }
                case 13 -> {
                    countPieces[0][13] += 1;
                    a_FastForward++; //1 assignment: countPieces Matrix assignment
                    c_FastForward += 14; //14 comparison: true case and prev false case
                }
                case 14 -> {
                    countPieces[0][14] += 1;
                    a_FastForward++; //1 assignment: countPieces Matrix assignment
                    c_FastForward += 15; //15 comparison: true case and prev false case
                }
                case 15 -> {
                    countPieces[0][15] += 1;
                    a_FastForward++; //1 assignment: countPieces Matrix assignment
                    c_FastForward += 16; //16 comparison: true case and prev false case
                }
            }
            switch (right) {
                case 0 -> {
                    countPieces[1][0] += 1;
                    a_FastForward++; //1 assignment: countPieces Matrix assignment
                    c_FastForward++; //1 comparison: true case
                }
                case 1 -> {
                    countPieces[1][1] += 1;
                    a_FastForward++; //1 assignment: countPieces Matrix assignment
                    c_FastForward += 2; //2 comparison: true case and prev false case
                }
                case 2 -> {
                    countPieces[1][2] += 1;
                    a_FastForward++; //1 assignment: countPieces Matrix assignment
                    c_FastForward += 3; //3 comparison: true case and prev false case
                }
                case 3 -> {
                    countPieces[1][3] += 1;
                    a_FastForward++; //1 assignment: countPieces Matrix assignment
                    c_FastForward += 4; //4 comparison: true case and prev false case
                }
                case 4 -> {
                    countPieces[1][4] += 1;
                    a_FastForward++; //1 assignment: countPieces Matrix assignment
                    c_FastForward += 5; //5 comparison: true case and prev false case
                }
                case 5 -> {
                    countPieces[1][5] += 1;
                    a_FastForward++; //1 assignment: countPieces Matrix assignment
                    c_FastForward += 6; //6 comparison: true case and prev false case
                }
                case 6 -> {
                    countPieces[1][6] += 1;
                    a_FastForward++; //1 assignment: countPieces Matrix assignment
                    c_FastForward += 7; //7 comparison: true case and prev false case
                }
                case 7 -> {
                    countPieces[1][7] += 1;
                    a_FastForward++; //1 assignment: countPieces Matrix assignment
                    c_FastForward += 8; //8 comparison: true case and prev false case
                }
                case 8 -> {
                    countPieces[1][8] += 1;
                    a_FastForward++; //1 assignment: countPieces Matrix assignment
                    c_FastForward += 9; //9 comparison: true case and prev false case
                }
                case 9 -> {
                    countPieces[1][9] += 1;
                    a_FastForward++; //1 assignment: countPieces Matrix assignment
                    c_FastForward += 10; //10 comparison: true case and prev false case
                }
                case 10 -> {
                    countPieces[1][10] += 1;
                    a_FastForward++; //1 assignment: countPieces Matrix assignment
                    c_FastForward += 11; //11 comparison: true case and prev false case
                }
                case 11 -> {
                    countPieces[1][11] += 1;
                    a_FastForward++; //1 assignment: countPieces Matrix assignment
                    c_FastForward += 12; //12 comparison: true case and prev false case
                }
                case 12 -> {
                    countPieces[1][12] += 1;
                    a_FastForward++; //1 assignment: countPieces Matrix assignment
                    c_FastForward += 13; //13 comparison: true case and prev false case
                }
                case 13 -> {
                    countPieces[1][13] += 1;
                    a_FastForward++; //1 assignment: countPieces Matrix assignment
                    c_FastForward += 14; //14 comparison: true case and prev false case
                }
                case 14 -> {
                    countPieces[1][14] += 1;
                    a_FastForward++; //1 assignment: countPieces Matrix assignment
                    c_FastForward += 15; //15 comparison: true case and prev false case
                }
                case 15 -> {
                    countPieces[1][15] += 1;
                    a_FastForward++; //1 assignment: countPieces Matrix assignment
                    c_FastForward += 16; //16 comparison: true case and prev false case
                }
            }
            switch (left) {
                case 0 -> {
                    countPieces[2][0] += 1;
                    a_FastForward++; //1 assignment: countPieces Matrix assignment
                    c_FastForward++; //1 comparison: true case
                }
                case 1 -> {
                    countPieces[2][1] += 1;
                    a_FastForward++; //1 assignment: countPieces Matrix assignment
                    c_FastForward += 2; //2 comparison: true case and prev false case
                }
                case 2 -> {
                    countPieces[2][2] += 1;
                    a_FastForward++; //1 assignment: countPieces Matrix assignment
                    c_FastForward += 3; //3 comparison: true case and prev false case
                }
                case 3 -> {
                    countPieces[2][3] += 1;
                    a_FastForward++; //1 assignment: countPieces Matrix assignment
                    c_FastForward += 4; //4 comparison: true case and prev false case
                }
                case 4 -> {
                    countPieces[2][4] += 1;
                    a_FastForward++; //1 assignment: countPieces Matrix assignment
                    c_FastForward += 5; //5 comparison: true case and prev false case
                }
                case 5 -> {
                    countPieces[2][5] += 1;
                    a_FastForward++; //1 assignment: countPieces Matrix assignment
                    c_FastForward += 6; //6 comparison: true case and prev false case
                }
                case 6 -> {
                    countPieces[2][6] += 1;
                    a_FastForward++; //1 assignment: countPieces Matrix assignment
                    c_FastForward += 7; //7 comparison: true case and prev false case
                }
                case 7 -> {
                    countPieces[2][7] += 1;
                    a_FastForward++; //1 assignment: countPieces Matrix assignment
                    c_FastForward += 8; //8 comparison: true case and prev false case
                }
                case 8 -> {
                    countPieces[2][8] += 1;
                    a_FastForward++; //1 assignment: countPieces Matrix assignment
                    c_FastForward += 9; //9 comparison: true case and prev false case
                }
                case 9 -> {
                    countPieces[2][9] += 1;
                    a_FastForward++; //1 assignment: countPieces Matrix assignment
                    c_FastForward += 10; //10 comparison: true case and prev false case
                }
                case 10 -> {
                    countPieces[2][10] += 1;
                    a_FastForward++; //1 assignment: countPieces Matrix assignment
                    c_FastForward += 11; //11 comparison: true case and prev false case
                }
                case 11 -> {
                    countPieces[2][11] += 1;
                    a_FastForward++; //1 assignment: countPieces Matrix assignment
                    c_FastForward += 12; //12 comparison: true case and prev false case
                }
                case 12 -> {
                    countPieces[2][12] += 1;
                    a_FastForward++; //1 assignment: countPieces Matrix assignment
                    c_FastForward += 13; //13 comparison: true case and prev false case
                }
                case 13 -> {
                    countPieces[2][13] += 1;
                    a_FastForward++; //1 assignment: countPieces Matrix assignment
                    c_FastForward += 14; //14 comparison: true case and prev false case
                }
                case 14 -> {
                    countPieces[2][14] += 1;
                    a_FastForward++; //1 assignment: countPieces Matrix assignment
                    c_FastForward += 15; //15 comparison: true case and prev false case
                }
                case 15 -> {
                    countPieces[2][15] += 1;
                    a_FastForward++; //1 assignment: countPieces Matrix assignment
                    c_FastForward += 16; //16 comparison: true case and prev false case
                }
            }
            switch (down) {
                case 0 -> {
                    countPieces[3][0] += 1;
                    a_FastForward++; //1 assignment: countPieces Matrix assignment
                    c_FastForward++; //1 comparison: true case
                }
                case 1 -> {
                    countPieces[3][1] += 1;
                    a_FastForward++; //1 assignment: countPieces Matrix assignment
                    c_FastForward += 2; //2 comparison: true case and prev false case
                }
                case 2 -> {
                    countPieces[3][2] += 1;
                    a_FastForward++; //1 assignment: countPieces Matrix assignment
                    c_FastForward += 3; //3 comparison: true case and prev false case
                }
                case 3 -> {
                    countPieces[3][3] += 1;
                    a_FastForward++; //1 assignment: countPieces Matrix assignment
                    c_FastForward += 4; //4 comparison: true case and prev false case
                }
                case 4 -> {
                    countPieces[3][4] += 1;
                    a_FastForward++; //1 assignment: countPieces Matrix assignment
                    c_FastForward += 5; //5 comparison: true case and prev false case
                }
                case 5 -> {
                    countPieces[3][5] += 1;
                    a_FastForward++; //1 assignment: countPieces Matrix assignment
                    c_FastForward += 6; //6 comparison: true case and prev false case
                }
                case 6 -> {
                    countPieces[3][6] += 1;
                    a_FastForward++; //1 assignment: countPieces Matrix assignment
                    c_FastForward += 7; //7 comparison: true case and prev false case
                }
                case 7 -> {
                    countPieces[3][7] += 1;
                    a_FastForward++; //1 assignment: countPieces Matrix assignment
                    c_FastForward += 8; //8 comparison: true case and prev false case
                }
                case 8 -> {
                    countPieces[3][8] += 1;
                    a_FastForward++; //1 assignment: countPieces Matrix assignment
                    c_FastForward += 9; //9 comparison: true case and prev false case
                }
                case 9 -> {
                    countPieces[3][9] += 1;
                    a_FastForward++; //1 assignment: countPieces Matrix assignment
                    c_FastForward += 10; //10 comparison: true case and prev false case
                }
                case 10 -> {
                    countPieces[3][10] += 1;
                    a_FastForward++; //1 assignment: countPieces Matrix assignment
                    c_FastForward += 11; //11 comparison: true case and prev false case
                }
                case 11 -> {
                    countPieces[3][11] += 1;
                    a_FastForward++; //1 assignment: countPieces Matrix assignment
                    c_FastForward += 12; //12 comparison: true case and prev false case
                }
                case 12 -> {
                    countPieces[3][12] += 1;
                    a_FastForward++; //1 assignment: countPieces Matrix assignment
                    c_FastForward += 13; //13 comparison: true case and prev false case
                }
                case 13 -> {
                    countPieces[3][13] += 1;
                    a_FastForward++; //1 assignment: countPieces Matrix assignment
                    c_FastForward += 14; //14 comparison: true case and prev false case
                }
                case 14 -> {
                    countPieces[3][14] += 1;
                    a_FastForward++; //1 assignment: countPieces Matrix assignment
                    c_FastForward += 15; //15 comparison: true case and prev false case
                }
                case 15 -> {
                    countPieces[3][15] += 1;
                    a_FastForward++; //1 assignment: countPieces Matrix assignment
                    c_FastForward += 16; //16 comparison: true case and prev false case
                }
            }

            a_FastForward++; //1 assignment: for increment
        }
        c_FastForward++; //1 comparison: false for comparison
    }

    // Este algoritmo crea una probabilidad segun countPieces con la formula que escribi
    public void setProbs() {
        a_FastForward++; //1 assignment: for initialization
        for (int i = 0; i < Piece.MAX_NUM; i++) {   // Este for es para sacar la prob de las piezas con i
            c_FastForward++; //1 comparison: true for comparison
            double probUp;
            double probLeft;
            probUp = (((double) countPieces[0][i] - (double) countPieces[3][i]) /
                    (2 * (double) Puzzle.SIZE * (double) Puzzle.SIZE)) * 100;
            probLeft = (((double) countPieces[2][i] - (double) countPieces[1][i]) /
                    (2 * (double) Puzzle.SIZE * (double) Puzzle.SIZE)) * 100;
            a_FastForward += 2; //2 assignments: probUp and probLeft

            a_FastForward++; //1 assignment: for initialization
            for (Piece unsignedPiece : unsignedPieces) {    //Este for es para setear la prob sacada en el paso anterior a las piezas
                c_FastForward++; //1 comparison: true for comparison

                c_FastForward++; //1 comparison: true or false if
                if ((needUp == -1 || needUp == unsignedPiece.getUpperSide()) && (needLeft == -1 || needLeft == unsignedPiece.getLeftSide())) {
                    c_FastForward++; //1 comparison: true or false if
                    if (unsignedPiece.getUpperSide() == i) {
                        unsignedPiece.setProbability((int) Math.round(probUp));
                        a_FastForward++; //1 assignment: setProbability
                    }
                    c_FastForward++; //1 comparison: true or false if
                    if (unsignedPiece.getLeftSide() == i) {
                        unsignedPiece.setProbability((int) Math.round(probLeft));
                        a_FastForward++; //1 assignment: setProbability
                    }
                    c_FastForward++; //1 comparison: true or false if
                    if (unsignedPiece.getProbability() == 0 && (unsignedPiece.getUpperSide() == i || unsignedPiece.getLeftSide() == i)) {
                        unsignedPiece.setProbability((int) Math.round((Math.abs(probUp + probLeft + 2)) / 2));
                        a_FastForward++; //1 assignment: setProbability
                    }

                }
                a_FastForward++; //1 assignment: for increment
            }
            c_FastForward++; //1 comparison: false for comparison
            a_FastForward++; //1 assignment: for increment
        }
        c_FastForward++; //1 comparison: false for comparison
    }

    // Este algoritmo setea todas las probabilidades de la lista en 0
    public void resetProbs() {
        a_FastForward++; //1 assignment: for initialization
        for (Piece unsignedPiece : unsignedPieces) {
            c_FastForward++; //1 comparison: true for comparison

            unsignedPiece.resetProbability();
            a_FastForward++; //1 assignment resetProbability function setProb = 0

            a_FastForward++; //1 assignment: for increment
        }
        c_FastForward++; //1 comparison: false for comparison
    }

    // Este algoritmo calcula cual es el rango para tirar el random
    public int getMaxPorb() {
        int maxProb = 0;
        a_FastForward++; //1 assignment: maxProb

        a_FastForward++; //1 assignment: for initialization
        for (Piece unsignedPiece : unsignedPieces) {
            c_FastForward++; //1 comparison: true for comparison

            c_FastForward++; //1 comparison: true or false if
            if (unsignedPiece.getProbability() > 0) {
                maxProb += unsignedPiece.getProbability();
                a_FastForward++; //1 assignment: maxProb
            }
            a_FastForward++; //1 assignment: for increment
        }
        c_FastForward++; //1 comparison: false for comparison
        return maxProb;
    }

    // Este algoritmo se encarga de elegir una pieza que tenga probabilidad
    public Piece selectPiece(int pMaxProb) {
        Piece pieceToPlace = null;
        int actualProb = 0;
        int random = RandGenerator.randInt(1, pMaxProb);
        a_FastForward += 3; //3 assignments: pieceToPlace, actualProb, random

        a_FastForward++; //1 assignment: for initialization
        for (int piece = 0; piece < unsignedPieces.size(); piece++) {
            c_FastForward++; //1 comparison: true for comparison

            c_FastForward++; //1 comparison: true or false if
            if (unsignedPieces.get(piece).getProbability() > 0) {
                c_FastForward++; //1 comparison: true or false if
                if (actualProb < random && random <= actualProb + unsignedPieces.get(piece).getProbability()) {
                    pieceToPlace = unsignedPieces.remove(piece);
                    a_FastForward++; //1 assignment: pieceToPlace
                    break;
                } else {
                    actualProb += unsignedPieces.get(piece).getProbability();
                    a_FastForward++; //1 assignment: actualProb
                }
            }
            a_FastForward++; //1 assignment: for increment
        }
        c_FastForward++; //1 comparison: false for comparison
        return pieceToPlace;
    }

    // Este algoritmo determina las conexiones obligatorias
    public void setNeeds(int coordinateY, int ccordinateX) {
        Piece actualPiece;  // Esta parte determina las conexiones obligatorias

        c_FastForward++; //1 comparison: true or false if
        if (ccordinateX == 0) {
            needLeft = -1;
            a_FastForward++; //1 assignment: needLeft
        } else {
            actualPiece = puzzle.getPuzzle()[coordinateY][ccordinateX - 1];
            needLeft = actualPiece.getRightSide();
            a_FastForward += 2; //2 assignments: actualPiece and needLeft
        }

        c_FastForward++; //1 comparison: true or false if
        if (coordinateY == 0) {
            needUp = -1;
            a_FastForward++; //1 assignment: needUp
        } else {
            actualPiece = puzzle.getPuzzle()[coordinateY - 1][ccordinateX];
            needUp = actualPiece.getDownSide();
            a_FastForward += 2; //2 assignments: actualPiece and needUp
        }
    }

    // Este algoritmo devuelve las coordenadas del primero espacio en nulo del rompecabezas
    public int[] getFirstEmptySpace() {
        a_FastForward++; //1 assignment: for initialization
        for (int column = 0; column < Puzzle.SIZE; column++) {
            c_FastForward++; //1 comparison: true for comparison

            a_FastForward++; //1 assignment: for initialization
            for (int row = 0; row < Puzzle.SIZE; row++) {
                c_FastForward++; //1 comparison: true for comparison

                c_FastForward++; //1 comparison: true or false if
                if (puzzle.getPuzzle()[column][row] == null) {
                    return new int[]{column, row};
                }

                a_FastForward++; //1 assignment: for increment
            }
            c_FastForward++; //1 comparison: false for comparison
            a_FastForward++; //1 assignment: for increment
        }
        c_FastForward++; //1 comparison: false for comparison
        return null;
    }

    // Este algoritmo verifica y elimina una pieza del rompecabezas para guardarla en la lista
    public void returnPieceToArray(int coordinateY, int coordinateX) {
        Piece piece = puzzle.removePiece(coordinateY, coordinateX);
        a_FastForward++; //1 assignment: piece

        c_FastForward++; //1 comparison: true or false if
        if (piece != null) {
            unsignedPieces.add(piece);
            a_FastForward++; //1 assignment: add to unsignedPieces array
        }
    }

    public void resetCountPieces() {
        a_FastForward++; //1 assignment: for initialization
        for (int side = 0; side < 4; side++) {
            c_FastForward++; //1 comparison: for true comparison

            a_FastForward++; //1 assignment: for initialization
            for (int actualNum = 0; actualNum < Piece.MAX_NUM; actualNum++) {
                c_FastForward++; //1 comparison: for true comparison

                countPieces[side][actualNum] = 0;
                a_FastForward++; //1 assignment: countPieces assignation

                a_FastForward++; //1 assignment: for increment
            }
            c_FastForward++; //1 comparison: false for comparison

            a_FastForward++; //1 assignment: for increment
        }
        c_FastForward++; //1 comparison: false for comparison
    }

    public boolean solvePuzzle() {
        int repetitions = 0;
        int cantBeResolved = 0;
        a_FastForward += 2; //2 assignments: repetitions / cantBeResolved
        while (getFirstEmptySpace() != null && cantBeResolved < MAX_REPS) {
            c_FastForward++; //1 comparison: while true comparison
            resetCountPieces();
            resetProbs();

            int[] coordinates = getFirstEmptySpace();
            a_FastForward++; //1 assignment: coordinates
            updateCountPieces();
            setNeeds(coordinates[0], coordinates[1]);
            setProbs();

            int maxProb = getMaxPorb(); // Si este número es 0 no se puede colocar ninguna pieza
            a_FastForward++; //1 assignment: maxProb

            c_FastForward++; //1 comparison: true or false if
            if (maxProb > 0) {
                Piece pieceToPlace = selectPiece(maxProb);
                a_FastForward++; //1 assignment: pieceToPlace

                this.puzzle.setPiece(coordinates[0], coordinates[1], pieceToPlace);

            } else {
                a_FastForward++; //1 assignment: repetitions increment
                repetitions++;

                a_FastForward++; //1 assignment: for initialization
                for (int i = 0; i <= repetitions; i++) {
                    c_FastForward++; //1 comparison: true for comparison
                    returnPieceToArray(coordinates[0], coordinates[1] - i);
                    returnPieceToArray(coordinates[0] - i, coordinates[1]);
                    a_FastForward++; //1 assignment: for increment
                }
                c_FastForward++; //1 comparison: false for comparison

                c_FastForward++; //1 comparison: true or false if
                if (repetitions > Puzzle.SIZE) {
                    repetitions = 0;
                    a_FastForward++; //1 assignment: repetitions
                }
            }
            cantBeResolved++;
            a_FastForward++; //1 assignment: cantBeResolved increment
        }
        c_FastForward++; //1 comparison: while false comparison
        return cantBeResolved < MAX_REPS;
    }

    public void printAsigCompFF() {
        System.out.println("\n Asignaciones: " + a_FastForward);
        System.out.println("\n Comparaciones: " + c_FastForward);
        long executedLines = a_FastForward + c_FastForward;
        System.out.println("\n Lineas ejecutadas: " + executedLines);
    }

    // while (unasihgnedPieces > size)
    // update count pieces
    // set mandatory numbers
    // update probs
    // pick a piece
    // place the piece

    public Puzzle getPuzzle() {
        return puzzle;
    }
}