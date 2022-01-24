package Day_14;

import java.util.ArrayList;
import java.util.Scanner;

public class GetSubsequence {
	public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        ArrayList<String> result = gss(str);
        System.out.println(result);
    }

    public static ArrayList<String> gss(String str) {
        if(str.length()==0){
            ArrayList<String> BaseResult = new ArrayList<>();
            BaseResult.add("");
            return BaseResult;
        }
        char ch = str.charAt(0);
        String restStr = str.substring(1);
        ArrayList<String> restResult = gss(restStr);
        ArrayList<String> result = new ArrayList<>();
        for(String val: restResult){
            result.add(""+val);
        }
        for(String val: restResult){
            result.add(ch+val);
        }
        return result;
    }

}
