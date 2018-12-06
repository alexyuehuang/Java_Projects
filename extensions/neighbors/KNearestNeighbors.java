package neighbors;

import java.util.Arrays;

public class KNearestNeighbors {
	
	/**
	 * This is the method you need to complete. It takes in a 2 dimensional array
	 * 	containing the data from real homes in Broward County, Florida you may have
	 * 	seen in extension 3.8.
	 * This array is formatted as follows:
	 * 				   {{price_0, x_0, y_0}
	 * 					{price_1, x_1, y_1}
	 * 						    ...
	 * 					{price_n, x_n, y_n}}
	 * price is the selling price of the house, x is its longitude and y is its latitude.
	 * Therefore, you would call house 0's latitude by writing homes[0][2].
	 * It also takes in the longitude and latitude coordinates of a hypothetical
	 *  house whose price you wish to predict.
	 * The final parameter is the amount of houses you wish to use to predict the price
	 *  of the hypothetical home.
	 * You will make this prediction by finding the k-nearest neighbors to the
	 * hypothetical home and averaging their prices.
	 *  
	 * @param homes the array containing the selling price and coordinates of
	 *  3389 homes in the format {price, x, y}
	 * @param x the longitude of the hypothetical house we are looking at
	 * @param y the latitude of the hypothetical house
	 * @param k the amount of houses with which to compare the price
	 * @return
	 */
	public static double predictPrice(double[][] homes, double x, double y, int k) {
		double sum=0;
		double []a=new double[homes.length];
		for (int i=0; i<homes.length; i++) {
			double diffx=Math.pow((x-homes[i][1]), 2);
			double diffy=Math.pow((y-homes[i][2]), 2);
			double dis=Math.sqrt(diffx+diffy);
			a[i]=dis;
		}
		double [] b=new double [k];
		for (int i=0; i<k; i++) {
			double nearest =10000000;
			int where=0;
			for(int j=0; j<homes.length; j++) {
				if (a[j]<nearest&&a[j]!=-1) {
					where=j;
					nearest=a[j];
				}
			}
			b[i]=where;
			a[where]=-1;
			sum=sum+homes[where][0];
		}
		sum=sum/k;
		return sum;
	}
}
