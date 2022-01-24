package Day_14;

import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePathWithJumps {

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
	        if(sr==dr&&sc==dc){
	            ArrayList<String> baseResult = new ArrayList<>();
	            baseResult.add("");
	            return baseResult;
	        }
	        ArrayList<String> Result = new ArrayList<>();
	        for(int h = 1;h<=dc-sc;h++){
	            ArrayList<String> Hori = getMazePaths(sr,sc+h,dr,dc);
	            for(String val:Hori){
	                Result.add("h"+h+val);
	            }
	        }
	          for(int v = 1;v<=dr-sr;v++){
	            ArrayList<String> verti = getMazePaths(sr+v,sc,dr,dc);
	            for(String val:verti){
	                Result.add("v"+v+val);
	            }
	        }
	          for(int d=1;d<=dc-sc&&d<=dr-sr;d++){
	            ArrayList<String> dig = getMazePaths(sr+d,sc+d,dr,dc);
	            for(String val:dig){
	                Result.add("d"+d+val);
	            }
	        }

	        return Result;
	    }

}
