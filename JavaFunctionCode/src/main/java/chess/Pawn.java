package chess;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 3/31/12
 * Time: 6:10 PM
 */
public class Pawn {
    private int x;
    private int y;
    private ChessBoard chessboard;

    public boolean isCheckMate() {
        return isKingCheckmated(getKing().getPosition());
    }

    private boolean isKingCheckmated(ChessBoardPoint point) {
        return x - 1 == point.getX() && y - 1 == point.getY();
    }

    private King getKing() {
        return chessboard.getKing();
    }

    public void setChessboard(ChessBoard chessboard) {
        this.chessboard = chessboard;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }
}
