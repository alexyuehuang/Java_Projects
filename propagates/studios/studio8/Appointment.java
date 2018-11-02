package studio8;

public class Appointment {
	
	private final Date d;
	private final Time t;
	private final String content, location;

	/**
	 * @param d
	 * @param t
	 * @param content
	 * @param location
	 */
	public Appointment(Date d, Time t, String content, String location) {
		super();
		this.d = d;
		this.t = t;
		this.content = content;
		this.location = location;
	}
	
	

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		result = prime * result + ((d == null) ? 0 : d.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((t == null) ? 0 : t.hashCode());
		return result;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		if (content == null) {
			if (other.content != null)
				return false;
		} else if (!content.equals(other.content))
			return false;
		if (d == null) {
			if (other.d != null)
				return false;
		} else if (!d.equals(other.d))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (t == null) {
			if (other.t != null)
				return false;
		} else if (!t.equals(other.t))
			return false;
		return true;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Appointment [d=" + d + ", t=" + t + ", content=" + content + ", location=" + location + "]";
	}

	public static void main(String[] args) {
		Date d1 = new Date(11,1,2018, false);
		Time t1 = new Time(10,30,true);
		Appointment ap1 = new Appointment(d1, t1, "Test" , "LopataHall");
		System.out.print(ap1.toString());
		
		

	}

}
