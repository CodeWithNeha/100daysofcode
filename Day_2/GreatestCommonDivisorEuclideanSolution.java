package Day_2;

import java.util.Scanner;

public class GreatestCommonDivisorEuclideanSolution {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		while(a!=b) {
			if(a>b) {
				a = a-b;
			}
			else {
				b = b-a;
			}
		}
		System.out.println(a);

	}

}
