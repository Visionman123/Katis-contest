package Frankfurt.Katis.Week4;

import java.util.Scanner;

public class CryptographersConundrum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] characters = sc.nextLine().split("");

        int counter = 0;
        
        for (int i = 0; i < characters.length; i++) {
            if (characters[i].compareTo("P") != 0) {
                counter++;
            }
            if (characters[i + 1].compareTo("E") != 0) {
                counter++;
            }
            if (characters[i + 2].compareTo("R") != 0) {
                counter++;
            }
            i += 2;
        }

        System.out.println(counter);
        sc.close();
    }

}
