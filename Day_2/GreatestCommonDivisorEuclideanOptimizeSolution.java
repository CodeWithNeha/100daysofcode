package Day_2;

import java.util.Scanner;

public class GreatestCommonDivisorEuclideanOptimizeSolution {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		System.out.println(gcd(a,b));

	}

	private static int gcd(int a, int b) {
		if(b==0) {
			return a;
		}
		return gcd(b,a%b);
	}

}
