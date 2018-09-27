package homeowning;

import cse131.ArgsProcessor;

public class HomeOwning {

	public static void main(String[] args) {
	ArgsProcessor ap = new ArgsProcessor(args);
	String name = ap.nextString("name of the house?");
	String zip = ap.nextString("zip code of the house?");
	int rent = ap.nextInt("monthly rent of the house?");
	double m = ap.nextDouble("daily interest of the house?");
	int rentY = rent*12;
	double rentW = ((double)rent)* (7.0/(365.0/12.0));
	rentW = (Math.round(rentW*100.0))/100.0;
	double mY = m*365;
	mY = (Math.round(mY*1000.0))/1000.0;
	double mW = m*7;
	mW = (Math.round(mW*1000))/1000.0;
	System.out.println(name + " is located in the Zip Code " + zip + "\n" + "Rent per year: " + rentY + "\n" + "Rent per week: " + rentW + "\n" + "\n" + "Interest paid per year: " + mY + "\n" + "Interest paid per week: " + mW + "\n");
	if (rentY >= mY) {
		System.out.println("I should buy");
	}
	else {
		System.out.println("I should rent");
	}
	}

}
