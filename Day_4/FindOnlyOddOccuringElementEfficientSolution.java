package Day_4;

import java.util.Scanner;

public class FindOnlyOddOccuringElementEfficientSolution {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = scn.nextInt();
		}
		int res = 0;
		for(int i = 0;i<n;i++) {
			res = res^arr[i];
		}
		System.out.println(res);

	}

}
