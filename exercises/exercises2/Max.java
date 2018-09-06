package exercises2;

import cse131.ArgsProcessor;

public class Max {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int x = ap.nextInt("what is x?");
		int y = ap.nextInt("what is y?");
		if (x>y) {
			System.out.println(x);
		}
		else {
			System.out.println(y);
		}
		
		
		//
		// Now use what you have learned about conditional
		//   execution to print the larger of the two values.
		//
		
		
		//
		// Run this program testing on various inputs for
		//    x and y:  some where x < y, some where x > y,
		//              some where x == y

	}

}
