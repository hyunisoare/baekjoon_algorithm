package main.twoDimensionalArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class twoDA_2738_addition
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] firstM = new int[N][M];
        int[][] result = new int[N][M];

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                for (int j = 0; j < M; j++) {
                    firstM[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                for (int j = 0; j < M; j++) {
                    result[i][j] = Integer.parseInt(st.nextToken()) + firstM[i][j];
                }
            }


        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.print("\n");
        }

        br.close();

    }
}


/*
input
        3 3
        1 1 1
        2 2 2
        0 1 0
        3 3 3
        4 4 4
        5 5 100

output
        4 4 4
        6 6 6
        5 6 100
*/
