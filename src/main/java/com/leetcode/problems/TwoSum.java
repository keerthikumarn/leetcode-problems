package com.leetcode.problems;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		int result1[] = twoSum(new int[] { 2, 7, 11, 15 }, 9);
		System.out.println(result1[0]+" AND "+ result1[1]);
		int result2[] = twoSum(new int[] { 1, 2, 3 }, 4);
		System.out.println(result2[0]+" AND "+ result2[1]);
	}

	private static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> resultNumMap = new HashMap<>();
		int[] returns = new int[2];
		for (int idx = 0; idx < nums.length; idx++) {
			Integer currentNum = nums[idx];
			Integer searchingForTheNum = target - currentNum;
			if (resultNumMap.containsKey(searchingForTheNum)) {
				returns[0] = resultNumMap.get(searchingForTheNum);
				returns[1] = idx;
				return returns;
			} else {
				resultNumMap.put(currentNum, idx);
			}
		}
		return returns;
	}

}
