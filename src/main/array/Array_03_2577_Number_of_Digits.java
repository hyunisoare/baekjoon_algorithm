package main.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*
A × B × C = 150 × 266 × 427 = 17037300
 */

//You can convert a number into String, and then you can use toCharArray()
// or split() method to separate the number into digits.

public class Array_03_2577_Number_of_Digits {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int val = Integer.parseInt(br.readLine())  * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
        String str = String.valueOf(val);

        int[] arr = new int[10];

        for (int i=0; i<str.length(); i++)
        {
            arr[(str.charAt(i) - '0')]++;
        }
        for (int v : arr)
        {
            System.out.println(v);
        }
    }
}
