package main.advanced1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Advanced_1316_group_words
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());

        int sum = 0;

        for (int i = 0; i < input; i++) {
            String word = br.readLine();

            List<Character> letters = new ArrayList<>();
            for (int j = 0; j < word.length(); j++) {
                if (!letters.contains(word.charAt(j))){ // a b
                    letters.add(word.charAt(j)); // a b
                }
                else if (word.charAt(j) != word.charAt(j-1)){
                    sum--;
                    break;
                }
            }
            sum++;
        }

        System.out.println(sum);
    }
}
