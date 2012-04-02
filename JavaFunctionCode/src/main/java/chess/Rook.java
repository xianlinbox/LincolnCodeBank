package chess;

import sun.font.GlyphList;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 4/1/12
 * Time: 8:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class Rook {
    private ChessBoard chessboard;
    private ChessBoardPoint position;

    public boolean isCheckmate() {
        return isRookCheckmate();
    }

    private boolean isRookCheckmate() {
        return position.getX() == getKing().getPosition().getX() || position.getY() == getKing().getPosition().getY();
    }

    public King getKing() {
        return chessboard.getKing();
    }

    public void setChessboard(ChessBoard chessboard) {
        this.chessboard = chessboard;
    }

    public void setChessboardPosition(ChessBoardPoint chessBoardPoint) {
        this.position = chessBoardPoint;
    }
}
