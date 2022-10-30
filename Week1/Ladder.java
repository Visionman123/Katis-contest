package Frankfurt.Katis.Week1;

import java.util.Scanner;

public class Ladder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println((int) Math.ceil(sc.nextDouble() / Math.sin(Math.toRadians(sc.nextDouble()))));
        sc.close();
    }
    
}
