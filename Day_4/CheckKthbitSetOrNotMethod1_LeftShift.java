package Day_4;

import java.util.Scanner;

public class CheckKthbitSetOrNotMethod1_LeftShift {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int k = scn.nextInt();
		if((n&(1<<(k-1)))!=0) {
			System.out.println("yes");
		}
		else {
			System.out.println("No");
		}
	}

}
