package Frankfurt.Katis.Week2;

import java.util.Scanner;

public class Paul_Eigon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int turns = sc.nextInt() + sc.nextInt();

        // When N and turn is even num => Paul turn
        if (turns / N % 2 == 0) { 
            System.out.println("paul");
        } else {
            System.out.println("opponent");
        }
        sc.close();
    }
}
