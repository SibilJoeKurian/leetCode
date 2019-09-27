package test;

import java.util.HashMap;

public class Solution76 {
	static HashMap<Character, Integer> mapStr1 = new HashMap<>();
	static HashMap<Character, Integer> mapStr2 = new HashMap<>();
	static int left;
	static int right;

	public static boolean contains(String str1, String str2) {

		boolean isContains = false;
		mapString(str1, mapStr1);
		mapString(str2, mapStr2);

		boolean result = checkHashMap();
		System.out.println("Resykt" + result);
		return isContains;
	}

	private static boolean checkHashMap() {
		// TODO Auto-generated method stub
		boolean checkValue = false;
		boolean checkFlagCounter;
		if (mapStr1.size() < mapStr2.size())// check size of str1 is less than str2
			return checkValue;
		else {
			for (Object key : mapStr2.keySet()) {
				Integer charCountStr2 = mapStr2.get(key);
				if (mapStr1.containsKey(key)) // check str1 contains the char
				{
					Integer charCountStr1 = mapStr1.get(key);
					if (charCountStr1 < charCountStr2) // check str1 size with str2
						return checkValue;
				} else
					return checkValue;
			}
			checkValue = true;
		}

		return checkValue;
	}

	public static void mapString(String str, HashMap<Character, Integer> map) {
		for (int i = 0; i < str.length(); i++) {
			if (map.containsKey(str.charAt(i))) {
				int count = map.get(str.charAt(i));
				map.put(str.charAt(i), ++count);
			} else
				map.put(str.charAt(i), 1);
		}
	}

	public static void displayMap() {
		System.out.println(mapStr1);
		System.out.println(mapStr2);
	}

	public static String minWindow(String mainString, String t) {
		String minString = "";
		left = 0;
		right = 0;
		
		return minString;
	}

	private static boolean makeString(int left2, int right2) {
		// TODO Auto-generated method stub
		
		return false;
	}

	public static void main(String[] args) {
		String s = "ADOECODEBANC";
		String t = "ANQ";
		minWindow(s, t);
		contains(s, t);
		displayMap();
	}
}
