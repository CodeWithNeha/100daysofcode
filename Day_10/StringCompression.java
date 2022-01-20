package Day_10;

import java.util.Scanner;

public class StringCompression {

	public static String compression1(String str){
		int n = str.length();
		int index = 0;
		String out = ""+str.charAt(0);
		for(int i = 1;i<n;i++){
			if(out.charAt(index)!=str.charAt(i)){
				out += str.charAt(i);
				index++;
			}
		}

		return out;
	}

	public static String compression2(String str){
			int n = str.length();
		int index = 0;
		String out = ""+str.charAt(0);
		int count = 1;
		for(int i = 1;i<n;i++){
			if(str.charAt(i)==str.charAt(index)){
				count++;
			}
			else if(str.charAt(i)!=str.charAt(index)&&count!=1){
				out += ""+count+str.charAt(i);
				count = 1;
				index = i;
			}
			else{
				out +=str.charAt(i);
				index = i;
			}

		}
		if(count>1){
			out +=count;
		}

		return out;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

}
