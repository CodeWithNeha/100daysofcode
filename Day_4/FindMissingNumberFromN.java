package Day_4;

import java.util.Scanner;

public class FindMissingNumberFromN {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = scn.nextInt();
		}
		int res = 0;
		for(int i = 0;i<n;i++) {
			res = res^arr[i]^i+1;
		}
		res = res^n+1;
		System.out.println(res);
	}

}
