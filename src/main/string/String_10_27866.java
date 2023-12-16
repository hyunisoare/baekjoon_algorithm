package main.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_10_27866
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        int i = Integer.parseInt(br.readLine());

        System.out.println(word.charAt(i-1));
    }
}

//Input 1
//Sprout
//3
//Output 1
//r

//Input 2
//shiftpsh
//6
//Output 2
//p