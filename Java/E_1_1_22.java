
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import java.util.Arrays;
public class E_1_1_22 {
    public static void main(String[] args) {
        int[] whilitelist = In.readInts(args[0]);
        Arrays.sort(whilitelist);
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (rank(key, whilitelist) == -1)
                StdOut.println(key);
        }
    }

    private static int rank(int key, int[] a) {
        return rank(key, a, 0, a.length - 1, 0);
    }

    private static int rank(int key, int[] a, int lo, int hi, int deepth) {
        for (int i = 0; i < deepth; i++) {
            StdOut.print("\t");
        }
        StdOut.printf("%4d %4d\n", lo, hi);
        if (lo > hi)
            return -1;
        int mid = lo + (hi - lo) / 2;
        if (key < a[mid])
            return rank(key, a, lo, mid - 1, deepth + 1);
        else if (key > a[mid])
            return rank(key, a, mid + 1, hi, deepth + 1);
        else
            return mid;
    }
}