package exercises1;

import cse131.ArgsProcessor;

public class Change {

	public static void main(String[] args) {
		//
		// Below, prompt the user to enter a number of pennies
		//
		ArgsProcessor ap = new ArgsProcessor(args);
		int cents=ap.nextInt("Starting number of cents?");
		//
		// Then, compute and print out how many 
		//    dollars, quarters, dimes, nickels, and pennies
		// should be given in exchange for those pennies, so as to
		// minimize the number of coins (see the videos)
		//
		int dollars=cents/100;
		int quarters=(cents%100)/25;
		int dimes=(cents%25)/10;
		int nickels=((cents-25*quarters)%10)/5;
		int pennies=cents%5;
		System.out.println(dollars+" dollars "+quarters+" quarters "+dimes+" dimes "+nickels+" nickels "+pennies+"pennies ");
	}

}
