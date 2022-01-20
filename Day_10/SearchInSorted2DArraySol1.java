package Day_10;

import java.util.Scanner;

public class SearchInSorted2DArraySol1 {

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
        for(int i = 0;i<n;i++) {
        	for(int j = 0;j<n;j++) {
        		if(arr[i][j]==val) {
        			System.out.println(i);
        			System.out.println(j);
        			return;
        		}
        	}
        }
        System.out.println("Not Found");

	}

}
