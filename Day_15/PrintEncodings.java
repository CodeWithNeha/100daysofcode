package Day_15;

import java.util.Scanner;

public class PrintEncodings {

	 public static void main(String[] args) throws Exception {
	        Scanner scn = new Scanner(System.in);
	        String str = scn.next();
	        printEncodings(str,"");
	    }
	    static char[] code = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','x','y','z'};
	    public static void printEncodings(String str,String ans) {
	        if(str.length()==0){
	            System.out.println(ans);
	            return;
	        }
	        char cc = str.charAt(0);
	        if(cc=='0'){
	            return;
	        }
	        else{
	            String ros = str.substring(1);
	            char getCode = code[cc-'1'];
	            printEncodings(ros,ans+getCode);
	        }
	        if(cc!='0'){
	        	if(str.length()>=2) {
	            String cc10 = str.substring(0,2);
	            String ros10 = str.substring(2);
	            int cod = Integer.parseInt(cc10);
	            if(cod-1<=26){
	                char getCode10 = code[cod-1];
	                printEncodings(ros10,ans+getCode10);
	            }
	        	}
	        	else {
	        		return;	        	}
	        }
	        

	    }


}
