package Frankfurt.Katis.Week2;

import java.util.Scanner;

public class Quick_Estimates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Only need to count lenght of String
        int cases = Integer.parseInt(sc.nextLine()); //Input number of case
        
        for (int i = 0; i < cases; i++) {
            System.out.println(sc.nextLine().length()); // length of string 
        }
        sc.close();
    }
}
