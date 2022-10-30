package Frankfurt.Katis.Week2;

import java.util.Scanner;

public class Grass_seed {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double costPerSQMeter = Double.parseDouble(sc.nextLine()); //the cost of seed to sow one square metre of lawn.
        int lawns = Integer.parseInt(sc.nextLine()); //the number of lawns to sow. --> number of line

        double total= 0;
        for(int i = 0; i < lawns; i++){
            String[] split = sc.nextLine().split(" "); // pair of two positive numbers
            total += (costPerSQMeter * (Double.parseDouble(split[0]) * Double.parseDouble(split[1])));
        }

        System.out.println(total);
        sc.close();
    }
}
    
