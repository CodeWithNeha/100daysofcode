package Day_16;

import java.util.Scanner;

public class ClimbStairsDP_Memoization {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(countPaths(n,new int[n+1]));
    }
    public static int countPaths(int n,int[] dp){
        if(n<0){
            return 0;
        }
        else if(n==0){
            return 1;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        return dp[n] = countPaths(n-1,dp)+countPaths(n-2,dp)+countPaths(n-3,dp);
    }

}
