package lab7;

public class Course {
	private String name;
	private int credits, capacity, seats;
	private Student[] names;
	/**
	 * @param name
	 * @param credits
	 * @param capacity
	 * @param seats
	 */
	public Course(String name, int credits, int capacity) {
		super();
		this.name = name;
		this.credits = credits;
		this.capacity = capacity;
		this.names = new Student [capacity+seats];
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getSeats() {
		return seats;
	}
	public int getSeatsRemaining() {
		return capacity-seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public boolean addStudent(Student s) {
		boolean a = true;
		if (capacity<=seats) {
			a =false;
		}
		for(int i = 0; i<capacity; i++) {
			if (names[i] == s) {
				a=false;
			}
		}
		if (a) {
			names[seats] = s;
			seats++;
		}
		
		return a;
	}
	public String generateRoster() {
		String a = "";
		for(int i = 0; i<seats; i++) {
			a = a +names[i].getFullName();
		}
		return a;
	}
	public double calculateAverageGPA() {
		double a = 0;
		for(int i = 0; i<seats; i++) {
			a = a +names[i].calculateGradePointAverage();
		}
		a=a/(seats);
		return a;
	}
	public String toString() {
		return this.getName()+this.getCredits();
	}
	

}
