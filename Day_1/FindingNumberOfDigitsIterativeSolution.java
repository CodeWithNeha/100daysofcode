package Day_1;

import java.util.Scanner;

public class FindingNumberOfDigitsIterativeSolution {

	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int count = 0;
	int n = scn.nextInt();
	while(n!=0) {
		n = n/10;
		count++;
	}
	System.out.println(count);
	}

}
