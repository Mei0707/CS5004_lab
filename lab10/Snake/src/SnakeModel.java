// Model interface
public interface SnakeModel {
    void initializeGame();
    void moveSnake(Direction direction);
    boolean isGameOver();

    SnakeView.GameBoard getGameBoard();
    // Other necessary methods
}

// Concrete implementation of the SnakeModel interface
abstract class SnakeGameModel implements SnakeModel {
    // Implement methods from SnakeModel interface
    // Implement the game logic here
}
