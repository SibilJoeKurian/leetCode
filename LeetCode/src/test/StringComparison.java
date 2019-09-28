package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class StringComparison {

	public static void main(String[] args) {

		String s1 = "ADOBECODEBANC";
		String s = "AAB";
		String t = "AAAA";
		//compare(s, t);
		StringComparison.compare("ABC", "BC");
	}

	public static boolean compare(String s, String t) {
		// TODO Auto-generated method stub
		boolean result = true;
		HashMap<Character, Integer> sMap = new HashMap<>();
		HashMap<Character, Integer> tMap = new HashMap<>();
		for (int i = 0; i < s.length(); i++)
			if (sMap.containsKey(s.charAt(i)))
				sMap.put(s.charAt(i), (sMap.get(s.charAt(i)) + 1));
			else
				sMap.put(s.charAt(i), 1);
		System.out.println(sMap);
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
System.out.println(result);
	return result;
	}
}
