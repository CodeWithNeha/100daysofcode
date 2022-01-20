package Day_10;

import java.util.Scanner;

public class SaddlePrice {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = scn.nextInt();
            }
        }
        for(int i = 0;i<n;i++){
            int small = 0;
            for(int j=1;j<n;j++){
                if(arr[i][j]<arr[i][small]){
                    small = j;
                }
            }
            boolean flag = true;
            for(int k = 0;k<n;k++){
                if(arr[k][small]>arr[i][small]){
                    flag=false;
                    break;
                }
            }
            if(flag==true){
                System.out.println(arr[i][small]);
                return;
            }
        }
        System.out.println("Invalid input");
	}

}
