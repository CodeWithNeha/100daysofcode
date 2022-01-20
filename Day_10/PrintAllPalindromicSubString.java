package Day_10;

import java.util.Scanner;

public class PrintAllPalindromicSubString {
	public static boolean isPalindrome(String str){
		int low = 0,high = str.length()-1;
		while(low<high){
			if(str.charAt(low)!=str.charAt(high)){
				return false;
			}
			low++;
			high--;
		}
		return true;
	}
	public static void solution(String str){
		for(int i = 0;i<str.length();i++){
			for(int j = i+1;j<=str.length();j++){
				if(isPalindrome(str.substring(i,j))){
				System.out.println(str.substring(i,j));
			}
			}
			
		}
		
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}


}
