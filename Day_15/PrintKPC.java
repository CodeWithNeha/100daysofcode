package Day_15;

import java.util.Scanner;

public class PrintKPC {

	public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        printKPC(str,"");
    }
    static String[] code = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printKPC(String str, String asf) {
        if(str.length()==0){
            System.out.println(asf);
            return;
        }
        char ch = str.charAt(0);
        String getCode = code[ch-'0'];
        String ros = str.substring(1);
        for(int i = 0;i<getCode.length();i++){
            printKPC(ros,asf+getCode.charAt(i));
        }
    }


}
