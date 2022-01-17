package Day_7;

import java.util.Scanner;

public class PrintAllPrimeTillN {
	public static boolean isPrime(int num){
        for(int i = 2;i*i<=num;i++){
	        if(num%i==0){
                return false;
	        }
        }
        return true;
    }
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int low = scn.nextInt();
      int high = scn.nextInt();
      while(low<=high){
          if(isPrime(low)){
              System.out.println(low);
          }
          low++;
      }
    }
}
