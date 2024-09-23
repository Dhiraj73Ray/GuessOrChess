
public class ChessBoard {
    private ChessPiece[][] board; // 2D array representing the chessboard

    // Constructor to initialize the board
    public ChessBoard() {
        board = new ChessPiece[8][8];
        initializeBoard();
    }

    // Method to set up the pieces in their starting positions
    public void initializeBoard() {
        // Place black pieces (top of the board)
        board[0][0] = new Rook("Black", "a8");
        board[0][1] = new Knight("Black", "b8");
        board[0][2] = new Bishop("Black", "c8");
        board[0][3] = new Queen("Black", "d8");
        board[0][4] = new King("Black", "e8");
        board[0][5] = new Bishop("Black", "f8");
        board[0][6] = new Knight("Black", "g8");
        board[0][7] = new Rook("Black", "h8");

        // Place black pawns
        for (int col = 0; col < 8; col++) {
            board[1][col] = new Pawn("Black", (char) ('a' + col) + "7");
            // board[1][col] = new Pawn("Black", ('a' + col) + "7");
        }

        // Place white pieces (bottom of the board)
        board[7][0] = new Rook("White", "a1");
        board[7][1] = new Knight("White", "b1");
        board[7][2] = new Bishop("White", "c1");
        board[7][3] = new Queen("White", "d1");
        board[7][4] = new King("White", "e1");
        board[7][5] = new Bishop("White", "f1");
        board[7][6] = new Knight("White", "g1");
        board[7][7] = new Rook("White", "h1");

        // Place white pawns
        for (int col = 0; col < 8; col++) {
            board[6][col] = new Pawn("White", (char) ('a' + col) + "2");
        }

        // Empty rows 2 to 5
        for (int row = 2; row <= 5; row++) {
            for (int col = 0; col < 8; col++) {
                board[row][col] = null; // No piece at these positions initially
            }
        }
    }

    // Optional: A method to display the board in a simple text format for testing
    public void displayBoard() {
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                if (board[row][col] != null) {
                    System.out.print(board[row][col].getName() + " ");
                    // System.out.print(board[row][col].getName().charAt(0) + " ");
                } else {
                    System.out.print(".     ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ChessBoard disp = new ChessBoard();
        disp.displayBoard();
    }
}
