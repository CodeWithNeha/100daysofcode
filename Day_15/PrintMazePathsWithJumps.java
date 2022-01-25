package Day_15;

import java.util.Scanner;

public class PrintMazePathsWithJumps {

	 public static void main(String[] args) throws Exception {
	        Scanner scn = new Scanner(System.in);
	        int n = scn.nextInt();
	        int m = scn.nextInt();
	        printMazePaths(1,1,n,m,"");
	    }

	    // sr - source row
	    // sc - source column
	    // dr - destination row
	    // dc - destination column
	    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
	        if(sr==dr&&sc==dc){
	            System.out.println(psf);
	            return;
	        }
	        if(sc<dc){
	            for(int i = 1;i<=dc-sc;i++){
	                printMazePaths(sr,sc+i,dr,dc,psf+"h"+i);
	            }
	        }
	        if(sr<dr){
	             for(int i = 1;i<=dr-sr;i++){
	                printMazePaths(sr+i,sc,dr,dc,psf+"v"+i);
	            }
	        }
	        if(sr<dr&&sc<dc){
	             for(int i = 1;i<=dc-sc&&i<=dr-sr;i++){
	                printMazePaths(sr+i,sc+i,dr,dc,psf+"d"+i);
	            }
	        }
	    }


}
