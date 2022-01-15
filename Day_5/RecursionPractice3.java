package Day_5;

import java.util.Scanner;

public class RecursionPractice3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println(fun(n));

	}

	private static int fun(int n) {
		if(n==1) {
			return 0;
		}
		return 1+fun(n/2);
	}

}
