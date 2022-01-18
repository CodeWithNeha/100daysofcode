package Day_8;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int space = 0;
        int star = n;
        for(int i = 0;i<=n;i++){
            for(int sp = 1;sp<=space;sp++){
                System.out.print("\t");
            }
            for(int st = 1;st<=star;st++){
                System.out.print("*\t");
            }
            star--;
            space++;
            System.out.println();
        }
	}

}
