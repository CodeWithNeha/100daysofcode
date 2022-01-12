package Day_2;

import java.util.Scanner;

public class TrailingZerosInFactorialEfficientSolution {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int res = 0;
		for(int i = 5;i<=n;i=i*5) {
			res = res+ n/i;
		}
		System.out.println(res);

	}

}
