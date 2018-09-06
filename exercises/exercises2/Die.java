package exercises2;

public class Die {

	public static void main(String[] args) {

		//
		// Use the random number generator
		//    (Math.random())
		double a = (Math.random())*6;
		double k = 0;
		if (a<=1) {
			k=1;
		}
		if (a<=2 && a>=1) {
			k=2;
		}
		if (a<=3 && a >=2) {
			k=3;
		}
		if (a<=4 && a>=3) {
			k=4;
		}
		if (a<=5 && a>=4) {
			k=5;
		}
		if (a<=6 && a>=5) {
			k=6;
		}
		// so that this program prints out one of
		// the following integers:
		//   1 2 3 4 5 6
		// with equal probability
		//
		// Note this program does not prompt the user
		//  for input, it just produces one of the
		//  above integers as output, as if by 
		//  throw of a die
		//
	System.out.println(k);
	}

}
