import edu.princeton.cs.algs4.*;

public class E_1_1_9 {
    public static void main(String[] args) {
        // int[] a;
        // for(int i = 0 ; i<10;i++)
        //     a[i]=i*i;
        int N = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]); // 十进制到十以下进制的转换
        String s = "";
        for (int n = N; n > 0; n /= 2) {
            s = (n % k) + s;
        }
        StdOut.println(s);
    }
}