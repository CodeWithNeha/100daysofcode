package Day_8;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int star = n;
        for(int i = 1;i<=n;i++){
            for(int st = 1;st<=star;st++){
                if(st==star)
                System.out.print("*\t");
                else
                System.out.print("\t");
            }
            star--;
            System.out.println();
        }
	}

}
