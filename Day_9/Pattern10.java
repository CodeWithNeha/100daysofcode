package Day_9;

import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	    int star = 1;
	    int space = n/2;
	    for(int i = 1;i<=n;i++){
	        for(int sp=1;sp<=space;sp++){
	            System.out.print("\t");
	        }
	        for(int st=1;st<=star;st++){
	            if(st==1||st==star){
	                System.out.print("*\t");
	            }
	            else{
	                System.out.print("\t");
	            }
	        }
	        if(i<=n/2){
	            star +=2;
	            space--;
	        }
	        else{
	            star -=2;
	            space++;
	        }
	        System.out.println();
	    }
	}

}
