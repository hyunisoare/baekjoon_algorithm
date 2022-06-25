package main.array;

/*
첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 이어서 N명의 점수가 주어진다.
점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.
 */
// 0. 테스트케이스 숫자만큼 어레이를 만들고 한 줄의 값들은 각각 어레이에 들어간다.
// 1. 평균값을 구하고 if 문으로 평균값보다 큰 값이 몇개인지 찾는다.
// 2. sb에 학생 비율 double 로 해서 저장, 출력.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Array_07_4344_Average
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++)
        {
            st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken()); // 학생 수
            System.out.println(N);
            int[] arr = new int[N];
            double sum = 0;

            for (int j = 0; j < N; j++)
            {
                int val = Integer.parseInt(st.nextToken()); // 성적 저장
                arr[j] = val;
                sum += val; // 성적 누적 합
            }

            double avg = (sum / N);// 성적 평균값
            double cnt = 0;

            //평균 넘는 학생 수 찾기.
            for (int j = 0; j < N; j++) {
                if (arr[j] > avg)
                {
                    cnt++;
                }
            }

            System.out.println("avg: " + avg + ", count of students: " + cnt);
            System.out.printf("%.3f%%\n",(cnt/arr.length)*100);

        }
    }
}


/*
예제입력1
5
5 50 50 70 80 100
7 100 95 90 80 70 60 50
3 70 90 80
3 70 90 81
9 100 99 98 97 96 95 94 93 91
예제출력1
40.000%
57.143%
33.333%
66.667%
55.556%
// 평균 60,75. 학생 수 3. 비율 3:4 =
 */
