package Day_4;

import java.util.Scanner;

public class CountSetBitsLookupTable {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int count = 0;
		int[] table = new int[256];
		table[0] = 0;
		for(int i = 1;i<256;i++) {
			table[i] = (i&1) + table[i/2];
		}
		count = table[n&0xff];
		n = n>>8;
		count +=table[n&0xff];
		n = n>>8;
		count +=table[n&0xff];
		n = n>>8;
		count +=table[n&0xff];
		System.out.println(count);

	}

}
