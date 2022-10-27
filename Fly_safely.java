package Frankfurt.Katis;

import java.util.Scanner;

public class Fly_safely {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int cases = Integer.parseInt(sc.nextLine());
    for (int i = 0; i < cases; i++) {
      String[] line = sc.nextLine().split(" ");
      int cities = Integer.parseInt(line[0]);
      int pilots = Integer.parseInt(line[1]);
      for (int j = 0; j < pilots; j++) {
        sc.nextLine();
      }
      int ans = pilots < cities? pilots : cities -1;
      System.out.println(ans);
      sc.close();
    }
  }
}
    
