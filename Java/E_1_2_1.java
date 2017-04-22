
import edu.princeton.cs.algs4.*;

public class E_1_2_1 {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);

        StdDraw.setCanvasSize(600, 600);
        StdDraw.setXscale(0, 100);
        StdDraw.setYscale(0, 100);
        StdDraw.setPenRadius(.005);

        Point2D[] points = new Point2D[N];

        for (int i = 0; i < N; i++) {
            int x = StdRandom.uniform(100);
            int y = StdRandom.uniform(100);
            StdOut.printf("%d %d\n", x, y);
            points[i] = new Point2D(x, y);
            points[i].draw();
        }

        double min = Double.MAX_VALUE;
        double[][] distance = new double[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                distance[i][j] = distance[j][i] = HowLong(points[i], points[j]);
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                StdOut.printf("%10.2f", distance[i][j]);
                if (distance[i][j] != 0 && distance[i][j] < min) {
                    min = distance[i][j];
                }
            }
            StdOut.println();
        }

        StdOut.printf("The min distance is %.2f", min);

    }

    private static double HowLong(Point2D a, Point2D b) {
        return Math.sqrt(Math.abs(a.x() - b.x()) + Math.abs(a.y() - b.y()));
    }

}