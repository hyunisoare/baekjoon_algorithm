package main.array;
/*
두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다.
수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Array_04_3052_the_Rest {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];

        for (int i=0; i<arr.length; i++) {
            arr[i] = (Integer.parseInt(br.readLine()))%42;
        }
        Arrays.sort(arr);
        // sort 로 숫자들을 정렬하고, 다음값이 다르면 썸을 올린다.
        int sum = 1;
        for (int i=0; i<arr.length-1; i++) {
            if (arr[i] != arr[i+1]) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}

/*
예제입력 1
1
2
3
4
5
6
7
8
9
10
예제출력 1 : 10
예제입력 2
39
40
41
42
43
44
82
83
84
85
예제출력 2 : 6
 */