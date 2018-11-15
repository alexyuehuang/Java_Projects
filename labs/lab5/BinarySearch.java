package lab5;

import cse131.NotYetImplementedException;

public class BinarySearch {
	/**
	 * Calculates the floored midpoint of two specified integer values.
	 * 
	 * For example: a: 300 and b: 400 returns 350. a: 300 and b: 401 also returns
	 * 350. a: 300 and b: 402 returns 351.
	 * 
	 * @param a a value
	 * @param b another value
	 * @return the midpoint of a and b
	 */
	public static int calculateMidPoint(int a, int b) {
		int c = (a+b)/2;
		return c;
	}

	/**
	 * Searches the specified sorted array for the value specified by key. If the
	 * array contains key, then it returns an index which holds the value, otherwise
	 * it returns -1. If array contains multiple elements with the specified key
	 * value, there is no guarantee which index will be returned.
	 * 
	 * If the array is unsorted, then the results are undefined.
	 * 
	 * This method must not mutate (that is: change the contents of) the specified
	 * array, nor would it have any real reason to do so.
	 * 
	 * @param array the array to be searched
	 * @param key   the value to be searched for
	 * @return an index of an occurrence of key, if it is contained in the array;
	 *         otherwise -1.
	 */
	public static int findIndexInSorted(String[] array, String key) {
		int a = -1;
		if (array.length != 0) {
			String[] b= array;
			int k =0; 
			if(Strings.equals(b[b.length/2],key)) {
				a =b.length/2;
			}
			while (!Strings.equals(b[b.length/2],key)&&b.length>1) {
				if (Strings.isGreaterThan(b[b.length/2], key)) {
					String[] c = new String[b.length/2];
					for (int i =0; i<b.length/2; i++) {
						c[i] = b[i];
					}
					b=c;
				}
				else {
					k = k+ (b.length+1)/2;
					String[] c = new String[b.length/2];
					for (int i =1; i<=c.length; i++) {
						c[c.length-i] = b[b.length-i];
					}
					b=c;

				}
				if (Strings.equals(b[b.length/2],key)) {
					a = k+b.length/2;
				}
			}
		}
		return a;
	}
}
