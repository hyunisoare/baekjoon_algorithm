package main.ifStatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class if_2480_threeDice
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int ans = -999;

        if (a==b && b==c){ // 모든 수가 같을 경우
            ans = 10_000 + (a*1000);
        }
        else if (a==b || a==c){ // 두 개의 수가 같을 경우
            ans = 1000 + (a*100);
        }
        else if (b==c){
            ans = 1000 + (b*100);
        }
        else { // 세 개의 수가 모두 다를 경우
            ans = 100*(Math.max(a, Math.max(b,c)));
        }

        System.out.println(ans);
    }

}


/*
1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다.

같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.

입력
첫째 줄에 3개의 눈이 빈칸을 사이에 두고 각각 주어진다.

출력
첫째 줄에 게임의 상금을 출력 한다.
 */
