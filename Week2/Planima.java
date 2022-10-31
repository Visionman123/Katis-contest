package Frankfurt.Katis.Week2;

import java.util.*;

public class Planima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println(((int) ((Math.sqrt(Math.pow(4, i)) + 1) * (Math.sqrt(Math.pow(4, i)) + 1))));
        sc.close();
    }
}
