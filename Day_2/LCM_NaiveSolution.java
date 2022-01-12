package Day_2;

import java.util.Scanner;

public class LCM_NaiveSolution {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int res = Math.max(a, b);
		while(true) {
			if(res%a==0&&res%b==0) {
				System.out.println(res);
				return;
			}
			res++;
		}
	}

}
