package exercises2;

public class Loops {

	public static void main(String[] args) {
		//
		// Some helpful information:
		//    System.out.print(i);
		// will print the value of i but not skip to a new line
		// in the output
		//
		//    System.out.println(i + "  ");
		// will print the value of i with a few spaces after it, also
		// not skipping to a new line
		//
		//    System.out.println();
		// skips to the next line
		//
		//
		
		//
		// Below each of the following comments,
		//   write code using a while loop
		//   that produces the specified sequence
		// Each loop will be preceded by a statement
		//   that initializes an int variable
		// Each loop's predicate will control how long it
		//   executes
		// Each loop will contain a statement to bump (change)
		//   the int variable
		//
		// To get the most out of this exercise:
		//
		// Move from one loop to the next by 
		//   * changing the starting value
		//   * changing the loop predicate, for example, from <= to <
		//   * changing the loop bump, for example, from i=i+1 to i=i+2
		//
		// Do the best you can here, and then view the solution video
		//
		
		
		
		// 0 to 9 inclusively
		//    produces  0 1 2 3 4 5 6 7 8 9
		int i = 0;
		double a = 0;
		while (a <= 9){
			a=a+1;
			System.out.print(i + " ");
			i = i+1;
		}
		// 1 to 10 inclusively
		//    produces 1 2 3 4 5 6 7 8 9 10
		int q = 0 ;
		double b = 0;
		while (b < 22) {
			b = b + 2;
			System.out.print(q + " ");
			q = q + 1;
		}
		// 0 to 10, including 0, excluding 10
		//    produces 0 1 2 3 4 5 6 7 8 9
		int k = 0;
		int x = 0;
		while (k < 30) {
			k = k + 3;
			System.out.print(x + " ");
			x = x + 1;
		}
		
		// like the one above, but jumping by 2
		//    produces 0 2 4 6 8
		int t = 0;
		int m = 0;
		while (t < 5) {
			t = t + 1;
			System.out.print(m + " ");
			m = m + 2;
		}
	}

	private static Object a(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
