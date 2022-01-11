package Day_1;

import java.util.Scanner;

public class FindingNumberOfDigitsRecursiveSolution {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println(digits(n));
	}

	private static int digits(int n) {
		if(n<=0) {
			return 0;
		}
		return 1+digits(n/10);
	}

}
