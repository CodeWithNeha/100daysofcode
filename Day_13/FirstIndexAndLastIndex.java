package Day_13;

import java.util.Scanner;

public class FirstIndexAndLastIndex {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ;i<n;i++) {
			arr[i] = scn.nextInt();
		}
		int num = scn.nextInt();
		findFirst(arr,n,num);
		findLast(arr,n,num);
		
	}

	private static void findLast(int[] arr, int n,int num) {
		int low = 0,high = n-1;
		int mid =0;
		while(low<=high) {
			 mid = (low+high)/2;
			if(arr[mid]==num) {
				if(mid!=n-1&&arr[mid+1]==num) {
					low = mid+1;
				}
				else {
					System.out.println(mid);
					return;
				}
			}
			else if(arr[mid]<num) {
				low = mid+1;
			}
			else {
				high = mid-1;
			}
		}
		if(arr[mid]!=num) {
			System.out.println(-1);
		}

	}

	private static void findFirst(int[] arr, int n,int num) {
		int low = 0,high = n-1;
		int mid = 0;
		while(low<=high) {
			 mid = (low+high)/2;
			if(arr[mid]==num) {
				if(mid>0&&arr[mid-1]==num) {
					high = mid;
				}
				else {
					System.out.println(mid);
					return;
				}
			}
			else if(arr[mid]<num) {
				low = mid+1;
			}
			else {
				high = mid-1;
			}
		}
		if(arr[mid]!=num) {
			System.out.println(-1);
		}
		
	}

}
