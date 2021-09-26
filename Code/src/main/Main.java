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



    }
}