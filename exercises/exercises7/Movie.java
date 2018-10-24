package exercises7;

public class Movie {
	private double length;
	private String name;
	private int timesSeen;
	private boolean isGood;
	public Movie(double length, String name, int timesSeen, boolean isGood) {
		super();
		this.length = length;
		this.name = name;
		this.timesSeen = timesSeen;
		this.isGood = isGood;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public void seen() {
		this.timesSeen = this.timesSeen+1;
	}
	public String getName() {
		return this.name;
	}
	public boolean getGood() {
		return this.isGood;
	}

}
