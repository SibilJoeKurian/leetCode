package test;
//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
class Solution1 {
	public int[] twoSum(int[] nums, int target) {
		int temp;
		int[] twoSums = new int[2];
		for (int i = 0; i < nums.length; i++) {
			if ((i + 1) < nums.length) {
				for (int j = i + 1; j < nums.length; j++) {
					temp = nums[i];
					int sum = temp + nums[j];
					if (sum == target) {
						twoSums[0] = i;
						twoSums[1] = j;
						//System.out.println(twoSums[0] + " " + twoSums[1]);
						//System.out.println(i + " " + j);
						return twoSums;
					}
				}
			}
		}
		return twoSums;
	}

	public static void main(String[] args) {
		Solution1 s = new Solution1();
		int a[] = { 3, 2, 4 };
		int b[] = s.twoSum(a, 6);
		System.out.println(b[0] + " " + b[1]);
	}
}
