package main.advanced1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Advanced_10988_palindrome
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        //System.out.println(word);
        boolean isPalindrome = true;

        for (int i = 0; i < (word.length()/2); i++) {
            if (word.charAt(i) != word.charAt(word.length()-1-i)){
                isPalindrome = false;
                break;
            }
        }

        System.out.println(isPalindrome ? 1 : 0);
    }
}

/*
Input1 : level
Output1 : 1

Input2 : baekjoon
Output2 : 0
*/
