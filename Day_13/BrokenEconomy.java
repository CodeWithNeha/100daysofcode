package Day_13;

import java.util.Scanner;

public class BrokenEconomy {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	    int[] arr = new int[n];
	    for(int i = 0;i<n;i++){
	        arr[i] = scn.nextInt();
	    }
	    int d = scn.nextInt();
	    int low = 0,high = n-1;
	    int c = 0,f = 0;
	    while(low<=high){
	        int mid = (low+high)/2;
	        if(d>arr[mid]){
	            low = mid+1;
	            f = arr[mid];
	        }
	        else if(d<arr[mid]){
	            high = mid-1;
	            c = arr[mid];
	        }
	        else{
	            f = arr[mid];
	            c = arr[mid];
	            break;
	        }
	    }
	    System.out.println(c);
	    System.out.println(f);

	}

}
