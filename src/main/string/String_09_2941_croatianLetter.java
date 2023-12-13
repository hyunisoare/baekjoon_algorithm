package main.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_09_2941_croatianLetter
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        int cnt = word.length();

        for (int i = 0; i < word.length(); i++) {
            // char ch = word.charAt(i);
            if (word.charAt(i) == 'c'){
                if (word.length()-i > 1){
                    if (word.charAt(i+1) == '=' || word.charAt(i+1) == '-'){
                        cnt--;
                    }
                }
            }

            else if (word.charAt(i) == 'd'){
                if (word.length()-i > 2){
                    if (word.charAt(i+1) == 'z' && word.charAt(i+2) == '='){
                        cnt-=1;
                    }
                }
                else if (word.length()-i>1){

                    if (word.charAt(i + 1) == '-') {
                        cnt--;
                    }
                }
            }

            else if (word.charAt(i) == 'l' || word.charAt(i) == 'n'){

                if (word.length()-i>1) {
                    if (word.charAt(i + 1) == 'j') {
                        cnt--;
                    }
                }
            }


            else if (word.charAt(i) == 's' || word.charAt(i) == 'z'){

                if (word.length()-i>1) {
                    if (word.charAt(i + 1) == '=') {
                        cnt--;
                    }
                }
            }
        }

        System.out.println(cnt);
    }
}



//    예전에는 운영체제에서 크로아티아 알파벳을 입력할 수가 없었다. 따라서, 다음과 같이 크로아티아 알파벳을 변경해서 입력했다.
//        크로아티아 알파벳 	변경
//        č 	c=
//        ć 	c-
//        dž 	dz=
//        đ 	d-
//        lj 	lj
//        nj 	nj
//        š 	s=
//        ž 	z=
//
//        예를 들어, ljes=njak은 크로아티아 알파벳 6개(lj, e, š, nj, a, k)로 이루어져 있다. 단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
//
//        dž는 무조건 하나의 알파벳으로 쓰이고, d와 ž가 분리된 것으로 보지 않는다. lj와 nj도 마찬가지이다. 위 목록에 없는 알파벳은 한 글자씩 센다.
