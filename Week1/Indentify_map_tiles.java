package Frankfurt.Katis.Week1;

import java.util.Scanner;

public class Indentify_map_tiles {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    int level = input.length(); // ex: lever 3 have xxx
    int x = 0, y = 0;
    
    for (int i = input.length()-1; i >= 0; i--) {
      switch (input.charAt(i)) {
        case '1':
          x += Math.pow(2, level-i-1); //level - (i + 1)) * 2 == 0? 1 : (level - (i + 1)) * 2 ;
          break;
        case '2':
          y += Math.pow(2, level-i-1); //level - (i + 1)) * 2 == 0? 1 : (level - (i + 1)) * 2 ;
          break;
        case '3':
          x += Math.pow(2, level-i-1); //level - (i + 1)) * 2 == 0? 1 : (level - (i + 1)) * 2 ;
          y += Math.pow(2, level-i-1); //level - (i + 1)) * 2 == 0? 1 : (level - (i + 1)) * 2 ;
          break;
        default:
          break;
      }
    }
    System.out.printf("%d %d %d", level, x, y);
    sc.close();
  }
}
