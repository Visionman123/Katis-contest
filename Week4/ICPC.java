package Frankfurt.Katis.Week4;

import java.util.HashSet;
import java.util.Scanner;
import java.util.*;

public class ICPC {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        int limit = 0;

        //HashSet<String> value = new HashSet<>();
        ArrayList<String> value = new ArrayList<String>();

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            if (value.add(line.split(" ")[0]) && ++limit <= 12) { //If line[0] appear again, dont count
                System.out.println(line);
            }
        } 
        sc.close();
    }
}