package edu.northeastern.sv.khoury.ttt.controller;

import edu.northeastern.sv.khoury.ttt.model.TicTacToeModel;
import edu.northeastern.sv.khoury.ttt.view.TicTacToeView;

public class TicTacToeController {
    private TicTacToeModel model;
    private TicTacToeView view;

    public TicTacToeController(TicTacToeModel model, TicTacToeView view) {
        this.model = model;
        this.view = view;
    }

    public void startGame() {
        // Initialize the game
        model.initBoard();
        view.displayBoard(model.getBoard());

        // Main game loop
        while (!model.isGameOver()) {
            // Get player input
            int row = view.getRowFromPlayer();
            int col = view.getColFromPlayer();

            // Update the model
            model.makeMove(row, col);

            // Display updated board
            view.displayBoard(model.getBoard());
        }

        // Display game result
        view.displayResult(model.getWinner());
    }

    public static void main(String[] args) {
        TicTacToeModel model = new TicTacToeModel();
        TicTacToeView view = new TicTacToeView();
        TicTacToeController controller = new TicTacToeController(model, view);
        controller.startGame();
    }
}
