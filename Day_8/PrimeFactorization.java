package Day_8;

import java.util.Scanner;

public class PrimeFactorization {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		  int n = scn.nextInt();
		  int temp = n;
		  for(int i = 2;i*i<=n;i++){
		      while(temp%i==0){
		        temp = temp/i;
		        System.out.print(i+" ");
		      }
		  } 
		  if(temp>1){
		      System.out.print(temp);
		  }

	}

}
