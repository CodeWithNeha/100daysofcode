package Day_14;

import java.util.ArrayList;
import java.util.Scanner;

public class GetMathPath {

	public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        ArrayList<String> Result = getMazePaths(1,1,n,m);
        System.out.println(Result);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr==dr&&dc==sc){
            ArrayList<String> baseResult = new ArrayList<>();
            baseResult.add("");
            return baseResult;
        }

        ArrayList<String> Hori = new ArrayList<>();
        ArrayList<String> verti = new ArrayList<>();
        if(sc<dc){
            Hori = getMazePaths(sr,sc+1,dr,dc);
        }
        if(sr<dr){
            verti = getMazePaths(sr+1,sc,dr,dc);;
        }
        ArrayList<String> Result = new ArrayList<>();
        for(String val : Hori){
            Result.add("h"+val);
        }
         for(String val : verti){
            Result.add("v"+val);
        }
        return Result;
    }

}
