package Frankfurt.Katis.Week2;

import java.util.Scanner;

public class Number_Fun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder result = new StringBuilder(); 
        int cases = Integer.parseInt(sc.nextLine()); //input case

        for (int i = 0; i < cases; i++) {
            float int1 = sc.nextInt();
            float int2 = sc.nextInt();
            float int3 = sc.nextInt();

            int possibles = 0;
            if (int2 + int1 == int3) {
                possibles++;
            }
            if (int2 - int1 == int3) {
                possibles++;
            }
            if (int2 * int1 == int3) {
                possibles++;
            }
            if (int2 / int1 == int3) {
                possibles++;
            }
            if (int1 + int2 == int3) {
                possibles++;
            }
            if (int1 - int2 == int3) {
                possibles++;
            }
            if (int1 * int2 == int3) {
                possibles++;
            }
            if (int1 / int2 == int3) {
                possibles++;
            }
            result.append(possibles > 0 ? "Possible\n" : "Impossible\n");
        }

        System.out.println(result);
        sc.close();
    }

}
