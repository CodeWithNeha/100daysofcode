package Day_1;

import java.util.Scanner;

public class FactorialRecursiveSolution {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println(fact(n));

	}

	private static int fact(int n) {
		if(n<=0) {
			return 1;
		}
		return n*fact(n-1);
	}

}
