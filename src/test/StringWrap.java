package test;

public class StringWrap {

	public static void main(String[] args) {
		String input = "Hi how are you if you are doing good or not I was just checking";
		textWrap(input);

	}

	public void textWrapUtils(String str) {

	}

	private static void textWrap(String input) {
		char[] inputStrChar = input.toCharArray();
		char[] newWordChar = new char[13];
		int count = 0;
		int temp = 0;

		for (int i = 0; i < inputStrChar.length; i++) {
			if (count < 13) {
				if (inputStrChar[i] == ' ' && count != 0) {
					temp = input(inputStrChar, count);
				}
				if (temp > 12) {
					System.out.printf("%n");
					count = 0;
					temp = 0;
				} else {
					System.out.print(inputStrChar[i]);
					count++;

				}

			}

		}

	}

	private static int input(char[] inputStrChar, int count) {

		for (int i = count + 1; inputStrChar[i] != ' '; i++) {
			count++;
		}
		return count;

	}

}
