package Day_6;

import java.util.Scanner;

public class NthFibonacciNumber {
	
		public static void main(String[] args) {
			Scanner scn = new Scanner(System.in);
			int n = scn.nextInt();
			System.out.println(fibo(n));



	}

		private static int fibo(int n) {
			if(n==0||n==1) {
				return n;
			}
			return fibo(n-1)+fibo(n-2);
		}

}
