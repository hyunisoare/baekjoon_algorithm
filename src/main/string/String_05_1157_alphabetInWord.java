package main.string;

import java.io.*;
import java.util.Locale;

public class String_05_1157_alphabetInWord
{
    public static void main(String[] args) throws IOException
    {
        int[] arr = new int[26]; // 영문자의 개수는 26개.

        int c = System.in.read();

        while(c>64){ // 공백을 입력받는 순간 종료됨.
            if (c<91){ // C가 소문자라면 65를 빼준다.
                arr[c-65]++;
            }
            else{ // C가 대문자면 97을 빼준다.
                arr[c-97]++;
            }
            c = System.in.read();
        }

        int max = -1;
        int ch = -2; // ? = 63

        for (int i = 0; i < 26; i++) {
            if(arr[i]>max){
                max=arr[i];
                ch=i;
            }
            else if (arr[i]==max){
                ch=-2;
            }
        }
        System.out.print((char)(ch+65));

    }
}

/*
    입력
    첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.

    출력
    첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.

Mississipi
?

zZa
Z

baaa
A
 */

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        String s = br.readLine().toUpperCase();
//        int max = 0;
//        char ans = ' ';
//
//        for (int i = 0; i < s.length(); i++) {
//            char ch = s.charAt(i);
//            int currMax = 0;
//            for (int j = 0; j < s.length(); j++) {
//                if (ch == s.charAt(j)){
//                    currMax++;
//                }
//            }
//            if (currMax > max){
//                ans = ch;
//                max = currMax;
//            }
//            else if (currMax == max){
//                ans='?';
//            }
//        }
//
//        System.out.println(ans);
