package Day_3;

import java.util.Scanner;

public class ComputingPowerIterativeEfficientSolution {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int n = scn.nextInt();
		int res = 1;
		while(n>0) {
			if(n%2!=0) {
				res = res *x;
			}
			x = x*x;
			n = n/2;
		}
		System.out.println(res);

	}

}
