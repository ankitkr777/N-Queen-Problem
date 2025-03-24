import java.util.Scanner;

public class NQueens {
    private int N;
    private int[][] board;

    public NQueens(int N) {
        this.N = N;
        board = new int[N][N];
    }

    private boolean isSafe(int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1) {
                return false;
            }
        }

        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        for (int i = row, j = col; i >= 0 && j < N; i--, j++) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    private boolean solveNQueens(int row) {
        if (row >= N) return true;

        for (int col = 0; col < N; col++) {
            if (isSafe(row, col)) {
                board[row][col] = 1;

                if (solveNQueens(row + 1)) {
                    return true;
                }

                board[row][col] = 0;
            }
        }
        return false;
    }

    public void solve() {
        if (solveNQueens(0)) {
            printSolution();
        } else {
            System.out.println("No solution exists for N = " + N);
        }
    }

    private void printSolution() {
        System.out.println("N-Queens Solution for N = " + N + ":");
        for (int[] row : board) {
            for (int cell : row) {
                System.out.print(cell == 1 ? " Q " : " . ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();
        scanner.close();

        NQueens solver = new NQueens(N);
        solver.solve();
    }
}

