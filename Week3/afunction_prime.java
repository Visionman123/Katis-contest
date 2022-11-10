package Frankfurt.Katis.Week3;

public class afunction_prime {

    public static boolean isPrime1(int x) {
		if(x == 2)
			return true; 
            // Prime number is only can devided itseft and 1
		for (int i = 2; i <= (int)Math.sqrt(x); i++) {
			if (x % i == 0) {
				return false;
			}
		}
		return true;
	}

    private static boolean isPrime2(int a) { // check prime number
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
}
