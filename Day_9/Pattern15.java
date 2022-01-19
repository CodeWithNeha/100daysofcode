package Day_9;

import java.util.Scanner;

public class Pattern15 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int star = 1;
		int space = n/2;
		int numP = 1;
		for(int i = 1;i<=n;i++) {
			for(int sp = 1;sp<=space;sp++) {
				System.out.print("\t");
			}
			int num = numP;
			for(int nu = 1;nu<=star;nu++) {
				System.out.print(num+"\t");
				if(nu<=star/2) {
					num++;
				}
				else {
					num--;
				}
			}
			if(i<=n/2) {
				star +=2;
				space--;
				numP++;
			}
			else {
				star -=2;
				space++;
				numP--;
			}
			
			System.out.println();
		}

	}

}
