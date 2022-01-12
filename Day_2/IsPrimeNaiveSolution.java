package Day_2;

import java.util.Scanner;

public class IsPrimeNaiveSolution {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		for(int i = 2;i<a;i++) {
			if(a%i==0) {
				System.out.println(false);
				return;
			}
		}
		System.out.println(true);
	}

}
