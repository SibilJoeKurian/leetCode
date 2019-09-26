package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Sibil 3:14pm
 *
 */
public class Solution3 {
	public static boolean checkRepeating(String str) {
		boolean repeat = false;
		ArrayList<String> list = new ArrayList<String>();
		HashMap<Character, Integer> map = new HashMap<>();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!map.containsKey(ch)) {
				count = 0;
				map.put(ch, count);
			} else
				repeat = true;
		}
		return repeat;
	}

	public static void main(String[] args) {
	String s=" a b";
		int length = 0;
		if (s.length() == 0) {
			length = 0;
		} else if (s.equals(" "))
			length = 1;
		else {
			for (int i = 0; i <= s.length(); i++) {

				for (int j = i ; j <= s.length(); j++) {
					boolean repeat = checkRepeating(s.substring(i, j));
					if (repeat == false) {

						if (length < s.substring(i, j).length()) {
							length = s.substring(i, j).length();
							System.out.println(s.substring(i, j));
						}

					}

				}
			}
		}
		System.out.println(length);

	}
}
