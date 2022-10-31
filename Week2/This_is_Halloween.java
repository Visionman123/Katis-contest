package Frankfurt.Katis.Week2;

import java.util.Scanner;

public class This_is_Halloween {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String date = sc.nextLine();

        if (date.equals("OCT 31") || date.equals("DEC 25")) {
            System.out.print("yup");
        } else {
            System.out.print("nope");
        }

        sc.close();
    }
}
