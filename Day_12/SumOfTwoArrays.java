package Day_12;

import java.util.Scanner;

public class SumOfTwoArrays {

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
	int size = 0;
	if(n1>n2) {
		size = n1;
	}
	else {
		size = n2;
	}
	int[] sum = new int[size];
	int i = n1-1,j=n2-1,k = size-1;
	int c = 0;
	while(k>=0) {
		int s = c;
		if(i>=0) {
			s+=arr1[i];
		}
		if(j>=0) {
			s+=arr2[j];
		}
		c = s/10;
		s = s%10;
		sum[k] = s;
		k--;
		i--;
		j--;
	}
	if(c>0) {
		System.out.println(c);
	}
	for(i = 0;i<size;i++) {
		System.out.println(sum[i]);
	}
	}

}
