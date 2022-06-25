package main.function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class function_03_1065_arithmetic_progression
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(arithmeticSequence(Integer.parseInt(br.readLine())));
    }

    public static int arithmeticSequence(int num)
    {
        int cnt = 0; // 한수 카운팅

        if (num<100){
            return num;
        }

        else {
            cnt = 99;

            for (int i = 100; i <=num; i++) {
                 int hun = i/100; // 백의 자리수
                 int ten = (i/10)%10; // 십의 자리수
                 int one = i%10;

                 if ((hun-ten)==(ten-one)){
                     cnt++;
                 }

            }
        }
        return cnt;
    }
}
