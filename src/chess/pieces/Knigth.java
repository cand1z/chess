package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Knigth extends ChessPiece {
    public Knigth(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "N";
    }
    
    @Override
    public boolean[][] possibleMoves() {
    	boolean [][] aux = new boolean[getBoard().getRows()][getBoard().getColumns()];
    	return aux;
    }
}
