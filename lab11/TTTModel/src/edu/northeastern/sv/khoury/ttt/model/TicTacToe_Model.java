package edu.northeastern.sv.khoury.ttt.model;
import java.util.Arrays;

/**
 * Implementation of the Tic Tac Toe game model.
 * This class represents the game logic and state management for a Tic Tac Toe game.
 * It allows players to make moves, checks for winners, determines if the game is a draw,
 * and resets the game board for a new game.
 */
public class TicTacToeModelImpl implements TicTacToe_Model {

    private static final int SIZE = 3; // Size of the Tic Tac Toe board
    private Player[][] board; // Representation of the Tic Tac Toe board
    private Player currentPlayer; // Current player

    /**
     * Constructs a new TicTacToeModelImpl object.
     * Initializes the game board and sets the starting player to 'X'.
     */
    public TicTacToeModelImpl() {
        board = new Player[SIZE][SIZE];
        currentPlayer = Player.X; // X starts the game
    }

    /**
     * Retrieves the current player.
     *
     * @return The current player ('X' or 'O').
     */
    @Override
    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    /**
     * Makes a move on the game board.
     * Places the current player's symbol at the specified position.
     * Switches the current player for the next turn.
     *
     * @param row The row index of the move (0-based).
     * @param column The column index of the move (0-based).
     * @throws IllegalArgumentException If the specified position is invalid.
     * @throws IllegalStateException If the specified position is already occupied.
     */
    @Override
    public void makeMove(int row, int column) {
        if (row < 0 || row >= SIZE || column < 0 || column >= SIZE) {
            throw new IllegalArgumentException("Invalid position");
        }
        if (board[row][column] != null) {
            throw new IllegalStateException("Position already occupied");
        }
        board[row][column] = currentPlayer;
        currentPlayer = (currentPlayer == Player.X) ? Player.O : Player.X; // Switch player
    }

    /**
     * Determines the winner of the game.
     *
     * @return The winning player ('X' or 'O'), or null if there is no winner yet.
     */
    @Override
    public Player getWinner() {
        // Check rows, columns, and diagonals for a winning sequence
        for (int i = 0; i < SIZE; i++) {
            // Check rows
            if (board[i][0] != null && board[i][0] == board[i][1] && board[i][0] == board[i][2]) {
                return board[i][0];
            }
            // Check columns
            if (board[0][i] != null && board[0][i] == board[1][i] && board[0][i] == board[2][i]) {
                return board[0][i];
            }
        }
        // Check diagonals
        if (board[0][0] != null && board[0][0] == board[1][1] && board[0][0] == board[2][2]) {
            return board[0][0];
        }
        if (board[0][2] != null && board[0][2] == board[1][1] && board[0][2] == board[2][0]) {
            return board[0][2];
        }
        return null; // No winner
    }

    /**
     * Checks if the game has ended in a draw.
     *
     * @return True if the game is a draw, false otherwise.
     */
    @Override
    public boolean isDraw() {
        // If all cells are occupied and there's no winner, it's a draw
        return Arrays.stream(board).allMatch(row -> Arrays.stream(row).allMatch(cell -> cell != null)) && getWinner() == null;
    }


    /**
     * Retrieves the player symbol at the specified position on the board.
     *
     * @param row The row index of the position (0-based).
     * @param column The column index of the position (0-based).
     * @return The player symbol ('X', 'O'), or null if the position is empty.
     * @throws IllegalArgumentException If the specified position is invalid.
     */
    @Override
    public Player getPlayerAt(int row, int column) {
        if (row < 0 || row >= SIZE || column < 0 || column >= SIZE) {
            throw new IllegalArgumentException("Invalid position");
        }
        return board[row][column];
    }

    /**
     * Checks if the game is over.
     *
     * @return True if the game is over (either a winner or a draw), false otherwise.
     */
    @Override
    public boolean isGameOver() {
        return getWinner() != null || isDraw();
    }

    /**
     * Resets the game board for a new game.
     * Clears all player symbols and resets the current player to 'X'.
     */
    @Override
    public void reset() {
        board = new Player[SIZE][SIZE];
        currentPlayer = Player.X; // X starts the game
    }
}
