package main.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_11_2743_Length_Of_String
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        System.out.print(word.length());
    }
}
/*
Input
pulljima

Output
8
*/
