package Day_10;

import java.util.Scanner;

public class ToggleCase {

	public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        String out = "";
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i)>='a'&&str.charAt(i)<='z'){
                out += Character.toUpperCase(str.charAt(i));
            }
            else{
                out += Character.toLowerCase(str.charAt(i));
            }
        } 
        System.out.println(out);
    }

}
