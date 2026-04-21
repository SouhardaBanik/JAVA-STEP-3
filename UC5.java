public class TicTacToe {
    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    public static void main(String[] args) {

        // Test cases
        System.out.println("Move (1,1): " + isValidMove(1, 1)); // true
        board[1][1] = 'X'; // occupy cell
        System.out.println("Move (1,1) again: " + isValidMove(1, 1)); // false
        System.out.println("Move (3,3): " + isValidMove(3, 3)); // false (out of bounds)
    }
    static boolean isValidMove(int row, int col) {
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }
        if (board[row][col] != '-') {
            return false;
        }
        return true;
    }
}
