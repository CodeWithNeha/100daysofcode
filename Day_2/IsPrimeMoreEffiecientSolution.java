package Day_2;

import java.util.Scanner;

public class IsPrimeMoreEffiecientSolution {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		if(a==1) {
			System.out.println(false);
			return;
		}
		if(a==2||a==3) {
			System.out.println(true);
			return;
		}
		if(a%2==0||a%3==0) {
			System.out.println(false);
			return;
		}
		for(int i = 5;i*i<=a;i=i+6) {
			if(a%i==0||a%(i+2)==0) {
				System.out.println(false);
				return;
			}
		}
		System.out.println(true);

	}

}
