import edu.princeton.cs.algs4.*;

public class E_1_1_13 {
    public static void main(String[] args) {
        int N = StdIn.readInt();
        int[][] table = new int[N][N];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = StdRandom.uniform(10);
            }
        }
        printTalbe(table);
        revTable(table);
        StdOut.println();
        printTalbe(table);

    }

    private static void printTalbe(int[][] table) {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                StdOut.print(" " + table[i][j] + " ");
            }
            StdOut.println();
        }
    }

    private static void revTable(int[][] table) {
        int temp;
        for (int i = 0; i < table.length; i++) {
            for (int j = i; j < table[i].length; j++) {
                temp = table[i][j];
                table[i][j] = table[j][i];
                table[j][i] = temp;
            }
        }

    }
}