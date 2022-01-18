package Day_8;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int star = n/2+1;
        int space = 1;
        for(int i = 1;i<=n;i++){
            for(int st = 1;st<=star;st++){
                System.out.print("*\t");
            }
            for(int sp = 1;sp<=space;sp++){
                System.out.print("\t");
            }
            for(int st = 1;st<=star;st++){
                System.out.print("*\t");
            }
            if(i<n/2+1){
                star--;
                space +=2;
            }
            else{
                star++;
                space -=2;
            }
            System.out.println();
        }
	}

}
