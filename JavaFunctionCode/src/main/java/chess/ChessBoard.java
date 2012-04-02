package chess;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 3/31/12
 * Time: 6:09 PM
 */
public class ChessBoard {
    private King king;

    public King getKing() {
        return king;
    }

    public void put(King king, ChessBoardPoint point) {
        this.king = king;
        king.setPoint(point);
    }

    public void put(Pawn pawn, ChessBoardPoint point) {
        pawn.setChessboard(this);
        pawn.setChessBoardPosition(point);
    }

    public void addKing(King aking, ChessBoardPoint chessBoardPoint) {
        this.king= aking;
        this.king.setPoint(chessBoardPoint);
    }

    public void addRook(Rook arook, ChessBoardPoint chessBoardPoint) {
        arook.setChessboard(this);
        arook.setChessboardPosition(chessBoardPoint);
    }
}
