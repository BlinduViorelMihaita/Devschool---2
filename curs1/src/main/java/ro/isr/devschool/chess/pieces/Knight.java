package ro.isr.devschool.chess.pieces;

import ro.isr.devschool.chess.gamelogic.Square;

/**
 * Created by Valentin on 10/22/2016.
 */
public class Knight extends Piece {
    public Knight(PieceColor color, Square place) {
        super(color, place, false);
    }

    public Square[] validMoves() {
        return new Square[0];
    }

    public Square[] attackSquares() {
        return new Square[0];
    }

    public Square[] captureFreeMoves() {
        return new Square[0];
    }

    public Boolean toBeCaptured() {
        return null;
    }
}
