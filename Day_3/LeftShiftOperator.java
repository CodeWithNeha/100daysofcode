package Day_3;

import java.util.Scanner;

public class LeftShiftOperator {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int y = scn.nextInt();
		System.out.println(x<<1);
		System.out.println(x<<2);
		int z = x<<y;
		System.out.println(z);

	}

}
