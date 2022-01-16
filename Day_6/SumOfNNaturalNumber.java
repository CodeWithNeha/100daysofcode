package Day_6;

import java.util.Scanner;

public class SumOfNNaturalNumber {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println(getSum(n));
	}

	private static int getSum(int n) {
		if(n==0) {
			return 0;
		}
		return n+getSum(n-1);
	}
	

}
