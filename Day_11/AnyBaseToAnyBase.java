package Day_11;

import java.util.Scanner;

public class AnyBaseToAnyBase {

	public static void main(String[] args) {
	      Scanner scn = new Scanner(System.in);
	      int n = scn.nextInt();
	      int sourceBase = scn.nextInt();
	     int  destBase= scn.nextInt();
	     System.out.println(anyToAny(n,sourceBase,destBase));
	   }   
	   public static int anyToAny(int n,int src,int dest){
	       int dec = anyToDec(n,src);
	       int any = decToAny(dec,dest);
	       return any;
	   }
	   public static int anyToDec(int n,int b){
	       int dec = 0;
	       int mul = 1;
	       while(n>0){
	           int rem = n%10;
	           dec += rem*mul;
	           mul = mul*b;
	           n = n/10;
	       }
	       return dec;
	   }
	   public static int decToAny(int n,int b){
	       int any = 0;
	       int mul = 1;
	       while(n>0){
	           int rem = n%b;
	           any += rem*mul;
	           mul = mul*10;
	           n = n/b;
	       }
	       return any;
	   }

}
