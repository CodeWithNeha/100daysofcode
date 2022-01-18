package Day_8;

import java.util.Scanner;

public class RotateANumber2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		  int n = scn.nextInt();
		     int k = scn.nextInt();
		     int temp = n;
		     int digit = 0;
		     while(temp>0){
		       digit++;
		       temp = temp/10;
		     }
		     k = k%digit;
		     if(k<0){
		       k = digit+k;
		     } 
		     temp = n;
		     int div = 1;
		     int mul = 1;
		     for(int i = 1;i<=digit;i++) {
		    	 if(i<=k) {
		    		 div *=10;
		    	 }
		    	 else {
		    		 mul *=10;
		    	 }
		     }
		     int rem = n%div;
		     int quo = n/div;
		     int rotated = rem*mul + quo;
		     System.out.println(rotated);
	}

}
