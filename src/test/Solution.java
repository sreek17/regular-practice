package test;

class Solution {
	public static boolean checkPossibility() {

		int[] nums = { 4, 2, 1 };
		for (int i = 0; i < nums.length;) {

			if (i != nums.length - 1 && nums[i] > nums[i + 1]) {
				nums[i] = 1;
			}

			if (i != nums.length - 1 && nums[i] >= nums[i + 1]) {
				return false;
			} else
				i++;

		}
		return true;
	}

	public static boolean checkPossibility2() {
		int[] nums = { 3, 4, 2, 3 };
		int count = 0;
		for (int i = 0; i < nums.length;) {

			if (i != nums.length - 1 && nums[i] > nums[i + 1]) {
				count++;
				nums[i] = nums[i + 1];
			}

			if (count == 2) {
				return false;
			}

			i++;

		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(checkPossibility2());
	}
}