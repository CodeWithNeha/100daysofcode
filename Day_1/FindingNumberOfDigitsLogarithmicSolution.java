package Day_1;

import java.util.Scanner;

public class FindingNumberOfDigitsLogarithmicSolution {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println(Math.floor(Math.log10(n)+1));
	}

}
