package main.whileStatement;

import java.util.*;

/*
1 1
2 3
3 4
9 8
5 2
 */
public class While_01_10952
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) ;
        {
            int A = sc.nextInt();
            int B = sc.nextInt();

            System.out.println(A + B);
        }
        sc.close();
    }
}