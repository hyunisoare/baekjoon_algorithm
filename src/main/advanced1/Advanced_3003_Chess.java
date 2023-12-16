package main.advanced1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Advanced_3003_Chess
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int tkCnt = st.countTokens(); // Store the number of tokens
/*      I shouldn't use countTokens() in the for loop. Why?
        The issue with your code is related to how you're using the StringTokenizer in the for loop.
        The method st.countTokens() decreases each time you call st.nextToken(),
        because nextToken() consumes a token from the tokenizer.
        This means that the condition in your for loop changes with each iteration, causing the loop to terminate early.*/

        int[] input = new int[tkCnt];

        for (int i = 0; i < tkCnt; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }

        int[] pieces = new int[]{1,1,2,2,2,8};
        int[] answer = new int[6];
        for (int i = 0; i < 6; i++) {
            answer[i] = pieces[i] - input[i];
        }

        for (int i: answer) {
            System.out.print(i + " ");
        }
    }
}

/*문제
        동혁이는 오래된 창고를 뒤지다가 낡은 체스판과 피스를 발견했다.

        체스판의 먼지를 털어내고 걸레로 닦으니 그럭저럭 쓸만한 체스판이 되었다. 하지만, 검정색 피스는 모두 있었으나, 흰색 피스는 개수가 올바르지 않았다.

        체스는 총 16개의 피스를 사용하며, 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개로 구성되어 있다.

        동혁이가 발견한 흰색 피스의 개수가 주어졌을 때, 몇 개를 더하거나 빼야 올바른 세트가 되는지 구하는 프로그램을 작성하시오.

 Input 1 >>
 0 1 2 2 2 7
 Output 1 >>
 1 0 0 0 0 1

 Input 2 >>
 2 1 2 1 2 1
 Output 2 >>
 -1 0 0 1 0 7

 */
