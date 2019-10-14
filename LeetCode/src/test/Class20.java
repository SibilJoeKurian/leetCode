package test;

import java.util.Stack;

public class Class20 {
	static Stack<String> stack = new Stack<String>();

	public static boolean isValid(String s) {
		boolean pattern = false;
		char ch;
		for (int i = 0; i < s.length(); i++) {
			ch = s.charAt(i);
			if (stack.isEmpty())
				stack.push(String.valueOf(ch));
			else if (stack.peek().equals("(") && ch == ')')
				stack.pop();
			else if(stack.peek().equals("{")&&ch=='}')
				stack.pop();
			else if (stack.peek().equals("[")&&ch==']')
				stack.pop();
			else 
				stack.push(String.valueOf(ch));
		}if(stack.isEmpty()) 
			pattern=true;
		
		return pattern;
	}

	public static void main(String[] args) {
		String s = "{[]}";
		System.out.println(isValid(s));;
	}
}
