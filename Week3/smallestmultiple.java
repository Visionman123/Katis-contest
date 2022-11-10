package Frankfurt.Katis.Week3;

import java.util.*;
import java.math.*;

public class smallestmultiple {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            StringTokenizer token = new StringTokenizer(sc.nextLine(), " ");// split

            ArrayList<Integer> nums = new ArrayList<>();

            while (token.hasMoreTokens())
                nums.add(Integer.parseInt(token.nextToken()));

            BigInteger lcm = BigInteger.ONE;

            for (int x : nums)
                lcm = lcm.multiply(BigInteger.valueOf(x)).divide(lcm.gcd(BigInteger.valueOf(x)));

            System.out.println(lcm);
        }

        sc.close();
    }
}
