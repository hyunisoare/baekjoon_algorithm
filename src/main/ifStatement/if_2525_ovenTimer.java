package main.ifStatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
    훈제오리구이를 시작하는 시각과 오븐구이를 하는 데 필요한 시간이 분단위로 주어졌을 때,
    오븐구이가 끝나는 시각을 계산하는 프로그램을 작성하시오.

    입력
    첫째 줄에는 현재 시각이 나온다. 현재 시각은 시 A (0 ≤ A ≤ 23) 와 분 B (0 ≤ B ≤ 59)가
    정수로 빈칸을 사이에 두고 순서대로 주어진다. 두 번째 줄에는 요리하는 데 필요한 시간 C (0 ≤ C ≤ 1,000)가 분 단위로 주어진다.

    출력
    첫째 줄에 종료되는 시각의 시와 분을 공백을 사이에 두고 출력한다.
    (단, 시는 0부터 23까지의 정수, 분은 0부터 59까지의 정수이다. 디지털 시계는 23시 59분에서 1분이 지나면 0시 0분이 된다.)

    예제입력 1
    14 30
    20
    예제출력 1
    14 50

    예제입력 2
    17 40
    80
    예제출력 2
    19 0

    예제입력 3
    23 48
    25
    예제출력 3
    0 13
 */
public class if_2525_ovenTimer
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int hour = Integer.parseInt(st.nextToken()); // 17
        int min = Integer.parseInt(st.nextToken()); // 40
        //두번째 줄에 출력해야하는 변수 하나는 StringTokenizer가 아닌 기본 입력을 사용
        int time = Integer.parseInt(br.readLine()); // 80

        min += time; // 120

        if (min > 59){
            hour += min/60;
           min = min%60; //120%60 0

           if (hour >= 24){
              hour = hour - 24;
           }
        }

        System.out.println(hour + " " + min);

    }
}
