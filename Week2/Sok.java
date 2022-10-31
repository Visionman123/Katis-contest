package Frankfurt.Katis.Week2;

import java.util.Scanner;

public class Sok {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A = sc.nextInt();
        double B = sc.nextInt();
        double C = sc.nextInt();

        double I = sc.nextInt();
        double J = sc.nextInt();
        double K = sc.nextInt();

        double ratio1 = A/I;
        double ratio2 = B/J;
        double ratio3 = C/K;

        double cocktailsMade = (ratio1 < ratio2 && ratio1 < ratio3) ? ratio1 : (ratio2 < ratio3) ? ratio2 : ratio3;
        System.out.println((A - I * cocktailsMade) + " " + (B - J * cocktailsMade) + " " + (C - K * cocktailsMade));

        sc.close();
    }
}
