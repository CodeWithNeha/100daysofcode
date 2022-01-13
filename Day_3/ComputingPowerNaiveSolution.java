package Day_3;

import java.util.Scanner;

public class ComputingPowerNaiveSolution {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int n = scn.nextInt();
		int res = 1;
		for(int i = 0;i<n;i++){
			res = res*x;
		}
		System.out.println(res);
	}

}
