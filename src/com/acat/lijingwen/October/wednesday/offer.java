package com.acat.lijingwen.October.wednesday;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class offer {
//    public static ArrayList<Integer> huiwenshu(int length, int []list){
//
//    }
//    public static void input(){
//        int [] list = new int[1000];
//        int length;
//        Scanner input=new Scanner(System.in);
//        System.out.print("请您输入数组的大小:");
//        length=input.nextInt(); //输入整型
//        for(int i=0;i<length;i++){
//            System.out.println("输入最后第"+i+"个值，共"+length);
//            list[i]=input.nextInt(); //输入字符串型
//
//        }
//    }
//    public static void main (String []args){
//        input();
//    }
//}


/**
 * Dynamic Programming
 *
 * State:
 *   dp[i][j]: 表示a[i],...,a[j]中的回文子序列的最大和
 *
 * Initial State:
 *   dp[i][i] = a[i]
 *
 * State Transition:
 *   if (a[i] == a[j]) dp[i][j] = dp[i + 1][j - 1] + 2 * a[i];
 *   else dp[i][j] = max(dp[i + 1][j], dp[i][j - 1]);
 *
 * @author wylu
 */
//20018搜狐笔试  回文数组
///***********************************************************************没有理解************************************************
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] strs = br.readLine().split(" ");
        int[] a = new int[n];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(strs[i]);
            sum += a[i];
        }

        long[][] dp = new long[n][n];
        for (int i = a.length - 1; i >= 0; i--) {
            dp[i][i] = a[i];
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j])
                    dp[i][j] = dp[i + 1][j - 1] + 2 * a[i];
                else
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
            }
        }
        System.out.println(2 * sum - dp[0][n - 1]);
    }
}

