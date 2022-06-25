package main.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Array_04_3052_the_Rest_HashSet {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> h = new HashSet<Integer>();

        for (int i=0; i<10; i++)
        {
            h.add(Integer.parseInt(br.readLine())%42);
        }

        System.out.println(h.size());
        //HashSet.size() 는 HashSet 의 크기(= 저장되어 있는 원소의 개수)를 반환한다.
    }
}