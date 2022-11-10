package Frankfurt.Katis.Week3;

import java.io.*; 

public class goldbachsconjecture {

    //searching for 2 prime numbers and save in to string
	public static String[] Goldbach(int x) {
		String s[] = new String[2]; 
		String t = ""; 

		int count = 0; 
		for (int i = 2; i <= x / 2; i++) { //spit number by 2 -> run from 1 -> middle number
			if (isPrime(i) && isPrime(x - i)) {
				//System.out.println(i + "+" + (x - i));
				t += (i + "+" + (x - i) +"\n"); 
				count++; 
			}
		}

		Integer c = count;
		s[0] = c.toString();
		s[1] = t; 
		return s;
	}

    //check the number isPrime or not
	public static boolean isPrime(int x) {
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

    public static void main (String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine()); 

		for(int k = 0; k<n; k++){
			int x = Integer.parseInt(br.readLine());

			String[] ans = Goldbach(x); 

			System.out.println(x + " has "+ ans[0] +" representation(s)"); 
			System.out.print(ans[1]); 
			System.out.println(); 
		}
	}

} 

