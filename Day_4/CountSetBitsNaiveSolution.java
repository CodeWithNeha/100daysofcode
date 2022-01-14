package Day_4;

import java.util.Scanner;

public class CountSetBitsNaiveSolution {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int count = 0;
		while(n>0) {
			if((n&1)==1) { //n%2!=0
				count++;
			}
			n = n>>1;     //n=n/2
		}
		System.out.println(count);

	}

}
