package Frankfurt.Katis.Week3;

import java.util.Scanner;

public class Heliocentric {

    public static void main(String[] main) {

        Scanner sc = new Scanner(System.in);

        // int e = 0;
        // int m = 0;

        // for (int cases = 1; cases <= 10; cases++) { // why this? this will make you run 10 times

        //     e = sc.nextInt();
        //     m = sc.nextInt();

        //     if (e <= 365 || m >= 687)
        //         System.exit(-1); // this code is useless because the exercise will never have this input

        //     for (int counter = 0; counter < 250755; counter++) {
        //     if (e == 365)
        //     e = 0;
        //     if (m == 687)
        //     m = 0;

        //     if (e == 0 && m == 0) {
        //     System.out.println("Case " + cases + ": " + counter);
        //     break;
        //     } else {
        //     m++;
        //     e++;
        //     }
        //     }

        // }

        int cases = 1; // usually we created at 0, but this time we create = 1 because it fit with the print command (case 1, case 2,...)

        while (sc.hasNextInt()) {
            System.out.print("Case " + cases + ": ");

            int e = sc.nextInt();
            int m = sc.nextInt();
            int days = 0;

            while (e != 0 || m != 0) { // if both = 0 => done. if not, continue calculate
                e = (e + 1) % 365;
                m = (m + 1) % 687;
                days++;
            }

            System.out.println(days);
            cases++;
        }

        sc.close();

    }

}