package Frankfurt.Katis.Week4;

import java.util.Scanner;

public class detailed_differences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++ ) {
            String line1 = sc.next();
            String line2 = sc.next();
            String output = "";

            for (int j = 0; j < line1.length(); j++) {
                if (line1.charAt(j) == line2.charAt(j)) {
                    output += ".";
                } else {
                    output += "*";
                }
            }
            
            System.out.println(line1);
            System.out.println(line2);
            System.out.println(output);
        }
        sc.close();
    }
}
