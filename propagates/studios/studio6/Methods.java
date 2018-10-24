package studio6;

public class Methods {

	// Your methods go below this line
	public static int fact(int n) {
		if (n <= 0) {
			return 1;
		}
		else {
			return n * fact(n-1);
		}
	}
	
	public static int fib(int n) {
		if (n <= 1) {
			return n;
		}
		else {
			return fib(n-1) + fib(n-2);
		}
	}
	
	public static boolean isOdd(int n) {
		if (n <= 0) {
			return false;
		}
		else {
			return !isOdd(n-1);
		}
	}
	
	public static int sum(int a, int b) {
		if (b <= 0) {
			return a;
		}
		else {
			return sum(a+1,b-1);
		}
  	}
	
	public static int sumDownBy2(int n) {
		if (n==0) {
			return 0;
		}
		else if (n==1) {
			return 1;
		}
		else {
			return n + sumDownBy2(n-2);
		}
	}
	
	public static double harmonicSum(int n) {
		if (n==1) {
			return 1;
		}
		else {
			return 1.0/n + harmonicSum(n-1); 
		}
	}
	
	public static int mult(int a,int b) {
		if (b == 0) {
			return 0;
		}
		else {
			return mult(a,b-1) + a;
		}
	}
	
	
	public static int f(int x) {
		if (x>100) {
			return x - 10;
		}
		else {
			return f(f(x+11));
		}
	}
	
	public static int g(int x, int y) {
		if (x==0) {
			return y + 1;
		}
		else if (x>0 && y == 0) {
			return g(x-1,1);
		}
		else {
			return g(x-1, g(x,y-1));
		}
	}
	
	
	
	
	
	
}
