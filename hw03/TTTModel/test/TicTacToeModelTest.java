import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TicTacToeModelTest {

    private TicTacToeModel game;

    @BeforeEach
    void setUp() {
        game = new TicTacToeModelImpl(); // Assuming a concrete implementation exists
    }

    @Test
    void testGetCurrentPlayer() {
        Assertions.assertEquals(TicTacToeModel.Player.X, game.getCurrentPlayer());
        game.makeMove(0, 0);
        Assertions.assertEquals(TicTacToeModel.Player.O, game.getCurrentPlayer());
    }

    @Test
    void testMakeMove() {
        game.makeMove(0, 0);
        Assertions.assertEquals(TicTacToeModel.Player.X, game.getPlayerAt(0, 0));

        Assertions.assertThrows(IllegalArgumentException.class, () -> game.makeMove(-1, 0));
    }

    @Test
    void testGetWinner() {
        Assertions.assertNull(game.getWinner());
        game.makeMove(0, 0);
        game.makeMove(1, 1);
        game.makeMove(0, 1);
        game.makeMove(1, 2);
        game.makeMove(0, 2);
        Assertions.assertEquals(TicTacToeModel.Player.X, game.getWinner());
    }

    @Test
    void testIsDraw() {
        Assertions.assertFalse(game.isDraw());
        game.makeMove(0, 0);
        game.makeMove(1, 1);
        game.makeMove(0, 1);
        game.makeMove(0, 2);
        game.makeMove(2, 1);
        game.makeMove(1, 0);
        game.makeMove(1, 2);
        game.makeMove(2, 0);
        game.makeMove(2, 2);
        Assertions.assertFalse(game.isDraw());
    }

    @Test
    void testIsGameOver() {
        Assertions.assertFalse(game.isGameOver());
        game.makeMove(0, 0);
        game.makeMove(1, 1);
        game.makeMove(0, 1);
        game.makeMove(0, 2);
        game.makeMove(2, 1);
        game.makeMove(1, 0);
        game.makeMove(1, 2);
        game.makeMove(2, 0);
        Assertions.assertTrue(game.isGameOver());
    }

    @Test
    void testReset() {
        game.makeMove(0, 0);
        game.makeMove(1, 1);
        game.reset();
        Assertions.assertNull(game.getPlayerAt(0, 0));
    }
}
