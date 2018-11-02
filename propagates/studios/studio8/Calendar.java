package studio8;

import java.util.HashSet;

public class Calendar {
	
	private HashSet<Appointment> cal ;
	private final String nameCal;
	
	/**
	 * @param cal
	 * @param nameCal
	 */
	public Calendar(HashSet<Appointment> cal, String nameCal) {
		super();
		this.cal = cal;
		this.nameCal = nameCal;
	}

	 /**
	 * @return the cal
	 */
	public HashSet<Appointment> getCal() {
		return cal;
	}

	/**
	 * @param cal the cal to set
	 */
	public void setCal(HashSet<Appointment> cal) {
		this.cal = cal;
	}

	/**
	 * @return the nameCal
	 */
	public String getNameCal() {
		return nameCal;
	}

	public boolean remove(Appointment a) {
		return cal.remove(a);
	}
	public boolean add(Appointment a) {
		return cal.add(a);
	}


	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Calendar [cal=" + cal + ", nameCal=" + nameCal + "]";
	}

	public static void main(String[] args) {
		HashSet<Appointment> s = new HashSet<Appointment>();
		Calendar c = new Calendar(s , "kehang"  );
		Date d1 = new Date(11,1,2018, false);
		Time t1 = new Time(10,30,true);
		Appointment ap1 = new Appointment(d1, t1, "Test" , "LopataHall");
		
		c.add(ap1);
		System.out.println(c.toString());
		c.remove(ap1);
		System.out.println(c.toString());

		

	}

}
