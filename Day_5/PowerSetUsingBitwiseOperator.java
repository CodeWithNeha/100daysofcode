package Day_5;

public class PowerSetUsingBitwiseOperator {

	public static void main(String[] args) {
		String s = "abh";
		int n = s.length();
		int p = (int) Math.pow(2, n);
		for(int i = 0;i<p;i++) {
			for(int j = 0;j<n;j++) {
				if((i&(1<<j))!=0)
					System.out.print(s.charAt(j));
			}
			System.out.println();
		}

	}

}
