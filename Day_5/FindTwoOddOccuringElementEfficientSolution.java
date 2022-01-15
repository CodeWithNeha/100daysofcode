package Day_5;

import java.util.Scanner;

public class FindTwoOddOccuringElementEfficientSolution {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		int xor = 0;
		for(int i = 0;i<n;i++) {
			arr[i] = scn.nextInt();
			xor = xor^arr[i];
		}
		xor = xor&(~(xor-1)); //RightMost set bit
		int res1 = 0,res2 = 0;
		for(int i = 0;i<n;i++) {
			if((arr[i]&xor)!=0) {
				res1 = res1^arr[i];
			}
			else {
				res2 = res2^arr[i];
			}
		}
		System.out.println(res1 + " " +res2);
		
	}

}
