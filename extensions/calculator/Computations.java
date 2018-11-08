package calculator;

public class Computations {

	/**
	 * Complete the static methods as described on the 
	 * description for this assignment.
	 */


	/**Double operators**/
	//Returns the result of adding d1 and d2.
	public static double addDoubles(double d1, double d2) {
		return d1+d2;
	}

	//Return the result of subtracting d2 from d1.
	static double subtractDoubles(double d1, double d2) {
		return d1-d2;
	}

	//Return the result of dividing d1 by d2.
	static double divideDoubles(double d1, double d2) {
		if (d2 ==0) {
			return 0;
		}
		else {
			return d1/d2;
		}
	}

	//Return the result of multiplying d1 and d2.
	static double multiplyDoubles(double d1, double d2) {
		return d1*d2;
	}



	/**Int operators**/

	//Return the result of adding i1 and i2.
	static int addInts(int i1, int i2) {
		return i1+i2;
	}

	//Return the result of subtracting i2 from i1.
	static int subtractInts(int i1, int i2) {
		return i1-i2;
	}

	//Return the result of dividing i1 by i2.
	static int divideInts(int i1, int i2) {
		if(i2==0) {
			return 0;
		}
		else {
			return i1/i2;
		}
	}	

	//Return the result of multiplying i1 and i2.
	static int multiplyInts(int i1, int i2) {
		return i1*i2;
	}



	/**String operators**/	
	//	//Return the result of concatenating s2 to s1.
	static String concatenate(String s1, String s2) {
		return s1+s2;
	}



	/**Boolean operators**/
	//Return the boolean value that results from an AND operation of b1 and b2
	static boolean andBoolean(boolean b1, boolean b2) {
		return b1&&b2;
	}
	//Return the boolean value that results from an OR operation of b1 and b2
	static boolean orBoolean(boolean b1, boolean b2) {
		return b1||b2;
		}

	/**Casting to int**/
	static int intToInt(int in) {
		return in;
	}
	static int doubleToInt(double in) {
		return (int)in;
	}
	static int stringToInt(String in) {
		throw new UnsupportedOperationException();
	}
	static int booleanToInt(boolean in) {
		throw new UnsupportedOperationException();
		//return in ?1:0;
	}


	/**Casting to double**/
	static double intToDouble(int in) {
		return (double)in;
	}
	static double doubleToDouble(double in) {
		return in;
		}
	static double stringToDouble(String in) {
		throw new UnsupportedOperationException();
	}
	static double booleanToDouble(boolean in) {
		return (double)booleanToInt(in); 
	}


	/**Casting to String**/
	static String intToString(int in) { 
		return Integer.toString(in);
	}
	static String doubleToString(double in) {
		return Double.toString(in);
	}
	static String stringToString(String in) {
		return in;
	}
	static String booleanToString(boolean in) {
		return Boolean.toString(in);
	}


	/**Casting to Boolean**/
	static boolean intToBoolean(int in) {
		throw new UnsupportedOperationException();
	}
	static boolean doubleToBoolean(double in) {
		return intToBoolean((int)in);
	}
	static boolean stringToBoolean(String in) {
		return intToBoolean(stringToInt(in));
	}
	static boolean booleanToBoolean(boolean in) {
		return in;
	}


}
