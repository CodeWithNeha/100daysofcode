package Day_8;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i = 1;i<=n;i++){
            for(int star = 1;star<=i;star++){
                if(star==i){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
	}

}
