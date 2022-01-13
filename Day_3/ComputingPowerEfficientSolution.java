package Day_3;

import java.util.Scanner;

public class ComputingPowerEfficientSolution {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int n = scn.nextInt();
		System.out.println(power(x,n));
	}

	private static int power(int x, int n) {
		if(n==0) {
			return 1;
		}
		int temp = power(x,n/2);
		temp = temp*temp;
		if(n%2==0) {
			return temp;
		}
		else {
			return temp*x;
		}
	}

}
