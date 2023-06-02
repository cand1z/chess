package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece {

    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }
    
    @Override
    public boolean[][] possibleMoves() {
        boolean [][] aux = new boolean[getBoard().getRows()][getBoard().getColumns()];

        Position p = new Position(0,0);

        // above
        p.setValues(position.getRow()-1, position.getColumn());
        if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
            aux[p.getRow()][p.getColumn()] = true;
        }
        if(getBoard().positionExists(p) && getBoard().thereIsAPiece(p)) {
            aux[p.getRow()][p.getColumn()] = true;
        }

        // left
        p.setValues(position.getRow(), position.getColumn() -1);
        if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
            aux[p.getRow()][p.getColumn()] = true;
        }
        if(getBoard().positionExists(p) && getBoard().thereIsAPiece(p)) {
            aux[p.getRow()][p.getColumn()] = true;
        }

        // right
        p.setValues(position.getRow(), position.getColumn() +1);
        if (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
            aux[p.getRow()][p.getColumn()] = true;
        }
        if(getBoard().positionExists(p) && getBoard().thereIsAPiece(p)) {
            aux[p.getRow()][p.getColumn()] = true;
        }

        // below
        p.setValues(position.getRow()+1, position.getColumn());
        if (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
            aux[p.getRow()][p.getColumn()] = true;
        }
        if(getBoard().positionExists(p) && getBoard().thereIsAPiece(p)) {
            aux[p.getRow()][p.getColumn()] = true;
        }
        return aux;
    }
}
