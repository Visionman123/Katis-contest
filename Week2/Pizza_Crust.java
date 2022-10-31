package Frankfurt.Katis.Week2;

import java.util.Scanner;

public class Pizza_Crust {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double r = sc.nextInt();
    double c = sc.nextInt();

    System.out.println((r - c) * (r - c) / (r * r) * 100);
    sc.close();
  }
}

