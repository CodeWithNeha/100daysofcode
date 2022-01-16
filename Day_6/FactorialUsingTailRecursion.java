package Day_6;

import java.util.Scanner;

public class FactorialUsingTailRecursion {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println(fact(n,1));

	}

	private static int fact(int n,int k) {
	 if(n==0||n==1) {
		 return k;
	 }
		return fact(n-1,k*n);
	}


}
