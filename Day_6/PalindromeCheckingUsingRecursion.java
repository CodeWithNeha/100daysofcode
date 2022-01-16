package Day_6;

public class PalindromeCheckingUsingRecursion {

	public static void main(String[] args) {
		String s = "neha";
		System.out.println(isPalindrome(s,0,s.length()-1));

	}

	private static boolean isPalindrome(String s,int start,int end) {
		if(start>=end)
			return true;
		return (s.charAt(start)==s.charAt(end))&&isPalindrome(s,start+1,end-1);
	}

}
