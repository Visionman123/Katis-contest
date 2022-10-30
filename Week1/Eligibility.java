package Frankfurt.Katis.Week1;

import java.util.Scanner;

public class Eligibility {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int cases = Integer.parseInt(sc.nextLine());
    for (int i = 0; i < cases; i++) {
      String[] line = sc.nextLine().split(" ");
      int postDate = Integer.parseInt(line[1].split("/")[0]);
      int birth = Integer.parseInt(line[2].split("/")[0]);

      String eligibility = postDate >= 2010 || birth >= 1991 ? "eligible" :
          Integer.parseInt(line[3]) > 40 ? "ineligible" : "coach petitions";
      System.out.println(line[0] + " " + eligibility);
    }
    sc.close();
  }
}
