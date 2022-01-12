package Day_2;

import java.util.Scanner;

public class GreatestCommonDivisorNaiveSolution {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int res = Math.min(a, b);
		while(res>0) {
			if(a%res==0&&b%res==0) {
				break;
			}
			res--;
		}
		System.out.println(res);
	}

}
