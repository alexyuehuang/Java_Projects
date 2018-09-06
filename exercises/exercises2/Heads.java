package exercises2;

import cse131.ArgsProcessor;

public class Heads {

	public static void main(String[] args) {

		// what are the concepts?
		ArgsProcessor ap = new ArgsProcessor(args);
		int n = ap.nextInt("How many runs?");
		double sug = 0;
		for (int a = 0; a <n; ++a) {
		int numHeads = 0;
		int numFlips = 0;
		// now flip a coin until we see 10 heads
		while (numHeads !=10) {
			boolean isHeads = Math.random() < 0.5;
			if (isHeads) {
				numHeads = numHeads + 1;
			}
			numFlips = numFlips + 1;
		}
		sug = sug + numFlips;
			System.out.println("The number of flips was " + numFlips);
	}
		System.out.println("the average is " + (sug/n));
	}
		// here, numHeads should be 10
		
	

	}
