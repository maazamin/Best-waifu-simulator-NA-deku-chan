//Scenario: You are a high school student and your teacher was not present today so you have a substitute. Well you
//finished all the work abd now you have nothing to do, so you decide to play tic tac toe with your friends.
import java.util.Scanner;

public class ticTacToe{
    public static final int EMPTY = 0;
    public static final int CROSS = 1;
    public static final int CIRCLE = 2;

    public static final int PLAYING = 0;
    public static final int DRAW = 1;
    public static final int CROSS_WINS = 2;
    public static final int CIRCLE_WINS = 3;

    public static final int Rows = 3, Columns = 3; // number of rows/columns
    public static int[][] board = new int[Rows][Columns]; // game in 2D array
    public static int currentStatus;  // current state of the game
    public static int current_Player; // current player (CROSS or CIRCLE)
    public static int currentRow, currentColumn; // current seed's row and column

    public static Scanner in = new Scanner(System.in);
    public void Startup() {
        initGame();
        do {
            playerMove(current_Player); // update currentRow/currentColumn
            updateGame(current_Player, currentRow, currentColumn); // update the current Status
            printBoard();
            if (currentStatus == CROSS_WINS) {
                System.out.println("'X' WON!");
            } else if (currentStatus == CIRCLE_WINS) {
                System.out.println("'O' WON!");
            } else if (currentStatus == DRAW) {
                System.out.println("It's a TIE! ");
            }
            // Switch player
            current_Player = (current_Player == CROSS) ? CIRCLE : CROSS;
        } while (currentStatus == PLAYING); // repeat if the game is not over
    }

    public static void initGame() {
        for (int row = 0; row < Rows; ++row) {
            for (int col = 0; col < Columns; ++col) {
                board[row][col] = EMPTY; //cells empty
            }
        }
        currentStatus = PLAYING;
        current_Player = CROSS; // cross goes first
    }

    public static void playerMove(int Seed) {
        boolean validInput = false;  // input validation
        do {
            if (Seed == CROSS) {
                System.out.print("Player 'X', enter move (row[1-3] column[1-3]): ");
            } else {
                System.out.print("Player 'O', enter move (row[1-3] column[1-3]): ");
            }
            int row = in.nextInt() - 1;
            int col = in.nextInt() - 1;
            if (row >= 0 && row < Rows && col >= 0 && col < Columns && board[row][col] == EMPTY) {
                currentRow = row;
                currentColumn = col;
                board[currentRow][currentColumn] = Seed;  // update game-board content
                validInput = true;  // if input is okay please exit the loop
            } else {
                System.out.println("This move at (" + (row + 1) + "," + (col + 1)
                        + ") is invalid. Please try again...");
            }
        } while (!validInput);  // repeat until input is valid
    }

    public static void updateGame(int Seed, int currentRow, int currentCol) {
        if (hasWon(Seed, currentRow, currentCol)) {  // check if winning move
            currentStatus = (Seed == CROSS) ? CROSS_WINS : CIRCLE_WINS;
        } else if (isDraw()) {  // check for draw
            currentStatus = DRAW;
        }
    }
    public static boolean isDraw() {
        for (int row = 0; row < Rows; ++row) {
            for (int col = 0; col < Columns; ++col) {
                if (board[row][col] == EMPTY) {
                    return false;  // an empty cell found, not draw, exit
                }
            }
        }
        return true;  // no empty cell, it's a tie
    }
    public static boolean hasWon(int Seed, int currentRow, int currentColumn) {
        return (board[currentRow][0] == Seed     // 3-in-the-row
                && board[currentRow][1] == Seed
                && board[currentRow][2] == Seed
                || board[0][currentColumn] == Seed   // 3-in-the-column
                && board[1][currentColumn] == Seed
                && board[2][currentColumn] == Seed
                || currentRow == currentColumn     // 3in a diagonal
                && board[0][0] == Seed
                && board[1][1] == Seed
                && board[2][2] == Seed
                || currentRow + currentColumn == 2  // 3-in the opposite diagonal
                && board[0][2] == Seed
                && board[1][1] == Seed
                && board[2][0] == Seed);
    }

    public static void printBoard() {
        for (int row = 0; row < Rows; ++row) {
            for (int col = 0; col < Columns; ++col) {
                printCell(board[row][col]); // print each cell
                if (col != Columns - 1) {
                    System.out.print("|");   // print vertical
                }
            }
            System.out.println();
            if (row != Rows - 1) {
                System.out.println("-----------"); // print horizontal
            }
        }
        System.out.println();
    }

    public static void printCell(int content) {
        switch (content) {
            case EMPTY:
                System.out.print("   ");
                break;
            case CIRCLE:
                System.out.print(" O ");
                break;
            case CROSS:
                System.out.print(" X ");
                break;
        }
    }
}