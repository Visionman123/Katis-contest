package Frankfurt.Katis.Week1;

import java.util.Scanner;

public class Fly_safely {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int cases = Integer.parseInt(sc.nextLine());

    for (int i = 0; i < cases; i++) {
      // Input two space-separated integers
      String[] line = sc.nextLine().split(" "); 
      int cities = Integer.parseInt(line[0]);
      int pilots = Integer.parseInt(line[1]);

      // Input lines with two space-separated integers a and b
      for (int j = 0; j < pilots; j++) {
        sc.nextLine();
      }

      // Find the lease pilot
      int ans = pilots < cities? pilots : cities -1; //pilot = case - 1
      System.out.println(ans);
    }
    sc.close();
  }
}   
    
