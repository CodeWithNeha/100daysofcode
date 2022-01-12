package Day_2;

import java.util.Scanner;

public class PrimeFactorsNaiveSolution {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		for(int i = 2;i<n;i++) {
			int x = i;
			if(isPrime(i)) {
				while(n%x==0) {
					System.out.println(i);
					x=x*i;
				}
			}
		}

	}

	private static boolean isPrime(int a) {
		for(int i = 2;i*i<=a;i++) {
			if(a%i==0) {
				return false;
			}
		}
		return true;
	}

}
