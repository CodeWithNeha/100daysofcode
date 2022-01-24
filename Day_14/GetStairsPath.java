package Day_14;

import java.util.ArrayList;
import java.util.Scanner;

public class GetStairsPath {

	public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<String> Result = getStairPaths(n);
        System.out.println(Result);
        }

    public static ArrayList<String> getStairPaths(int n) {
        if(n==0){
            ArrayList<String> baseResult = new ArrayList<>();
            baseResult.add("");
            return baseResult;
        }
        if(n<0){
            ArrayList<String> baseResult = new ArrayList<>();
            return baseResult;
        }
        ArrayList<String> path1 = getStairPaths(n-1);
        ArrayList<String> path2 = getStairPaths(n-2);
        ArrayList<String> path3 = getStairPaths(n-3);
        ArrayList<String> Result = new ArrayList<>();
        for(String path:path1){
            Result.add(1+path);
        }
          for(String path:path2){
            Result.add(2+path);
        }
          for(String path:path3){
            Result.add(3+path);
        }
        return Result;
    }
}
