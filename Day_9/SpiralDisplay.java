package Day_9;

import java.util.Scanner;

public class SpiralDisplay {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                arr[i][j] = scn.nextInt();
            }
        }
        int total = n*m;
        int start_row = 0;
        int start_col = 0;
        int end_row = n-1;
        int end_col = m-1;
        int count = 0;
        while(count<=total){
            for(int row = start_row;row<=end_row;row++){
                System.out.println(arr[row][start_col]);
                count++;
            }
            if(count>=total){
                break;
            }
            start_col++;
            for(int row = start_col;row<=end_col;row++){
                System.out.println(arr[end_row][row]);
                count++;
            }
             if(count>=total){
                break;
            }
            end_row--;
            for(int row = end_row;row>=start_row;row--){
                System.out.println(arr[row][end_col]);
                count++;
            }
             if(count>=total){
                break;
            }
            end_col--;
            for(int row = end_col;row>=start_col;row--){
                System.out.println(arr[start_row][row]);
                count++;
            }
             if(count>=total){
                break;
            }
            start_row++;

        }

	}

}
