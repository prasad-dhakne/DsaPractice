package strings;

public class Palindrome {
	public static void main(String[] args) {
		String str = "abcdfdcba";
		System.out.println(isPalindrome(str));
	}

	private static boolean isPalindrome(String str) {
		if(str == null || str.length() == 0) {
			return true;
		}
		int start = 0;
		int end = str.length() - 1;
		while(start <= end) {
			if(str.charAt(start) == str.charAt(end)) {
				start+=1;
				end-=1;
			}
			else {
				return false;
			}
		}
		return true;
	}
}
