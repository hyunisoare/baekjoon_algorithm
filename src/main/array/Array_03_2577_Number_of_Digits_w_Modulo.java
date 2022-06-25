package main.array;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 A × B × C = 150 × 266 × 427 = 17037300 이 되고, 계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.
 */

public class Array_03_2577_Number_of_Digits_w_Modulo {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int val = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
        int[] arr = new int[10];

        while (val != 0)
        {
            arr[(val%10)]++;
            val/=10;
        }

        for (int result : arr)
        {
            System.out.println(result);
        }
    }
}