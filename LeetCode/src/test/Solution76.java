package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javafx.util.Pair;

public class Solution76 {
	static HashMap<Character, Integer> mapStr1 = new HashMap<>();
	static HashMap<Character, Integer> mapStr2 = new HashMap<>();
	static int left;
	static int right;

	public static boolean compare(String s, String t) {
		// TODO Auto-generated method stub
		boolean result = true;
		HashMap<Character, Integer> sMap = new HashMap<>();
		for (int i = 0; i < s.length(); i++)
			if (sMap.containsKey(s.charAt(i)))
				sMap.put(s.charAt(i), (sMap.get(s.charAt(i)) + 1));
			else
				sMap.put(s.charAt(i), 1);
		//System.out.println(sMap);
		for (int i = 0; i < t.length(); i++)
			if (sMap.containsKey(t.charAt(i)))
				if ((sMap.get(t.charAt(i)) - 1) < 0) {
					result = false;
					break;
				} else
					sMap.put(t.charAt(i), (sMap.get(t.charAt(i)) - 1));

			else {
				result = false;
				break;
			}
		//System.out.println(result);
		return result;
	}

	public static String minWindow(String mainString, String t) {
		TreeMap<Integer, String> map = new TreeMap<>();

		left = 0;
		right = 0;
		int length = mainString.length();
		for (; left <= mainString.length(); left++) {
			while (right <= mainString.length()) {
				String tempString = mainString.substring(left, right);
				if (compare(tempString, t)) {
					//System.out.println("l PTR " + left + " R PTR" + right + " " + tempString);
					map.put(tempString.length(), tempString);
					break;
				} else if (right == mainString.length())
					break;
				else
					right++;
			}
		}
		String minString = "";
		if (map.size() > 0)
			minString = map.firstEntry().getValue();
		return minString;
	}

	public static void main(String[] args) {
		String s = "ADOBECODEBANC";
		String t = "ABC";
		System.out.println(minWindow(s, t));
		
	}

}
