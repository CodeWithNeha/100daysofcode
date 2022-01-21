package Day_11;

import java.util.Scanner;

public class AnyBaseMultiplication {
	public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
	    int b = scn.nextInt();
	    int n1 = scn.nextInt();
	    int n2 = scn.nextInt();

	    int d = getProduct(b, n1, n2);
	    System.out.println(d);
	 }

	 public static int getSingleProduct(int b,int n1,int d2){
	     int num = 0;
	     int mul = 1;
	     int c = 0;
	    while(n1>0||c>0){
	        int d1 = n1%10;
	        n1 = n1/10;
	        int d = (d1*d2) + c;
	        c = d/b;
	        d = d%b;
	        num += d*mul;
	        mul = mul*10;
	    }
	    return num;
	 }
	 public static int getProduct(int b, int n1, int n2){
	     int num = 0;
	     int mul = 1;
	     while(n2>0){
	         int d2 = n2%10;
	         n2=n2/10;
	         int siP = getSingleProduct(b,n1,d2);
	         num = getSum(b,num,siP*mul);
	         mul = mul*10;
	     }
	     return num;
	 }
	  public static int getSum(int b, int n1, int n2){
		       int num = 0;
		       int mul = 1;
		       int c = 0;
		       while(n1>0||n2>0||c>0){
		           int rem1 = n1%10;
		           int rem2 = n2%10;
		           int d = rem1+rem2+c;
		            c = d/b;
		            d = d%b;
		           num += d*mul;
		           mul = mul*10;
		           n1 = n1/10;
		           n2 = n2/10;   
		       }
		       return num;
		   }

}
