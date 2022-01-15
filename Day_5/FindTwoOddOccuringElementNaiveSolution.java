package Day_5;

import java.util.Scanner;

public class FindTwoOddOccuringElementNaiveSolution {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = scn.nextInt();
		}
		int res = 0;
		for(int i = 0;i<n;i++) {
			res = 0;
			for(int j = 0;j<n;j++) {
				if(arr[i]==arr[j])
					res++;
			}
			if(res%2!=0) {
				System.out.println(arr[i]);
			}
		}
	}

}
