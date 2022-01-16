package Day_6;

import java.util.Scanner;

public class SumOfDigitsUsingRecursion {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println(sumDigit(n));
	}

	private static int sumDigit(int n) {
		if(n==0) {
			return 0;
		}
		return n%10+sumDigit(n/10);
	}

}
