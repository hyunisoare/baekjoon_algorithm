package main.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class String_04_2675_repeat
{
public static void main(String[]args)throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < cnt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int T = Integer.parseInt(st.nextToken());
            String s = st.nextToken();

            for (int j = 0; j < s.length(); j++) {
                sb.append(String.valueOf(s.charAt(j)).repeat(Math.max(0, T)));
//                for (int k = 0; k < T; k++) {
//                    sb.append(s.charAt(j));
//                }

            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}

/*
예제입력
2
3 ABC
5 /HTP

예제출력
AAABBBCCC
/////HHHHHTTTTTPPPPP
 */
