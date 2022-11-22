package Frankfurt.Katis.Week4;

import java.util.*;

public class ScalingRecipies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int result = a*y/x;
            System.out.println(result);
        }
        sc.close();
    }
}
