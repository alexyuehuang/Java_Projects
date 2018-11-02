package studio8;

public class Time implements Working {
	private final int hour, minute;
	private boolean is24;
	
	
	
	/**
	 * @param hour
	 * @param minute
	 * @param is24
	 */
	public Time(int hour, int minute, boolean is24) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.is24 = is24;
	}
	



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		if (is24) {
			return "Time [hour=" + hour + ", minute=" + minute + "]";
		}
		else {
			if (hour / 12 == 0 ) {
				return "Time [hour=" + hour + "AM , minute=" + minute + "]";
			}
			else {
				return "Time [hour=" + (hour-12) + "PM , minute=" + minute + "]";
			}
		}
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hour;
		result = prime * result + minute;
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
		Time other = (Time) obj;
		if (hour != other.hour)
			return false;
		if (minute != other.minute)
			return false;
		return true;
	}
	
	/**
	 * 
	 * @param Other
	 * @return true or false
	 */
	public boolean isEarlierThan(Time Other) {
		if (this.hour > Other.hour) {
			return false;
		}
		else if(this.hour < Other.hour) {
			return true;
		}
		else {
			if (this.minute > Other.minute) {
				return false;
			}
			else {
				return true;
			}
		}
	}
	
	public boolean between9and5() {
		return (this.hour >= 9 && this.hour<17) || (this.hour == 17 && this.minute==0);
	}
	
	public boolean amWorking() {
		return this.between9and5();
	}




	public static void main(String[] args) {
		Time a = new Time(10,14, true);
		System.out.println(a.toString());
		Time b = new Time(20,14, false);
		System.out.println(b.toString());
		
		System.out.println(a.isEarlierThan(b));
	}
	

}
