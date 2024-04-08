/**
 * Represents the Tic Tac Toe game model.
 */
public interface TicTacToeModel {

    /**
     * Represents a player in the Tic Tac Toe game.
     */
    enum Player {
        X, O
    }

    /**
     * Gets the current player who should make the next move.
     *
     * @return the current player
     */
    Player getCurrentPlayer();

    /**
     * Makes a move at the specified position for the current player.
     *
     * @param row    the row index of the move
     * @param column the column index of the move
     * @throws IllegalArgumentException if the position is out of bounds
     * @throws IllegalStateException    if the game is already over
     */
    void makeMove(int row, int column);

    /**
     * Gets the player who has won the game, if any.
     *
     * @return the player who has won, or null if the game is not yet over or ended in a draw
     */
    Player getWinner();

    /**
     * Checks if the game has ended in a draw.
     *
     * @return true if the game is a draw, false otherwise
     */
    boolean isDraw();

    /**
     * Gets the player at the specified position on the board.
     *
     * @param row    the row index of the position
     * @param column the column index of the position
     * @return the player at the specified position, or null if the position is empty
     * @throws IllegalArgumentException if the position is out of bounds
     */
    Player getPlayerAt(int row, int column);

    /**
     * Checks if the game is over (either a player has won or it's a draw).
     *
     * @return true if the game is over, false otherwise
     */
    boolean isGameOver();

    /**
     * Resets the game to its initial state.
     */
    void reset();
}
