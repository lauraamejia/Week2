
public class calculator {
	public static int sum(int a, int b) {
		return a + b;
		}

		public int subtraction(int a, int b) {
		return a - b;
		}
		
	public String checkPalindrome(String word) {

		String word1 = word.toLowerCase().replaceAll("\\s+", "");

		String word2 = "";

		for (int i = word1.length() - 1; i >= 0; i--) {
			word2 = word2 + word1.charAt(i);
		}

		if (word1.equals(word2)) {
			return "It is palindrome";
		} else {
			return "It is not palindrome";
		}

	}

	public boolean logic(boolean condition1, boolean condition2) {
		return condition1 && condition2;
	}

	public int[] addVectors(int[] a, int[] b) {
		int result1 = a[0] + a[a.length - 1];
		int result2 = b[0] + b[b.length - 1];

		if (result1 > result2) {
			return a;
		} else {
			return b;
		}
	}
}
