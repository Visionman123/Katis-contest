package Frankfurt.Katis.Week4;

import java.util.*;

public class Alphabet_spam {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        double whitespace = 0;
        double lowercase = 0;
        double uppercase = 0;
        double symbols = 0;
        for (int i = 0; i < line.length(); i++) {
            char curr = line.charAt(i);
            if (curr == '_')
                whitespace++;
            else if (curr >= 'A' && curr <= 'Z')
                uppercase++;
            else if (curr >= 'a' && curr <= 'z')
                lowercase++;
            else
                symbols++;
        }
        System.out.println(
                whitespace / line.length() + System.lineSeparator() + lowercase / line.length() + System.lineSeparator()
                        + uppercase / line.length() + System.lineSeparator() + symbols / line.length()); //ASCII codes
        sc.close();
    }
}
