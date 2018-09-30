package lab5;

public class Strings {
	/**
	 * @param a a string
	 * @param b a string to be compared with a
	 * @return true if a is lexicographically before b and false otherwise
	 */
	public static boolean isLexicographicallyBefore(String a, String b) {
		return a.compareToIgnoreCase(b) < 0;
	}

	/**
	 * @param a a string
	 * @param b a string to be compared with a
	 * @return true if a and b are equal to each other and false otherwise
	 */
	public static boolean equals(String a, String b) {
		return a.compareToIgnoreCase(b) == 0;
	}

	/**
	 * @param a a string
	 * @param b a string to be compared with a
	 * @return true if a is lexicographically after b and false otherwise
	 */
	public static boolean isLexicographicallyAfter(String a, String b) {
		return a.compareToIgnoreCase(b) > 0;
	}
}
