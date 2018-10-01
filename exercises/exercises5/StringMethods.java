package exercises5;

public class StringMethods {
	
	//
	// Below are the methods defined for this exercise
	//   The names are not prescribed in the assignment, so choose
	//   names you like (that are meaningful)
	//
	
	//
	// First one is completed for you:
	//
	static String[] array= {"s", "a", "g", "q", "b" };
	static String joiner = "-";
	public static String join(String[] array, String joiner2) {
		String k ="";
		for (int i = 0; i<5; i++) {
			k = k+array[i]+"-";
		}
		return k;
	}
	
	public static void main(String[] args) {
		//
		// Testing the methods
		//
		System.out.println(join(array, joiner));
	}
	

}
