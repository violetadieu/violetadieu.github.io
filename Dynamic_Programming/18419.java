package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] DP=new int[N+1];
        for(int i=1;i<N;i++){
            int start=i;
            String tmp=Integer.toString(start);
            for(int k=0;k<tmp.length();k++){
                start+=tmp.charAt(k)-'0';
            }
            if(start<=N)
                DP[start]+=DP[i]+1;
        }
        System.out.print(DP[N]+1);
    }
}
