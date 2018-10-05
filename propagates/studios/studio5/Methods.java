package studio5;

public class Methods {
	
	/**
	 * Implemented correctly
	 * @param x one thing to add
	 * @param y the other thing to add
	 * @return the sum
	 */
	public static int sum(int x, int y) {
		return x+y;
	}
	
	/**
	 * 
	 * @param x one factor
	 * @param y another factor
	 * @return the product of the factors
	 */
	public static int mpy(int x, int y) {
		return x*y;  // FIXME
	}
	/**
	 * 
	 * @param x one int
	 * @param y another int
	 * @param z another int
	 * @return the average of the integers 
	 */
	
	
	public static double avg3(int x, int y, int z) {
		return (x+y+z)/3.0;
	}
	
	/**
	 * 
	 * @param x an array
	 * @return sum of the array
	 */
	public static double sumArray(double[] x) {
		double sum = 0;
		for (int i=0; i< x.length; i++) {
			sum += x[i];
		}
		return sum;
	}
	/**
	 * 
	 * @param x an double array
	 * @return average of the doubles in x
	 */
	public static double average(double[] x) {
		double sum = 0;
		for (int i=0; i< x.length; i++) {
			sum += x[i];
		}
		return sum/ (double) x.length;
	}
	/**
	 * 
	 * @param x an array of doubles
	 * @return return the maximum in the array - minimum of the array
	 */
	public static double maxMINUSminimum(double [] x) {
		double min = x[0];
		double max = x[0];
		for (int i = 0; i<x.length;i++) {
			if (x[i] < min) {
				min = x[i];
			}
			if (x[i] > max) {
				max = x[i];
			}
		}
		return max - min;
	}
	/**
	 * 
	 * @param x a string
	 * @return pig latin of the string
	 */
	public static String pig(String x) {
		String x1 = x.substring(1);
		String x2 = x.substring(0, 1);
		String x3 = "ay";
		return x1 + x2 + x3;
	}


}
