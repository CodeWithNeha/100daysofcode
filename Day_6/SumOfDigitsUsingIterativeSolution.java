package Day_6;

import java.util.Scanner;

public class SumOfDigitsUsingIterativeSolution {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println(sumDigit(n));
	}

	private static int sumDigit(int n) {
		int count = 0;
		while(n!=0) {
			int rem = n%10;
			count += rem;
			n = n/10;
		}
		return count;
	}

}
