package main.array;

//"OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
//첫째 줄에 테스트 케이스의 개수가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고,
// 길이가 0보다 크고 80보다 작은 문자열이 주어진다. 문자열은 O와 X만으로 이루어져 있다.
/*
예제입력 1
5
OOXXOXXOOO
OOXXOOXXOO
OXOXOXOXOXOXOX
OOOOOOOOOO
OOOOXOOOOXOOOOX
예제출력 1
10
9
7
55
30
 */

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class  Array_06_8958_OX
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        String[] arr = new String[T];

        for (int i = 0; i < T; i++) {
            arr[i] = br.readLine();
        }

        for (int i = 0; i < arr.length; i++) {
            int cnt = 0; //연속횟수
            int sum = 0; //누적합산
            for (int j = 0; j < arr[i].length(); j++) {
                if (arr[i].charAt(j) == 'O'){
                    cnt++; //OOXXOXXOOO  1+2+1+1+2+3 = 10
                    sum += cnt; // current cnt = 2, sum = 3.
                }
                else{
                    cnt = 0;
                }
            }
            sb.append(sum).append("\n");
        }
        System.out.println(sb);
    }
}
/*
Solution: alle Faelle in einem Array nehmen.
z.B
{"OOXXOXXOOO", "OOXXOOXXOO", "OXOXOXOXOXOXOX", "OOOOOOOOOO", "OOOOXOOOOXOOOOX"}
Iterate double for loop and figure out, how many O's are in str[i].
 */