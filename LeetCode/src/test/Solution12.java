package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class Solution12 {
	 TreeMap<Integer, String> map = new TreeMap<>();
	 ArrayList<Integer> min = new ArrayList<>();
	 String value = "";

	public  String intToRoman(int num) {
		String value = "";
		mapValues();
		if (map.containsKey(num)) {
			value = map.get(num);
		} else {
			findMin(num);
			//System.out.println(getValue(num));
			value=getValue(num);

		}
		return value;

	}

	private  String getValue(int num) {
		// TODO Auto-generated method stub
		if (num <= 0)
			return value;
		if (min.get(min.size() - 1) - num == 1) {
			value =value+ map.get(1) + map.get(min.get(min.size() - 1));
			num = num - min.get(min.size() - 1);
			value=getValue(num);
		} else {			
			min.clear();
			findMinimum(num);
			num = num - min.get(min.size() - 1);
			value = value + map.get(min.get(min.size() - 1));
			value=getValue(num);
		}
		return value;
	}

	private  void findMin(int num) {
		for (int no : map.keySet())
			if (no < num)
				min.add(no);
			else {
				min.add(no);
				break;
			}
	}

	private  void findMinimum(int num) {
		for (int no : map.keySet())
			if (no <= num)
				min.add(no);
			else
				break;
	}

	private  void mapValues() {
		// TODO Auto-generated method stub
		map.put(1, "I");
		map.put(5, "V");
		map.put(10, "X");
		map.put(50, "L");
		map.put(100, "C");
		map.put(500, "D");
		map.put(1000, "M");
	}

	public static  void main(String[] args) {
		Solution12 t=new Solution12();
		System.out.println(t.intToRoman(900));
		//System.out.println(min);
	}
}
