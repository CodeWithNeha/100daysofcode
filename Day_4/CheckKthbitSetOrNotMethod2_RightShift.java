package Day_4;

import java.util.Scanner;

public class CheckKthbitSetOrNotMethod2_RightShift {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int k = scn.nextInt();
		if(((n>>(k-1))&1)==1){
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}

	}

}
