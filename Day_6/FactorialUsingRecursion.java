package Day_6;

import java.util.Scanner;

public class FactorialUsingRecursion {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println(fact(n));

	}

	private static int fact(int n) {
	 if(n==0||n==1) {
		 return 1;
	 }
		return n*fact(n-1);
	}

}
