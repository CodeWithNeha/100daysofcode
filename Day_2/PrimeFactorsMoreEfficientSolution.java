package Day_2;

import java.util.Scanner;

public class PrimeFactorsMoreEfficientSolution {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		while(n%2==0) {
			n=n/2;
			System.out.println(2);
		}
		while(n%3==0) {
			n=n/3;
			System.out.println(3);
		}
		for(int i = 5;i*i<=n;i=i+6) {
				while(n%i==0) {
					System.out.println(i);
					n=n/i;
				}
				while(n%(i+2)==0) {
					System.out.println(i+2);
					n=n/(i+2);
				}
				
		}
		if(n>3) {
			System.out.println(n);
		}

	}
}
