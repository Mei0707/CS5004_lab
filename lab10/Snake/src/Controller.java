// Controller class
class SnakeGameController {
    private SnakeModel model;
    private SnakeView view;

    public SnakeGameController(SnakeModel model, SnakeView view) {
        this.model = model;
        this.view = view;
    }

    public void startGame() {
        // Main game loop
        while (!model.isGameOver()) {
            // Get user input
            Direction direction = view.getUserInput();
            // Move snake accordingly
            model.moveSnake(direction);
            // Update view
            view.renderGameBoard(model.getGameBoard());
        }
        // Game over
        view.displayGameOver();
    }
}

// Enum for representing direction of movement
enum Direction {
    UP, DOWN, LEFT, RIGHT
}
