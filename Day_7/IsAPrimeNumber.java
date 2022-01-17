package Day_7;

import java.util.Scanner;

public class IsAPrimeNumber {

	public static void main(String[] args) {
	      Scanner scn = new Scanner(System.in);
	      int n = scn.nextInt();
	      int flag = 0;
	      while(n>0){
	        flag = 0;
	        int num = scn.nextInt();
	        for(int i = 2;i*i<=num;i++){
	        if(num%i==0){
	          flag = 1;
	          break;
	        }
	      }
	      if(flag==1){
	          System.out.println("not prime");
	      }
	      else{
	        System.out.println("prime");
	      }
	      n--;
	      }
	   }
}
