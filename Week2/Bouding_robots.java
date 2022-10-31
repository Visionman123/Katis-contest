package Frankfurt.Katis.Week2;

import java.util.*;

public class Bouding_robots {
    // room description w = width, l = lenght; [2,100]
    // x is one of u, d, l, or r (for up, down, left, or right, respectively)
    // y is number of meters to move in that direction (in the range [0,30])
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int x = sc.nextInt(), y = sc.nextInt();

            if (x == 0 && y == 0) {
                break;
            } // End case

            int ax = 0, ay = 0, rx = 0, ry = 0;
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                String dir = sc.next();
                int dis = sc.nextInt();
                if (dir.equals("u")) {
                    ry += dis;
                    ay += dis;
                    if (ay >= y) {
                        ay = y - 1;
                    }
                } else if (dir.equals("d")) {
                    ry -= dis;
                    ay -= dis;
                    if (ay < 0) {
                        ay = 0;
                    }
                } else if (dir.equals("r")) {
                    rx += dis;
                    ax += dis;
                    if (ax >= x) {
                        ax = x - 1;
                    }
                } else if (dir.equals("l")) {
                    rx -= dis;
                    ax -= dis;
                    if (ax < 0) {
                        ax = 0;
                    }
                }
            }
            System.out.println("Robot thinks " + rx + " " + ry);
            System.out.println("Actually at " + ax + " " + ay + "\n");
        }
        sc.close();
    }
}
