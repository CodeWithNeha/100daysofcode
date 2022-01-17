package Day_7;

import java.util.Scanner;

public class DigitsOfANumber {

	public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	    int temp = n;
	    int count = 0;
	    while(temp>0){
	      count++;
	      temp = temp/10;
	    }
	    temp = n;
	    int div = (int)Math.pow(10,count-1);
	    while(div!=0){
	      int rem = temp/div;
	      System.out.println(rem);
	      temp = temp%div;
	      div = div/10; 
	    }
	   }

}
