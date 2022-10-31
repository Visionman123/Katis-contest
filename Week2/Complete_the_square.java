package Frankfurt.Katis.Week2;

import java.util.Scanner;

public class Complete_the_square {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        double d1 = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        double d2 = Math.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2));

        int[] start = new int[100];
        int[] other = new int[100];

        if (d1 > d2) {
            start[1] = x3;
            start[2] = y3;

            other[0] = x1;
            other[1] = y1;
            other[2] = x2;
            other[3] = y2;

        } else if (d2 > d1) {
            start[1] = x1;
            start[2] = y1;

            other[0] = x3;
            other[1] = y3;
            other[2] = x2;
            other[3] = y2;

        } else {
            start[1] = x2;
            start[2] = y2;

            other[0] = x3;
            other[1] = y3;
            other[2] = x1;
            other[3] = y1;
        }

        double num1 = ((other[0] + other[2]) / 2.0);
        double num2 = ((other[1] + other[3]) / 2.0);
        double x = 2 * (double) Math.abs(start[1] - num1);
        double y = 2 * (double) Math.abs(start[2] - num2);
        start[1] += num1 >= start[1] ? x : -x;
        start[2] += num2 >= start[2] ? y : -y;

        System.out.println(start[1] + " " + start[2]);
        sc.close();
    }

}
