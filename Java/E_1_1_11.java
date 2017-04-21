import edu.princeton.cs.algs4.*;

public class E_1_1_11 {
    public static void main(String[] args) {
        int a = StdIn.readInt();
        int b = StdIn.readInt();
        boolean[][] table = new boolean[a][b];
        initial(table);
        StdOut.print("++");
        for (int i = 0; i < b; i++) {
            StdOut.printf(" %2d ", i);
        }
        StdOut.println();
        for (int i = 0; i < table.length; i++) {
            StdOut.printf("%2d", i);
            for (int j = 0; j < b; j++) {
                StdOut.printf(" %2s ", trans(table[i][j]));
            }
            StdOut.println();
        }

    }

    private static boolean[][] initial(boolean[][] table) {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = StdRandom.bernoulli();
            }
        }
        return table;
    }

    private static String trans(boolean a) {
        if (a)
            return "*";
        else
            return "-";
    }

}