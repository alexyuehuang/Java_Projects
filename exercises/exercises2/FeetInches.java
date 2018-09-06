package exercises2;

import cse131.ArgsProcessor;

public class FeetInches {

	public static void main(String[] args) {
		//
		// Prompt the user for a number of inches
		//
		ArgsProcessor ap=new ArgsProcessor(args);
		int inches = ap.nextInt("number of inches?");
		// Convert that into feet and inches
		//   BUT
		// Be sure to use the singular "foot" or "inch"
		//   where appropriate, as discussed in
		//   the introductory video
		//
		int foot = inches/12;
		int inchesEnd = inches%12;
		if (foot==1 && inchesEnd==1) {
			System.out.println(foot + " foot and " + inchesEnd + " inch");
		}
		if (foot==1 && inchesEnd!=1) {
			System.out.println(foot + " foot and " + inchesEnd + " inches");
		}
		if (foot!=1 && inchesEnd==1) {
			System.out.println(foot + " feet and " + inchesEnd + " inch");
		}
		if (foot!=1 && inchesEnd!=1) {
			System.out.println(foot + " feet and " + inchesEnd + " inches");
		}


		// For example, 61 inches would produce
		//    the output
		//   5 feet and 1 inch
		//

	}

}
