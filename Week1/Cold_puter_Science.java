package Frankfurt.Katis.Week1;

import java.util.Scanner;

public class Cold_puter_Science {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOfTemperatures = sc.nextInt();
		int numberOfMinusZero = 0;
		for (int i = 0; i < numberOfTemperatures; i++) {
			if (sc.nextInt() < 0) {
				numberOfMinusZero++;
			}
		}
		System.out.println(numberOfMinusZero);
		sc.close();
	}

}