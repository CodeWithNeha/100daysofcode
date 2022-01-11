package Day_1;

import java.util.Scanner;

public class FactorialIterativeSolution {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int fact = 1;
		for(int i = 2;i<=n;i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}

}
