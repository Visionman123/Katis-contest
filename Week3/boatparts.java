package Frankfurt.Katis.Week3;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import java.util.HashSet;

public class boatparts {

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        // int p = sc.nextInt(); // the number of parts
        // int n = sc.nextInt(); // the number of days

        // List<String> teile = new ArrayList<String>();
        // for (int day = 1; day < n; day++) {
        // teile.add(sc.next());
        // }

        // sc.close();

        // List<String> teileUnique = new ArrayList<String>();
        // for (String teil : teile) {
        // if (!teileUnique.contains(teil)) {
        // teileUnique.add(teil);
        // }
        // if (teileUnique.size() == p) {
        // System.out.println(teile.indexOf(teil) + 1);
        // System.exit(0);
        // ;
        // }

        // }
        // System.out.print("paradox avoided");

        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split(" ");
        int parts = Integer.parseInt(line[0]);
        int days = Integer.parseInt(line[1]);

        HashSet<String> hs = new HashSet<>();
        for (int i = 0; i < days; i++) {
            String currLn = sc.nextLine();
            hs.add(currLn);
            if (hs.size() == parts) {
                System.out.println(i + 1);
                break;
            }
            if (i == days - 1) {
                System.out.println("paradox avoided");
            }
        }
        sc.close();
    }
}
