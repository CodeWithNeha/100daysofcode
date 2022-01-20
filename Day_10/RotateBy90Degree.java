package Day_10;

import java.util.Scanner;

public class RotateBy90Degree {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                arr[i][j] = scn.nextInt();
            }
        }
         for(int i = 0;i<n;i++){
	             for(int j=i+1;j<n;j++){
	               
	                 int temp = arr[i][j];
	                 arr[i][j] = arr[j][i];
	                 arr[j][i] = temp; 
	             }
	         }
        for(int i = 0;i<n;i++){
             int low = 0,high = n-1;
             while(low<high){
                 int temp = arr[i][low];
                 arr[i][low] = arr[i][high];
                 arr[i][high] = temp;
                 low++;
                 high--;
             }
        }
        display(arr);

   }

   public static void display(int[][] arr){
       for(int i = 0; i < arr.length; i++){
           for(int j = 0; j < arr[0].length; j++){
               System.out.print(arr[i][j] + " ");
           }
           System.out.println();
       }
   }


}
