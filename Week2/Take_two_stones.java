package Frankfurt.Katis.Week2;

import java.util.Scanner;

public class Take_two_stones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("Bob");
        } else {
            System.out.println("Alice");
        }
        sc.close();
    }
}
