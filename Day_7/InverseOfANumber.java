package Day_7;

import java.util.Scanner;

public class InverseOfANumber {

	public static void main(String[] args) {
		  Scanner scn = new Scanner(System.in);
		  int n = scn.nextInt();
		  int inv = 0;
		  int count = 1;
		  while(n!=0){
		    int rem = n%10;
		    inv += (int)Math.pow(10,rem-1)*count;
		    n = n/10;
		    count++;
		  } 
		  System.out.println(inv);
		 }

}
