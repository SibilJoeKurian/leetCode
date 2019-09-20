package test;

/**
 * @author Sibil Determine whether an integer is a palindrome. An integer is a
 *         palindrome when it reads the same backward as forward.
 */
public class Solution9 {
	public static void main(String[] args) {
		int x = -121;
		int copyOfx=x;
		boolean result = false;
		int reverse=0;
		int reminder;
			
		while (x != 0) {
			reminder=x%10;
			reverse=reverse*10+reminder;
			x=x/10;
		}
		
		if(String.valueOf(reverse).equals(String.valueOf(copyOfx)))
			result=true;
		if(String.valueOf(copyOfx).contains("-"))
			result=false;
		System.out.println(result);
	}
}
