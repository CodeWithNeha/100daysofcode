package Day_1;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int temp = n;
		int rev = 0;
		while(temp!=0) {
			int rem = temp %10;
			rev = rev*10+rem;
			temp = temp/10;
		}
		System.out.println(rev==n);
	}

}
