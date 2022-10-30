package Frankfurt.Katis.Week2;

import java.util.Scanner;

public class Parking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d, e, f, g, h, i;
        int[] cost = { 0, sc.nextInt(), sc.nextInt(), sc.nextInt() }; //Input A,B,C
        d = sc.nextInt();
        e = sc.nextInt();
        f = sc.nextInt();
        g = sc.nextInt();
        h = sc.nextInt();
        i = sc.nextInt();
        int curr = 0;
        int sum = 0;

        for (int j = 1; j < 100; j++) {

            if (j == d) // A arr
                curr++;
            if (j == f) // B arr
                curr++;
            if (j == h) // C arr
                curr++;

            if (j == e) // A dep
                curr--;
            if (j == g) // B def
                curr--;
            if (j == i) // C def
                curr--;
                
            sum += curr * cost[curr];
        }
        System.out.println(sum);

        sc.close();
    }
}
