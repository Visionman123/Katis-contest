package Frankfurt.Katis;

import java.util.Scanner;

public class Just_a_Minute {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M, S;
        double real_min = 0;
        double sumM = 0;
        double sumS = 0;

        for (int i = 0; i < N; i++) {
            M = sc.nextInt(); // <= 60
            S = sc.nextInt(); // <= 3600
            sumM = sumM + M;
            sumS = sumS + S;
        }

        real_min = sumS / (sumM * 60);

        if (real_min <= 1) {
            System.out.print("measurement error");
        } else {
            System.out.print(real_min);
        }

        sc.close();
    }
}
