package Day_8;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int space = n-1;
        for(int i = 1;i<=n;i++){
            for(int sp=1;sp<=space;sp++){
                System.out.print("\t");
            }
            for(int j = 1;j<=i;j++){
                System.out.print("*\t");
            }
            space--;
            System.out.println();
        }
	}

}
