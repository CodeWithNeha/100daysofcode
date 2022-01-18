package Day_8;

import java.util.Scanner;

public class Gcd_LCM {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
	      int a = scn.nextInt();
	      int b = scn.nextInt();
	      int dividend = 0;
	      int divisor = 0;
	      if(a>b){
	        dividend = a;
	        divisor = b;
	      }
	      else{
	        dividend = b;
	        divisor = a;
	      }
	      while(dividend%divisor!=0){
	        int rem = dividend%divisor;
	        dividend = divisor;
	        divisor = rem;
	      }
	      System.out.println(divisor);
	      int lcm = (a*b)/divisor;
	      System.out.println(lcm);
	}

}
