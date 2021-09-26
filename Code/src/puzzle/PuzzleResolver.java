package puzzle;

import basics.Piece;
import basics.Probability;

import java.util.ArrayList;

public class PuzzleResolver {

    private ArrayList<Piece> unasignedPieces = new ArrayList<>();
    private int[][] countPieces;
    private Puzzle puzzle = new Puzzle();
    private int needUp;
    private int needLeft;
    private ArrayList<Probability> probabilities = new ArrayList<>();

    public PuzzleResolver(Puzzle puzzle) {
        for (int column = 0; column < Puzzle.SIZE; column++) {
            for (int row = 0; row < Puzzle.SIZE; row++) {
                unasignedPieces.add(puzzle.getPuzzle()[column][row]);
            }
        }
        countPieces = new int[Piece.MAX_NUM][4];
    }

    public void solvePuzzle(){
        // while (unasihgnedPieces > size)
        // update count pieces
        // set mandatory numbers
        // update probs
        // pick a piece
    }

    // Este algoritmo nada mas cuenta las cantidad de piezas que tienen un x numero en un a lado
    public void updateCountPieces(){}

    // Este algoritmo crea una probabilidad segun countPieces con la formula que escribi
    public void setProbs(){}

    
    
    
}