package Frankfurt.Katis.Week4;

import java.util.*;

public class IBeenEverywhereMan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int n = sc.nextInt();

            ArrayList<String> cities = new ArrayList<String>();

            int j = 0;
            int number_of_city = 0;
            while (j < n+1) {
                String city = sc.nextLine();

                if (!cities.contains(city)) {
                    cities.add(city);
                    number_of_city++;
                }

                j++;
            }
            System.out.print(number_of_city-1 + "\n");
        }
        sc.close();
    }
}
