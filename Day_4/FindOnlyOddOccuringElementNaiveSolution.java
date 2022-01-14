package Day_4;

import java.util.Scanner;

public class FindOnlyOddOccuringElementNaiveSolution {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = scn.nextInt();
		}
		for(int i = 0;i<n;i++) {
			int count = 0;
			for(int j = 0;j<n;j++) {
				if(arr[i]==arr[j])
					count++;
			}
			if(count%2!=0) {
				System.out.println(arr[i]);
			}
		}
	}

}
