package Day_10;

import java.util.Scanner;

public class StringWithDifferenceOfEveryTwoConsecutiveCharacters {

	public static String solution(String str){
		String out = ""+str.charAt(0);
        int index = 0;
        for(int i = 1;i<str.length();i++){
            out += str.charAt(i) - str.charAt(i-1) +"" + str.charAt(i);
        }
		return out;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}

}
