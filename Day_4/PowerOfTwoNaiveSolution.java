package Day_4;

import java.util.Scanner;

public class PowerOfTwoNaiveSolution {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println(power(n));

	}

	private static boolean power(int n) {
		if(n==0) {
			return false;
		}
		while(n!=1) {
			if(n%2!=0) {
				return false;
			}
			n = n/2;
		}
		return true;
	}

}
