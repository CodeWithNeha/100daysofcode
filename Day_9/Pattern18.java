package Day_9;

import java.util.Scanner;

public class Pattern18 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int star = n;
		int space = 0;
		for(int i = 1;i<=n;i++) {
			for(int sp = 1;sp<=space;sp++) {
				System.out.print("\t");
			}
			for(int st = 1;st<=star;st++) {
				if(i<=n/2&&i!=1&&st!=1&&st!=star)
					System.out.print("\t");
				else
				System.out.print("*\t");
			}
			if(i<=n/2) {
				star -=2;
				space++;
			}
			else {
				star +=2;
				space--;
			}
			System.out.println();
		}

	}

}
