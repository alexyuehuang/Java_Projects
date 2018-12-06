package apartment;

public class Apartment {

	/**
	 * Complete this method. It takes in an array of random doubles and k-the stopping point. 
	 * Your code should iterate through the first k values of the array and record the maximum value.
	 * Then it should iterate through the remainder of the array and return the NEXT value 
	 * that is higher than one recorded in the first portion of the array.
	 * 
	 * @param values the array containing the random doubles
	 * @param k the integer representing the stopping point
	 * @return 
	 */
	public static double findBestValueAfterStopAtK(double[] values, int k) {
		double best=0;
		int g=0;
		for(int i=0; i<k; i++) {
			if(values[i]>best) {
				best=values[i];
				g=i;
			}
		}
			double ret=values[k];
			int i=k;
			while(best>=values[i]&&i<values.length-1) {
				ret=values[i+1];
				i++;
			}
			return ret;
		
	}

	/**
	 * You'll need to complete this method as well. It takes in number of apartments the user is considering. 
	 * Do not worry about the specific value of options, but it should suggest
	 *   the size of the array you are using.
	 * Finally, the method should return the integer which represents the optimal stopping point.
	 * 
	 * @param apartments-the number of apartments being considered
	 * @param trials-the number of experimentation trials done for a specific stopping point
	 * @return 
	 */
	public static int findOptimalStoppingPoint(int apartments, int trials) {
//		double[] sum=new double [apartments];
//		for(int i=0; i<trials*; i++) {
//			
//			double []values=new double[apartments];
//			for(int j=0; j<values.length; j++) {
//				values[j]=Math.random();
//			}
//			
//			double[]b=new double[apartments-1];
//			for(int j=0; j<b.length; j++) {
//				b[j]=Apartment.findBestValueAfterStopAtK(values, j+1);
//			}
//			sum[(int)Apartment.findBestValueAfterStopAtK(b, b.length)]++;
//			
//		}
//		for(double i:sum) {
//		System.out.println(i);
//		}
//		double k=Apartment.findBestValueAfterStopAtK(sum, sum.length);
//		return (int)k+2;
		int[] sum= new int [apartments-1];
		for(int i=0; i<apartments-1; i++) {
			for(int j=0; j<trials; j++) {
				double []values=new double[apartments];
				for(int k=0; k<values.length; k++) {
					values[k]=Math.random();
				}
				double best=0;
				for(int k=0; k<values.length; k++) {
					if(values[k]>best) {
						best=values[k];
					}
				}
				if(best==Apartment.findBestValueAfterStopAtK(values, i+1)) {
					sum[i]++;
				}
			}
		}
		double max=0;
		int where=0;
		for(int k=0; k<sum.length; k++) {
			if(sum[k]>max) {
				max=sum[k];
				where=k;
			}
		}
		return where+1;
	}
}
