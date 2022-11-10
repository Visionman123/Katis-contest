package Frankfurt.Katis.Week3;

import java.util.Scanner;

public class arealchallenge {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double area=sc.nextLong();
		
		double side=(double)Math.sqrt(area);

		sc.close();
	
		double fance=4*side;
		System.out.print(fance);
	}
}

