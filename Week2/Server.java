package Frankfurt.Katis.Week2;

import java.util.Scanner;

public class Server {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] firstLn = sc.nextLine().split(" ");
        int n = Integer.parseInt(firstLn[0]);
        int T = Integer.parseInt(firstLn[1]);

        String[] data = sc.nextLine().split(" ");

        int Total_time = 0;
        int Num_of_task = 0;

        for (int i = 0; i < n; i++) {
            int time = Integer.parseInt(data[i]);

            if (Total_time + time <= T) {
                Total_time += time;
                Num_of_task++;
            } else break;
        }
        System.out.println(Num_of_task);

        sc.close();
    }
}