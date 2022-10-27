package Frankfurt.Katis;

import java.util.Scanner;

//a building (symbol ‘#’)
//a parked car (symbol ‘X’)
//a free parking space (symbol ‘.’)
// R =< 2 ; C =< 50

public class Cudoviste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int counters[] = {0,0,0,0,0};

        int row = sc.nextInt();
        int column = sc.nextInt();

        char[][] parking = new char[row][column];
        char[] inputarr = new char[100];

        // Input parking slots
        for (int i = 0; i < row; i++) {
            String input = sc.next();
            
            inputarr = input.toCharArray(); 
            for (int j = 0; j < column; j++) {
                parking[i][j] = (char)inputarr[j+1];
            }
        }

        for (int i = 0; i < row - 1; i++)
        {
            for (int j = 0; j < column - 1; j++)
            {
                if (parking[i][j] != '#' && parking[i][j+1] != '#' && parking[i+1][j] != '#' && parking[i+1][j+1] != '#')
                {
                    counters[(parking[i][j] == 'X' ? 1 : 0) + (parking[i][j+1] == 'X' ? 1 : 0) + (parking[i+1][j] == 'X' ? 1 : 0) + (parking[i+1][j+1] == 'X' ? 1 : 0)]++;
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(counters[i]);
        }

        sc.close();
    }
}
