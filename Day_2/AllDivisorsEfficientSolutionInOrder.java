package Day_2;

import java.util.Scanner;

public class AllDivisorsEfficientSolutionInOrder {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int i;
		for(i = 1;i*i<=n;i++) {
			if(n%i==0) {
				System.out.println(i);
				
			}
		}
		for(;i>=1;i--) {
			if(n%i==0) {
				System.out.println(n/i);
			}
		}
		

	}

}
