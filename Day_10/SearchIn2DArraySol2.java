package Day_10;

import java.util.Scanner;

public class SearchIn2DArraySol2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = scn.nextInt();
            }
        }
        int val = scn.nextInt();
        int i = 0,j = n-1;
        while(i<n&&j>=0) {
        	if(arr[i][j]==val) {
        		System.out.println(i);
        		System.out.println(j);
        		return;
        	}
        	else if(arr[i][j]>val) {
        		j--;
        	}
        	else {
        		i++;
        	}
        	
        }
        System.out.println("Not Found");

	}

}
