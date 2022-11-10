package Frankfurt.Katis.Week3;

import java.util.*;
import java.util.BitSet;

public class primesieve {

    // public static boolean isPrime(int a) { // check prime number
    // if (a < 2)
    // return false;
    // else if (a == 2 || a == 3)
    // return true;
    // else if (a % 2 == 0 || a % 3 == 0)
    // return false;
    // else {
    // int sqrt = (int) Math.sqrt(a) + 1;
    // for (int x = 6; x <= sqrt; x += 6)
    // if (a % (x + 1) == 0 || a % (x - 1) == 0)
    // return false;
    // return true;
    // }
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);

    // int n = sc.nextInt();
    // int q = sc.nextInt();

    // int primenum[] = new int[20000];
    // int count = 0;

    // for (int i = 0; i <= n; i++) {
    // if (isPrime(i)) {
    // primenum[count] = i;
    // count++;
    // }
    // }
    // System.out.println(count);

    // for (int i = 0; i < q; i++) {
    // int checknum = sc.nextInt();
    // System.out.println((Arrays.stream(primenum).anyMatch(x -> x == checknum)) ?
    // "1" : "0");
    // }
    // sc.close();
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();

        BitSet sieve;
        int numPrimes;

        sieve = new BitSet(n); // sieve[i - 1] = true -> i is prime, 0 otherwise
        sieve.set(1, n, true); // 1 not prime, therefore sieve[0] = false
        numPrimes = n - 1; // count primes backwards

        // Sieve
        for (int p = 2; p <= (int) Math.ceil(Math.sqrt(n)); p++) {
            // Cross out only if p is prime
            if (sieve.get(p - 1)) {
                for (int j = p * p; j <= n; j += p) {
                    if (sieve.get(j - 1)) {
                        // Count primes backwards, no need for extra loop
                        numPrimes--;
                    }
                    sieve.set(j - 1, false);
                }
            }
        }
        System.out.println(numPrimes);

        for (int i = 0; i < q; i++) {
            int checknum = sc.nextInt();
            System.out.println(sieve.get(checknum - 1) ? 1 : 0);
        }

        sc.close();

    }
}
