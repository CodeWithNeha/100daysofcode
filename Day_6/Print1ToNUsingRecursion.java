package Day_6;

import java.util.Scanner;

public class Print1ToNUsingRecursion {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		fun(n);

	}

	private static void fun(int n) {
		if(n==0) {
			return;
		}
		fun(n-1);
		System.out.print(n+" ");
	}

}
