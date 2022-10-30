package Frankfurt.Katis.Week1;

import java.util.Scanner;

public class Stuck_In_A_Time_Loop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int counter = 1;
		for (int i = 0; i < n; i++) {
            System.out.println(counter + " Abracadabra");
            counter++;
		}
		sc.close();
	}
}