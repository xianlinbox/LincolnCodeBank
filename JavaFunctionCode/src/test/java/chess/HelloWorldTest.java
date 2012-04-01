package chess;

import chess.ChessBoard;
import chess.King;
import chess.Pawn;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 3/31/12
 * Time: 6:00 PM
 */
public class HelloWorldTest {
    @Test
    public void should_pawn_checkmates_king_when_king_at_ONE_step_top_left_of_pawn() {
        ChessBoard aChessBoard = new ChessBoard();
        King aKing = new King();
        Pawn aPawn = new Pawn();

        aChessBoard.put(aKing, new ChessBoardPoint(5, 5));
        aChessBoard.put(aPawn, new ChessBoardPoint(6, 6));

        assertThat(aPawn.isCheckMate(), is(true));
    }

    @Test
    public void should_not_pawn_checkmates_king_when_king_is_not_at_ONE_step_top_left_of_pawn() {
        ChessBoard aChessBoard = new ChessBoard();
        King aKing = new King();
        Pawn aPawn = new Pawn();

        aChessBoard.put(aKing, new ChessBoardPoint(3, 3));
        aChessBoard.put(aPawn, new ChessBoardPoint(6, 6));

        assertThat(aPawn.isCheckMate(), is(false));
    }

}
