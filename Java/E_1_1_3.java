import edu.princeton.cs.algs4.*;

public class E_1_1_3 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        if (a == b && b == c && c == a) {
            StdOut.println("equal");
        } else {
            StdOut.println("not equal");

        }
    }
}