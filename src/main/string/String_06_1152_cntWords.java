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