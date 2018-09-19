package exercises4;

import sedgewick.StdIn;
import cse131.ArgsProcessor;

public class Stats {

	public static void main(String[] args) {
		// prompt the user for the file to be used for this run 
		ArgsProcessor.useStdInput("datafiles/average");
		
		//
		//  Read in the data from the opened file, computing the
		//     sum, average, count, max, and min
		//  of the data
		//
		double sum =0;
		int count = 1;
		double max = 0;
		double min = StdIn.readDouble();
		while (!StdIn.isEmpty()) {
			double d = StdIn.readDouble();
			count++;
			sum = sum +d;
			if (d>max) {
				max =d;
			}
			if (d<min) {
				min = d;
			}
		}
		double average = sum/(double)count;
		System.out.println(sum +"\n"+ count+"\n"+ average+ "\n"+ max +"\n"+ min);
		//  count is the number of doubles read from the file
		//  The other statistics should be clear from their names
		//

	}

}
