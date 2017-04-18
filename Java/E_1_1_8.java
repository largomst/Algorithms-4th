import edu.princeton.cs.algs4.*;

public class E_1_1_8 {
    public static void main(String[] args) {
        StdOut.println('b');
        StdOut.println('b' + 'c');
        StdOut.println('a' + 4);
        // 此处的字符会被隐式转换为整型
        StdOut.println((char) ("a" + 4));
        // 此处的字符串会将后面的整型转化为字符串
        StdOut.println((char) ('a' + 4));
    }
}