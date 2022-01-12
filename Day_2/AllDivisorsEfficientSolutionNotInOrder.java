package Day_2;

import java.util.Scanner;

public class AllDivisorsEfficientSolutionNotInOrder {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		for(int i = 1;i*i<=n;i++) {
			if(n%i==0) {
				System.out.println(i);
				if(i!=(n/i)) {
					System.out.println(n/i);
				}
			}
		}

	}

}
