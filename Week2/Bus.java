package Frankfurt.Katis.Week2;

import java.util.Scanner;

public class Bus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for(int i = 0; i < cases; i++){
            int num_stop = sc.nextInt();
            System.out.println((int)Math.pow(2,num_stop)-1);
        }

        sc.close();
    }
}
