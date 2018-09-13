package exercises3;

public class Shuffle {

	public static void main(String[] args) {
		String[] original = { "A", "B", "C", "D",
				"E", "F", "G", "H"
		};
		String[] shuffle = new String [8];
		// print out original array
		for (int i=0; i < original.length; ++i) {
			System.out.println("Original at " + i + " is " + original[i]);
		}
		int c = 0; 
		//
		// Follow the instructions on the web page to make a copy of
		// the original array, named shuffled, but with its elements
		// permuted from the original array.  The result is that the
		// shuffled array contains the same strings, but in a randomized
		// order.
		//
		while (c< original.length) {
			double k = ((Math.random())*10000)%8;
			int q = (int)k;
			if (original[q] !="") {
				shuffle [c] = original [q];
				original [q] = "";
				c++;
			}
		}
		for (int t=0; t < original.length; ++t) {
			System.out.println("Shuffle at " + t + " is " + shuffle[t]);
		}

	}
	
}