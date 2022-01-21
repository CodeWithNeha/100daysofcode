package Day_11;

import java.util.Scanner;

public class PrintAllPermutationOfAStringIteratively {

	public static int fact(int n){
		if(n<=1){
			return 1;
		}
		return n*fact(n-1);
	}
	public static void solution(String str){
		int n = str.length();
		int f = fact(n);
		for(int i = 0;i<f;i++){
			StringBuilder st = new StringBuilder(str);
			int temp = i;
			for(int div = n;div>=1;div--){
				int rem = temp%div;
				int quo = temp/div;
				System.out.print(st.charAt(rem));
				st.deleteCharAt(rem);
				temp = quo;
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}
