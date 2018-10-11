package studio5x;

import cse131.NotYetImplementedException;
import lab5.Strings;

public class MergeCombiner {
	/**
	 * Produces an array which is the sorted result of merging the two specified,
	 * sorted input arrays a and b.
	 * 
	 * For example, when the arrays { "E", "G", "N" } and {"B", "I", "S" } are
	 * passed to this method, the resulting array { "B", "E", "G", "I", "N", "S" }
	 * should be returned.
	 * 
	 * If either input array a or b is unsorted, then the results are undefined.
	 * 
	 * This method must not mutate (that is: change the contents of) the input
	 * arrays a or b, nor would it have any real reason to do so.
	 * 
	 * @param a
	 *            a sorted array
	 * @param b
	 *            another sorted array
	 * @return a new array which contains the contents of both a and b, sorted.
	 */
	public static String[] createMergeCombinedArray(String[] a, String[] b) {
		String[] c = new String[a.length+b.length];
		int x= 0;
		int y= 0;
		for (int i =0; i<a.length+b.length; i++) {
			if (x>=a.length) {
				c[i] = b[y];
				y++;
			}
			else if (y>=b.length) {
				c[i] = a[x];
				x++;
			}
			else if (Strings.isGreaterThan(a[x], b[y]))
			{
				c[i] = b[y];
				y++;
			}
			else {
				c[i] = a[x];
				x++;
			}
		}
		return c;
	}
}
