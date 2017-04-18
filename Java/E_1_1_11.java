import edu.princeton.cs.algs4.*;

public class E_1_1_11 {
    public static void main(String[] args) {
        int N = 10;
        boolean[][] a = new boolean[N][N];
        a[4][4] = true;
        for (int j = 0; j < N; j++)
            StdOut.printf("%2d", j + 1);
        StdOut.println();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (a[i][j])
                    StdOut.print(" *");
                else
                    StdOut.print("  ");
            }
            StdOut.println();
        }
    }
}