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

        //System.out.println("\nBrute force");
        //obj.bruteForce(0,0);
        //obj.printBruteForce();

        System.out.println("\nAlgoritmo Probabilistico");
        PuzzleResolver asd = new PuzzleResolver();
        asd.fillUnsignedPieces(obj);
        if (asd.solvePuzzle())
            asd.getPuzzle().printPuzzle();
        else
            System.out.println("No se pudo resolver");

        System.out.println("\nSegundo Intento");
        PuzzleResolver asd2 = new PuzzleResolver();
        asd2.fillUnsignedPieces(obj);
        if (asd2.solvePuzzle())
            asd2.getPuzzle().printPuzzle();
        else
            System.out.println("No se pudo resolver");

        System.out.println("\nTercer Intento");
        PuzzleResolver asd3 = new PuzzleResolver();
        asd3.fillUnsignedPieces(obj);
        if (asd3.solvePuzzle())
            asd3.getPuzzle().printPuzzle();
        else
            System.out.println("No se pudo resolver");
    }
}