package Frankfurt.Katis.Week2;

import java.util.Scanner;

public class JewelryBox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int boxes = sc.nextInt();

        for (int i = 0; i < boxes; i++) {
            double x = sc.nextInt();
            double y = sc.nextInt();
            
            double h = (y + x - Math.sqrt((y+x) * (y+x) - 3 * x * y)) / 6;
            double result = (x - 2 * h) * (y - 2 * h) * h;

            System.out.println(result);
        }

        sc.close();
    }
}
