package Day_10;

import java.util.Scanner;

public class RingRotate {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		int[][] arr = new int[n][m];
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<m;j++) {
				arr[i][j] = scn.nextInt();
			}
		}
		int s = scn.nextInt();
		int r = scn.nextInt();
		
		rotateShell(arr,s,r);
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<m;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

	private static void rotateShell(int[][] arr, int s, int r) {
		int[] oneD = fillOneDFromShell(arr,s);
		rotateOneD(oneD,r);
		fillShellFromOneD(arr,oneD,s);
	}

	private static void fillShellFromOneD(int[][] arr, int[] one, int s) {
		int minc = s-1;
		int minr = s-1;
		int maxr = arr.length -(s-1)-1;
		int maxc = arr[0].length - (s-1)-1;
		int index = 0;
		// lw
		for(int i = minr;i<=maxr;i++) {     
			arr[i][minc] = one[index] ;
			index++;
		}
		// bw
		for(int i = minc+1;i<=maxc;i++) {
			 arr[maxr][i]=one[index];
			index++;
		}
		// rw
		for(int i = maxr-1;i>=minr;i--) {
			arr[i][maxc] = one[index];
			index++;
		}
		// tw
		for(int j=maxc-1;j>=minc+1;j--) {
		    arr[minr][j] = one[index];
			index++;
		}
	}

	private static void rotateOneD(int[] oneD, int r) {
		 r = r % oneD.length;
	      if (r < 0) {
	         r += oneD.length;
	      }
		reverse(oneD,0,oneD.length-1-r);
		reverse(oneD,oneD.length-r,oneD.length-1);
		reverse(oneD,0,oneD.length-1);
	}

	private static void reverse(int[] oneD, int i, int j) {
		while(i<j) {
			int temp = oneD[i];
			oneD[i] = oneD[j];
			oneD[j] = temp;
			i++;
			j--;
		}
		
	}

	private static int[] fillOneDFromShell(int[][] arr, int s) {
		int r2d = arr.length;
	    int c2d = arr[0].length;
	    int rshell = r2d - 2 * (s - 1);
	    int cshell = c2d - 2 * (s - 1);
	    int size = 2 * (rshell + cshell) - 4;
		int minc = s-1;
		int minr = s-1;
		int maxr = arr.length -(s-1)-1;
		int maxc = arr[0].length - (s-1)-1;
		int[] one = new int[size];
		int index = 0;
		// lw
		for(int i = minr;i<=maxr;i++) {     
			one[index] = arr[i][minc];
			index++;
		}
		// bw
		for(int i = minc+1;i<=maxc;i++) {
			one[index] = arr[maxr][i];
			index++;
		}
		// rw
		for(int i = maxr-1;i>=minr;i--) {
			one[index] = arr[i][maxc];
			index++;
		}
		// tw
		for(int j=maxc-1;j>=minc+1;j--) {
			one[index] = arr[minr][j];
			index++;
		}
		return one;
	}

}
