package Day_6;

import java.util.Scanner;

public class Print1toNUsingTailRecursion {


	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		fun(n,1);

	}

	private static void fun(int n,int k) {
		if(n==0) {
			return;
		}
		System.out.print(k+" ");
		fun(n-1,k+1);
		
	}

}
