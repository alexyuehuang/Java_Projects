package studio5;

public class BonusMethods {

	public static int sumDownBy2(int n) {
		int sum = 0;
		for (int i = n; i > 0; i -= 2) {
			sum += i;
		}
		return sum;
	}
	
	public static double harmonicSum(int n) {
		double sum = 0 ;
		for (int i = 1; i <= n;i++ ) {
			sum+= (double)1.0 / i;
		}
		return sum;
	}
	
	public static double geometricSum(int n) {
		double sum = 0 ;
		for (int i = 0; i <= n;i++ ) {
			sum+= (double)1.0 / Math.pow(2, i);
		}
		return sum;
	}
	
	public static int multPos(int j, int k) {
		int product = 0;
		for (int i = 0; i < j; i ++) {
			product += k;
		}
		return product;
	}
	
	public static int mult(int j, int k) {
		int product = 0;
		for (int i = 0; i < Math.abs(j); i ++) {
			product += Math.abs(k);
		}
		if ((j > 0 && k <0) || (j<0 && k>0)) {
			product = -product;
		}
		
		return product;
	}
	
	public static int expt(int n, int k) {
		int result = 1;
		for (int i = 0; i<k; i++) {
			result = result * n;
		}
		return result;
	}

}
