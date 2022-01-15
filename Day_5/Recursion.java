package Day_5;

import java.util.Scanner;

public class Recursion {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		fun(n);

	}

	private static void fun(int n) {
		if(n==0) {
			return;
		}
		System.out.println("Neha");
		fun(n-1);
		
	}

}
