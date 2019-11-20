package test;

public final class Palindrome {
	public static boolean isPalindrome(String word) {
		char[] strChar = word.toCharArray();
		String reverse = "";

		if (reverse.equals(word))
			return true;
		return false;

	}

	public static void main(String[] args) {
		System.out.println(Palindrome.isPalindrome("Deleveled"));
	}
}
