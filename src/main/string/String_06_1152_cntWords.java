package main.string;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class String_06_1152_cntWords
{
    public static void main(String[] args) throws IOException
    {
        int cnt = 0;
        int pre_str = 32; // 공백을 의미.
        int str;

        while(true){
            str = System.in.read();
            // 입력받은 문자가 공백일 때,
            if (str==32){
                // 이전의 문자가 공백이 아니면
                if(pre_str != 32) cnt++;
            }

            else if (str == 10){ // 입력받은 문자가 개행일때('\n')
                // 이전의 문자가 공백이 아니면
                if (pre_str != 32) cnt++;
                break;
            }

            pre_str = str;
        }

        System.out.println(cnt);
    }
}


/*
문제
영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오. 단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.

입력
첫 줄에 영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 이 문자열의 길이는 1,000,000을 넘지 않는다. 단어는 공백 한 개로 구분되며, 공백이 연속해서 나오는 경우는 없다. 또한 문자열은 공백으로 시작하거나 끝날 수 있다.

출력
첫째 줄에 단어의 개수를 출력한다.
The Curious Case of Benjamin Button
6
 */

//{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//
//        int cnt = st.countTokens();
//
//        System.out.println(cnt);
//
//        }