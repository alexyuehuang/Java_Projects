package studio6;

public class Beer {
	public static void bottlesOfBeer(int n) {
		if (n<=0) {
			return;
		}
		else {
			System.out.println(n +" bottles of beer on the wall, " + n 
					+ " bottles of beer; you take one down, pass it around, " + (n-1) 
					+ " bottles of beer on the wall.");
			bottlesOfBeer(n-1);
		}
	}
	public static void main(String[] args) {
		bottlesOfBeer(5);
		

	}

}
