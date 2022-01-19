package Day_9;

import java.util.Scanner;

public class Pattern16 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int num = 1;
		int space = 2*n-3;
		int star = 0;
		for(int i = 1;i<=n;i++) {
			int nu = num;
			 star = i;
			for(int st = 1;st<=star;st++) {
				System.out.print(nu+"\t");
				nu++;
			}
			for(int sp = 1;sp<=space;sp++) {
				System.out.print("\t");
			}
			if(i==n) {
				nu--;
				star--;
			}
			for(int st2 = 1;st2<=star;st2++) {
				nu--;
				System.out.print(nu+"\t");
				
			}
			space -=2;
			System.out.println();
		}

	}

}
