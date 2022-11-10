package Frankfurt.Katis.Week3;

import java.util.ArrayList;
import java.util.Scanner;

public class primematrix {

    private static boolean isPrime(int a) { // like others
        if (a < 2)
            return false;
        else if (a == 2 || a == 3)
            return true;
        else if (a % 2 == 0 || a % 3 == 0)
            return false;
        else {
            int sqrt = (int) Math.sqrt(a) + 1;
            for (int x = 6; x <= sqrt; x += 6)
                if (a % (x + 1) == 0 || a % (x - 1) == 0)
                    return false;
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int limit = sc.nextInt(); // n x n matrix

        if (size > limit) {// everynumber must be random
            System.out.println("impossible"); // no such matrix exists
        } else {
            ArrayList<Integer> nums = new ArrayList<>(size);

            for (int x = 0; x < size; x++) {
                nums.add(x + 1);
            } // Insert List (0,1,2,...)

            int sum = 0;
            for (int s : nums) {
                sum += s;
            } // sum all value

            int i = nums.size() - 1;

            checkPrime: while (!isPrime(sum)) {
                while (nums.get(i) == limit) {
                    i--;
                    limit--;
                    if (i == -1) // last case
                        break checkPrime;
                } //count how many number is not prime

                nums.add(i, nums.remove(i) + 1);
                
                sum = 0; //reset
                for (int s : nums)
                    sum += s;
            }
            if (i == -1)
                System.out.println("impossible");
            else {
                for (int x = 0; x < size; x++) {
                    for (int s = 0; s < size; s++)
                        System.out.print(nums.get(s) + " ");
                    System.out.println();
                    nums.add(nums.remove(0));
                }
            }
        }
        sc.close();
    }

}