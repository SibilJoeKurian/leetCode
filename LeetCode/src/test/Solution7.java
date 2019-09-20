package test;

/**
 * @author Sibil
 *Given a 32-bit signed integer, reverse digits of an integer.
 *L-size of integer
 */
class Solution7 {

	public static void main(String[] args) {
		int x =-2147483648 ;
		int y;
		long reverse = 0;
		int result;
		while (x != 0) {
			y = x % 10;
			reverse = reverse * 10 + y;
			x = x / 10;
		}
		if (reverse > Integer.MAX_VALUE||reverse<Integer.MIN_VALUE) {
			result=0;
		}else 
			result=(int) reverse;
		System.out.println("Reverse is less "+result);
		
		System.out.println(reverse);
		System.out.println(Integer.MAX_VALUE);
	}
}
