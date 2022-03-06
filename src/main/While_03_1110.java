package main;

/*
26, 2+6 = 8 => 68. 6+8 = 14.=> 84. 8+4 = 12. => 42. 4+2 = 6. => 26
55, 5+5=10 => 50/ 5 + 0 = 5 => 05 / 0 + 5 = 5 => 55 /                        => 3
1 => 60
0 => 1
71 => 12
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class While_03_1110
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int T = 0;
        int newNum = N;

        while(true)
        {
            int tensDigit = newNum/10;
            int singlDigit = newNum%10;

            newNum = (singlDigit*10) + ((tensDigit+singlDigit)%10);

            T++;
            if (N == newNum)
            {
                break;
            }

            //System.out.println(tensDigit + " " + singlDigit + " " + newNum);
        }

        //br.close();

        System.out.println(T);
    }
}