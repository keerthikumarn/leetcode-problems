package com.leetcode.problems;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStrWithoutRepeatedChars {

	public static void main(String[] args) {
		String str = "pwwkew";
		System.out.println(longestSubStrWithoutRepeatedChars(str).length());
	}

	private static String longestSubStrWithoutRepeatedChars(String str) {
		if (str == null || str.length() == 0) {
			return null;
		}
		int maxLen = 0;
		int start = 0;
		Map<Character, Integer> map = new HashMap<>();
		for (int idx = 0; idx < str.length(); idx++) {
			if (map.containsKey(str.charAt(idx))) {
				start = Math.max(map.get(str.charAt(idx)), start);
			}
			map.put(str.charAt(idx), idx + 1);
			maxLen = Math.max(maxLen, idx - start + 1);
		}
		return maxLen == 0 ? "" : str.substring(start, start + maxLen);
	}

}
