package Frankfurt.Katis.Week2;

import java.util.Scanner;

public class Hissing_Microphone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean cond = false;
        // Use while because it may have more than ss
        while (sc.hasNextLine()) {
            String input = sc.nextLine();
            if (input.contains("ss")) {
                cond = true;
                break;
            }
        }

        // if loops for output
		if (!cond){
			System.out.print("no ");
		}
		System.out.println("hiss");

        sc.close();
    }
}
