package fibonacci;

public class Fibonacci {
	
	/**
	 * Below copy your solution to recursive Fibonacci from studio
	 * @param n
	 * @return fib(n), computed recursively
	 */
	public static int recursive(int n) {
		if (n <= 1) {
			return n;
		}
		else {
			return recursive(n-1) + recursive(n-2);
		}
	}
	
	/**
	 * Below write your solution to Fibonacci, using iteration
	 * @param n
	 * @return fib(n), computed iteratively
	 */
	public static int iterative(int n) {
		int a =0; 
		int b=1;
		int c=0;
		for(int i=0; i<(n-1); i++) {
			if(c%2==0) {
				a =a+b;
			}
			else {
				b=b+a;
			}
			c++;
		}
		if(n%2==0) {
			return a;
		}
		else {
			return b;
		}
		
	}

}
