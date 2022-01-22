package Day_12;

import java.util.Scanner;

public class DifferenceOfTwoArrays {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n1 = scn.nextInt();
		int[] arr1 = new int[n1];
		for(int i = 0;i<n1;i++) {
			arr1[i] = scn.nextInt();
		}
		int n2 = scn.nextInt();
		int[] arr2 = new int[n2];
		for(int i = 0;i<n2;i++) {
			arr2[i] = scn.nextInt();
		}
		int[] diff = new int[n2];
	    int i = n1-1, j= n2-1,k = n2-1;
	    int c = 0;
	    while(k>=0) {
	    	int d = c;
	    	int arr1value = i>=0?arr1[i]:0;
	    	if(arr1value<=arr2[j]+c) {
	    		c = 0;
	    		d += arr2[j] - arr1value;
	    	}
	    	else {
	    		c= -1;
	    		d += (arr2[j]+10) - arr1value;
	    	}
	    	diff[k] = d;
	    	k--;
	    	i--;
	    	j--;
	    }
		i = 0;
		while(i<diff.length) {
			if(diff[i]==0) {
				i++;
			}
			else {
				break;
			}
		}
		for(;i<diff.length;i++) {
			System.out.println(diff[i]);
		}
		}

}
