package Frankfurt.Katis.Week3;

import java.util.*;

public class howmanydiggits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] dig = new double[1000001];
        for (int i = 1; i < 1000001; i++) {
            dig[i] = Math.log10(i) + dig[i - 1];
        } //run all cases

        //special cases
        dig[0] = 1;
        dig[1] = 1;

        //print out
        while (sc.hasNext()) {
            int n = sc.nextInt(); //size
            System.out.println((int) Math.ceil(dig[n])); //round number
        }
        sc.close();

    }
}