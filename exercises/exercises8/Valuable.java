package exercises8;

public class Valuable{
	private final int value, year;

	/**
	 * @param value
	 * @param year
	 */
	public Valuable(int value, int year) {
		super();
		this.value = value;
		this.year = year;
	}

	public int getValue() {
		return value;
	}

	public int getYear() {
		return year;
	}
	public int depreciatedValue() {
		double a = value;
		for (int i=0; i<year; i++) {
			a=a*0.8;
		}
		return (int)a;
		
	}

	@Override
	public String toString() {
		return "PersonalProperty [value=" + value + ", year=" + year + "]";
	}
	
	public int getLiquidValue() {
		return this.depreciatedValue();
	}
}