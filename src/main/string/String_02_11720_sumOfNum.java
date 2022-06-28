package main.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class String_02_11720_sumOfNum
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        int sum = 0;

        for (byte value : br.readLine().getBytes()) {
            sum += value-'0'; // or -48
        }

        System.out.println(sum);

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int x = Integer.parseInt(br.readLine());
//        String num = br.readLine();
//        int sum=0;
//        for (int i = 0; i < x; i++) {
//            sum += Integer.parseInt(num.substring(i, i+1));
//        }
//        System.out.println(sum);
    }
}
/*
25
7000000000000000000000000
 */