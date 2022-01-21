package Day_11;

import java.util.Scanner;

public class FindElementInAnArray {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	    int[] arr = new int[n];
	    for(int i = 0;i<n;i++){
	        arr[i] = scn.nextInt();
	    }
	    int val = scn.nextInt();
	    for(int i = 0;i<n;i++){
	        if(arr[i]==val){
	            System.out.println(i);
	            return;
	        }
	    }
	    System.out.println(-1);


	}

}
