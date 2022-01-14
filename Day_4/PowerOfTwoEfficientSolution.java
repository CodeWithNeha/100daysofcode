package Day_4;

import java.util.Scanner;

public class PowerOfTwoEfficientSolution {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		if(n==0) {
			System.out.println(false);
			return;
		}
		System.out.println((n&(n-1))==0);

	}

}
