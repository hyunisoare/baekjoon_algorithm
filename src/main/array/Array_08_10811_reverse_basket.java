package main.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Array_08_10811_reverse_basket
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken()); // number of baskets
        int M = Integer.parseInt(st.nextToken()); // how many times I'm gonna reverse the baskets.
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = i+1;
        }


        for (int i = 0; i < M; i++) {
           st = new StringTokenizer(br.readLine(), " ");
           int left = Integer.parseInt(st.nextToken())-1;
           int right = Integer.parseInt(st.nextToken())-1;

           while (left < right)
           {
               int temp = arr[left];
               arr[left++] = arr[right];
               arr[right--] = temp;
               // left++; right--;  ** post-increment
           }
        }

        for (int n : arr){
            System.out.print(n + " ");
        }

    }
}
