package chess;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 3/31/12
 * Time: 6:10 PM
 */
public class Pawn {
    private ChessBoardPoint position;
    private ChessBoard chessboard;

    public boolean isCheckMate() {
        return isKingCheckmated(getKing().getPosition());
    }

    private boolean isKingCheckmated(ChessBoardPoint point) {
        return position.getX() - 1 == point.getX() && position.getY() - 1 == point.getY();
    }

    private King getKing() {
        return chessboard.getKing();
    }

    public void setChessboard(ChessBoard chessboard) {
        this.chessboard = chessboard;
    }

    public void setChessBoardPosition(ChessBoardPoint point) {
        this.position = point;
    }
}
