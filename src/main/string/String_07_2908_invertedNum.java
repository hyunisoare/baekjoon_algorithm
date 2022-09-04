package main.string;

import javax.print.DocFlavor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class String_07_2908_invertedNum
{
    public static void main(String[] args) throws IOException
    {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//
//        int firstNum = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
//        int scndNum = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
//
//        System.out.print(Math.max(firstNum, scndNum));
        // System.out.print(A>B ? A:B);

        int A = 0;
        int B = 0;

        A += System.in.read()-48;
        A += (System.in.read()-48)*10;
        A += (System.in.read()-48)*100;

        System.in.read();

        B += System.in.read()-48;
        B += (System.in.read()-48)*10;
        B += (System.in.read()-48)*100;

        System.out.println(Math.max(A,B));

    }
}

/*
    입력
첫째 줄에 상근이가 칠판에 적은 두 수 A와 B가 주어진다. 두 수는 같지 않은 세 자리 수이며, 0이 포함되어 있지 않다.
상수는 거꾸로 쓴 숫자 중 큰 수를 말한다.

출력
첫째 줄에 상수의 대답을 출력한다.

ex 1
734 893
ex ans
437

ex 2
221 231
ex 2 output
132
 */
