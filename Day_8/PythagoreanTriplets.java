package Day_8;

import java.util.Scanner;

public class PythagoreanTriplets {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		   int a = scn.nextInt();
		   int b = scn.nextInt();
		   int c = scn.nextInt();
		   if(a>b&&a>c){
		     boolean val = (a*a)==(b*b+c*c);
		     System.out.println(val);
		   }
		   else if(b>a&&b>c){
		       boolean val = (b*b)==(a*a+c*c);
		     System.out.println(val);
		   }
		   else{
		       boolean val = (c*c)==(b*b+a*a);
		     System.out.println(val);
		   }
	}

}
