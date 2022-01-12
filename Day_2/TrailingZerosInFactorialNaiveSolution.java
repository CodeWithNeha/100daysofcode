package Day_2;

import java.util.Scanner;

public class TrailingZerosInFactorialNaiveSolution {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int fact = 1;
		for(int i = 2;i<=n;i++) {
			fact = fact *i;
		}
		int res = 0;
		while(fact%10==0) {
			res++;
			fact = fact/10;
		}
		System.out.println(res);

	}

}
