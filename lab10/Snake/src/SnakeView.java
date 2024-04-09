import java.io.InputStream;
import java.io.OutputStream;

// View interface
public interface SnakeView {
    void renderGameBoard(GameBoard gameBoard);
    void displayGameOver();

    Direction getUserInput();

    class GameBoard {
    }
    // Other necessary methods
}

// Concrete implementation of the SnakeView interface
abstract class SnakeGameView implements SnakeView {
    private OutputStream outputStream;
    private InputStream inputStream;

    public SnakeGameView(OutputStream outputStream, InputStream inputStream) {
        this.outputStream = outputStream;
        this.inputStream = inputStream;
    }

    // Implement methods from SnakeView interface
    // Implement rendering of the game board and handling user input
}
