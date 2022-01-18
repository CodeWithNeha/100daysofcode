package Day_8;

import java.util.Scanner;

public class RotateANumber {

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
	   
	     int div = 0;
	     int rot = 0;
	     int i = k;
	     int mul = 1;
	     while(i>0){
	       int rem = temp%10;
	       rot = rot + rem*mul;
	       mul = mul*10;
	       div = temp/10;
	       temp = temp/10;
	       i--;
	     }
	     digit = digit-k;
	     int rotated = rot*(int)Math.pow(10,digit)+div;
	     System.out.println(rotated);

	}

}
