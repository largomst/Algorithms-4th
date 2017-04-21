import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class E_1_1_20 {
    public static void main(String[] args) {
        int N = StdIn.readInt();
        StdOut.print(Math.log(factorial(N)));
    }

    private static long factorial(int n) {
        if (n == 1)
            return 1;
        else
            return factorial(n - 1) * n;
    }
}