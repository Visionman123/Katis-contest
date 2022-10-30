package Frankfurt.Katis;

import java.util.Scanner;

public class Jabuke {

    static double area(int xa, int ya, int xb, int yb, int xc, int yc) {
        double result = ((double)Math.abs((xa*(yb-yc) + xb*(yc-ya) + xc*(ya-yb))))/2;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input coordinates of the vertices of the triangle.
        int Ax,Bx,Cx,Ay,By,Cy;
        Ax = sc.nextInt();
        Ay = sc.nextInt();
        Bx = sc.nextInt();
        By = sc.nextInt();
        Cx = sc.nextInt();
        Cy = sc.nextInt();
        double area = area(Ax,Ay,Bx,By,Cx,Cy); 

        
        int Apple_tree = sc.nextInt(); //number of tree 
        int Num_point = 0;
        int tree_num1, tree_num2;
        // Input pair of positive num
        for (int i = 0; i < Apple_tree; i++) {
            tree_num1 = sc.nextInt(); // <= 60
            tree_num2 = sc.nextInt(); // <= 3600
            if(Math.abs(area - area(Ax,Ay,Bx,By,tree_num1,tree_num2) - area(Ax,Ay,Cx,Cy,tree_num1,tree_num2) - area(Bx,By,Cx,Cy,tree_num1,tree_num2)) < 0.1){
                Num_point = Num_point + 1;
            }
        }

        System.out.format("%.1f\n", area);
        System.out.println(Num_point);

        sc.close();

    }
}
