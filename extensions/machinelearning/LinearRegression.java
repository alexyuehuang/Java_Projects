package machinelearning;

import java.awt.Color;

import org.junit.Assert;

import cse131.ArgsProcessor;
import sedgewick.StdDraw;
import sedgewick.StdIn;

public class LinearRegression {
	/**
	 * These are public class variables and are saved throughout the class
	 *  for use between methods.
	 * This allows us to access them at any point and also access them from
	 *  outside of the class so that we can test your code!
	 * You'll work with similar variables called instance variables 
	 *  when you start objects in Module 7.
	 */
	private static double slope = 0;
	private static double intercept = 0;
	
	/**
	 * This method gives us access to your y-intercept.
	 * @return intercept
	 */
	public static double getIntercept() {
		return intercept;
	}
	/**
	 * This method gives us access to your slope.
	 * @return slope
	 */
	public static double getSlope() {
		return slope;
	}

	/**
	 * This is what you need to complete. Using the equations provided on the course website,
	 * 	find the slope and y-intercept of the line that predicts how much a house with a given
	 *  square footage would cost. Make sure you use the slope and intercept static variables.
	 * There is sample data provided for you in the file at "datafiles/housing/pricesarea.prn"
	 * This data comes from actual homes sold in Broward County, Florida in 2017-2018.
	 * You can read the data using StdIn.readDoubles(), which will return a one dimensional
	 * 	array of doubles that is formatted as  {x1, y1, x2, y2,..., xn-1, yn-1, xn, yn},
	 * 	x being the square feet and y being the price. From there you can create another array
	 * 	if you want to make it easier to work with.
	 */
	public static void learn() {
		//FIXME: Write this method
	}
	/**
	 * You'll need to implement this as well. This method should return the predicted value
	 * 	of a home of a given square footage. Think about how the squareFeet variable relates
	 * 	to the equation of the line you found to make this prediction.
	 * 	The code should be very simple.
	 * @param squareFeet the square footage of the house you want to predict the price of
	 * @return the estimated price of the house
	 */
	public static double predictPrice(double squareFeet) {
		return 0; //FIXME
	}
	
	/**
	 * Here you should write code that plots the data points of the homes you pass it
	 * 	using StdDraw. It should also plot the regression line after plotting the points
	 * 	which you can do using either the line method or by sampling many different x values
	 * 	and plotting the points using your predict method. Examples are shown on the course
	 * 	website.
	 */
	public static void graph(double[][] homes) {
		//FIXME: Graph the data and the regression line
	}
	/**
	 * You can use this method to test your code.
	 * @param args
	 */
	public static void main(String[] args) {
		
	}
}
