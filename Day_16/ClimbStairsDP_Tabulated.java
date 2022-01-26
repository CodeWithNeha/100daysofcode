package Day_16;

import java.util.Scanner;

public class ClimbStairsDP_Tabulated {

	 public static void main(String[] args) throws Exception {
	        Scanner scn = new Scanner(System.in);
	        int n = scn.nextInt();
	        int[] dp = new int[n+1];
	        dp[0] = 1;
	        for(int i = 1;i<=n;i++){
	            if(i==1){
	                dp[i] = dp[i-1];
	            }
	            else if(i==2){
	                dp[i] = dp[i-1]+dp[i-2];
	            }
	            else{
	                dp[i] = dp[i-1]+dp[i-2]+dp[i-3];
	            }
	        }
	        System.out.println(dp[n]);
	    }
	   

}
