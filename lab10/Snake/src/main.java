public class Main {
    public static void main(String[] args) {
        // Create model
        SnakeModel model = new SnakeGameModel() {
            @Override
            public void initializeGame() {

            }

            @Override
            public void moveSnake(Direction direction) {

            }

            @Override
            public boolean isGameOver() {
                return false;
            }

            @Override
            public SnakeView.GameBoard getGameBoard() {
                return null;
            }
        };
        // Create view, passing output and input streams
        SnakeView view = new SnakeGameView(System.out, System.in) {
            @Override
            public void renderGameBoard(GameBoard gameBoard) {
                
            }

            @Override
            public void displayGameOver() {

            }

            @Override
            public Direction getUserInput() {
                return null;
            }
        };
        // Create controller and start the game
        SnakeGameController controller = new SnakeGameController(model, view);
        controller.startGame();
    }
}
