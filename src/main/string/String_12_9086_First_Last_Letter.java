package main.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_12_9086_First_Last_Letter
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(br.readLine());
        String[] letters = new String[i];

        for (int j = 0; j < i; j++) {
            String word = br.readLine();
            char firstL = word.charAt(0);
            char lastL = word.charAt(word.length()-1);
            letters[j] = "" + firstL + lastL;
        }

        for (String s : letters) {
            System.out.println(s);
        }
    }
}

/*
    문자열을 입력으로 주면 문자열의 첫 글자와 마지막 글자를 출력하는 프로그램을 작성하시오.
    input >>
        3
        ACDKJFOWIEGHE
        O
        AB
    output >>
        AE
        OO
        AB

문제풀이:
char + char을 하면 아스키코드로 인해 int로 계산된다.
이를 방지하고 문자열 더하기를 해주기 위해,' ""+  '를 추가해주거나
'String.valueOf(~) + String.valueOf(~)'를 사용해주면 된다.

*/
