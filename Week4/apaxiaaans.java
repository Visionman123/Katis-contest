package Frankfurt.Katis.Week4;

import java.util.Scanner;

public class apaxiaaans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        String output = ""; // create NULL string

        // if the words appears 2 times -> dont care about it
        if (name.length() == 1)
            output = name; // special cases
        else {
            for (int i = 0; i < name.length() - 1; i++)
                if (name.charAt(i) != name.charAt(i + 1))
                    output += name.charAt(i);
            output += name.charAt(name.length() - 1);
        }

        System.out.println(output);
        sc.close();
    }
}
