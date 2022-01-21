package Day_11;

import java.util.Scanner;

public class BarChart {

	public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	    int[] arr = new int[n];
	    for(int i = 0;i<n;i++){
	        arr[i] = scn.nextInt();
	    }
	    int max = Integer.MIN_VALUE;
	    for(int i = 0;i<n;i++){
	        if(max<arr[i]){
	            max = arr[i];
	        }
	    }
	    for(int i = 0;i<max;i++){
	        for(int j = 0;j<n;j++){
	            if(arr[j]>=max-i){
	                System.out.print("*\t");
	            }
	            else{
	                System.out.print("\t");
	            }
	        }
	        System.out.println();
	    }
	}

}
