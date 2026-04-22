import java.util.Scanner;

public class TicTacToe {

    static char[][] board = new char[3][3];

    // Initialize board
    static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    // Display board
    static void displayBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    // Place move (UC6)
    static boolean placeMove(int row, int col, char player) {
        if (row >= 0 && row < 3 && col >= 0 && col < 3) {
            if (board[row][col] == ' ') {
                board[row][col] = player;
                return true;
            } else {
                System.out.println("Cell already taken!");
                return false;
            }
        } else {
            System.out.println("Invalid position!");
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char player = 'X';

        initializeBoard();

        while (true) {
            displayBoard();

            System.out.println("Player " + player + " enter row and column (0-2): ");
            int row = sc.nextInt();
            int col = sc.nextInt();

            if (placeMove(row, col, player)) {
                // Switch player
                player = (player == 'X') ? 'O' : 'X';
            }
        }
    }
}
