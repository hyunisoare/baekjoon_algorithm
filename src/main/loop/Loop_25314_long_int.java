package main.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loop_25314_long_int
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(br.readLine());

        if (i%4 == 0)
        {
            for (int j=0; j<(i/4); j++)
            {
                System.out.print("long ");
            }
            System.out.println("int");
        }
    }

}

/*
4 byte : long int
8 byte : long long int
12 byte : long long long int
16 byte : long long long long int
20 byte : long long long long long int*/
