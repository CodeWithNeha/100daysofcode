package Day_14;

import java.util.ArrayList;
import java.util.Scanner;

public class GetKeyPadCombination {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        ArrayList<String> result = getKPC(str);
        System.out.println(result);
    }
    static String[] codes= {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static ArrayList<String> getKPC(String str) {
        if(str.length()==0){
            ArrayList<String> baseResult = new ArrayList<>();
            baseResult.add("");
            return baseResult;
        }

        char ch = str.charAt(0);
        String restString = str.substring(1);
        ArrayList<String> restResult = getKPC(restString);
        ArrayList<String> Result = new ArrayList<>();

        String ccCode = codes[ch-'0'];
        for(int i = 0;i<ccCode.length();i++){
            char CharCh = ccCode.charAt(i);
            for(String val:restResult){
                Result.add(CharCh+val);
            }
        }

        return Result;
    }
}
