package br.com.chess.pieces;

import br.com.boardgame.Board;
import br.com.chess.ChessPiece;
import br.com.chess.Color;

public class Rook extends ChessPiece{

	public Rook(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "R";
	}
}
