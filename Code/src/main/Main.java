package main;

import puzzle.Puzzle;
import puzzle.PuzzleResolver;

public class Main {
    public static void main(String[] args) {

        Puzzle obj = new Puzzle();


        obj.fillPuzzle();
        System.out.println("\nPuzzle");
        obj.printPuzzle();

        obj.shufflePuzzle();
        System.out.println("\nDesordenar puzzle");
        obj.printPuzzle();

        System.out.println("\nBrute force");
        long startBruteForce = System.currentTimeMillis(); //start execution time
        obj.bruteForce(0,0);
        long stopBruteForce = System.currentTimeMillis();  //stop execution time
        double bruteForceTime = (double) ((stopBruteForce - startBruteForce));  //execution time
        obj.printBruteForce();
        obj.printAsigCompBF();
        System.out.println("\n BruteForce: "+ bruteForceTime +" milisegundos");

        obj.shufflePuzzle();
        System.out.println("\nDesordenar puzzle");
        obj.printPuzzle();

        System.out.println("\nAlgoritmo Probabilistico");
        long startFastForward = System.currentTimeMillis(); //start execution time
        for (int intento = 1; intento < 4; intento++) {
            System.out.println("Intento: " + intento);
            PuzzleResolver asd = new PuzzleResolver();
            asd.fillUnsignedPieces(obj);
            if (asd.solvePuzzle()) {
                asd.getPuzzle().printPuzzle();
                asd.printAsigCompFF();
                break;
            }
            else
                System.out.println("No se pudo resolver");
        }
        long stopFastForward = System.currentTimeMillis();  //stop execution time
        double fastForwardTime = (double) ((stopFastForward - startFastForward));  //execution time
        System.out.println("\n Fast Forward: "+ fastForwardTime +" milisegundos");

    }
}