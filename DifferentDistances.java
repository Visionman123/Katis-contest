package Frankfurt.Katis;

import java.util.Scanner;

public class DifferentDistances {
    public static void main(String[] args) {
        double x1, x2, y1, y2, p, absx, absy, sum;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 1000; i++) {
            x1 = sc.nextDouble();
            if (x1 == 0)
                break;
            y1 = sc.nextDouble();
            x2 = sc.nextDouble();
            y2 = sc.nextDouble();
            p = sc.nextDouble();
            absx = x1 - x2 > 0 ? x1 - x2 : x2 - x1;
            absy = y1 - y2 > 0 ? y1 - y2 : y2 - y1;
            sum = Math.pow(absx, p) + Math.pow(absy, p);
            System.out.println(Math.pow(sum, (1 / p)));
        }
        sc.close();
    }
}
