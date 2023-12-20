package main.advanced1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Advanced_2444_print_stars
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(br.readLine());
        // for the top shape
        for (int row = 1; row <= i; row++) { // 1 // 2
            for (int space = (i - row); space > 0; space--) { // 4 space // 3 spaces
                System.out.print(" ");
            }

            for (int star = row; star < (row * 2) + (row - 1); star++) { // 1 < 2 = 1 star // 2 < 5 = 3 star // 3 < 8 = 5 stars
                System.out.print("*");
            }
            System.out.println();
        }
        // for the bottom shape
        for (int j = i-1; j >= 1; j--) { // from 4 to 1 = 4 times
            for (int space = 1; space <= (i-j); space++) { // 1 <= (5-4) == 1 space // 1 <= (5-3) == 2 spaces // 1 <= (5-2) == 3 spaces...
                System.out.print(" ");
            }
            for (int star = 1; star <= (j*2-1); star++) { // 1 <= 7 stars // 1 <= (3*2-1) == 5 stars // 1 <= (2*2-1) == 3 stars ...
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// increasing 2n-1 and decreasing


