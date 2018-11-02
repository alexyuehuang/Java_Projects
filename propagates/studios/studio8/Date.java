package studio8;

import java.util.HashSet;
import java.util.LinkedList;

public class Date implements Working {
	private final int month, day, year;
	private final boolean isHoliday;
	
	/**
	 * @param month
	 * @param day
	 * @param year
	 * @param isHoliday
	 */
	public Date(int month, int day, int year, boolean isHoliday) {
		super();
		this.month = month;
		this.day = day;
		this.year = year;
		this.isHoliday = isHoliday;
	}
	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Date [month=" + month + ", day=" + day + ", year=" + year + ", isHoliday=" + isHoliday + "]";
	}
	

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + day;
		result = prime * result + month;
		result = prime * result + year;
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
		Date other = (Date) obj;
		if (day != other.day)
			return false;
		if (month != other.month)
			return false;
		if (year != other.year)
			return false;
		return true;
	}
	
	/**
	 * 
	 * @param Other
	 * @return true or false
	 */
	public boolean isEarlierThan(Date Other) {
		if (this.year > Other.year) {
			return false;
		}
		else if(this.year < Other.year) {
			return true;
		}
		else {
			if (this.month > Other.month) {
				return false;
			}
			else if(this.month < Other.month) {
				return true;
			}
			else {
				if (this.day > Other.day) {
					return false;
				}
				else {
					return true;
				}
				
			}
		}
		
	}
	
	public boolean dayiseven(){
		return this.day % 2 == 0; 
	}
	public boolean amWorking() {
		return this.dayiseven();
	}


	public static void main(String[] args) {
		Date a = new Date(11,1,2018, false);
		System.out.println(a.toString());
		Date b = new Date(10,31,2018, true);
		System.out.println(b.toString());
		System.out.println(a.equals(b));
		Date c = new Date(10,31,2018, true);
		//
		LinkedList<Date> list_date = new LinkedList<Date>();
		list_date.add(a);
		list_date.add(b);
		
		list_date.remove(a);
		System.out.println(list_date);
		System.out.println(list_date.indexOf(b));
		
		list_date.add(a);
		
		System.out.println(list_date);
		System.out.println(list_date.indexOf(b));
		
		//
		list_date.add(c);
		System.out.println(list_date);
		
		//
		HashSet<Date> set_date = new HashSet<Date>();
		set_date.add(a);
		set_date.add(b);
		set_date.add(c);
		System.out.println(set_date);
		
		System.out.println(a.isEarlierThan(b));
		
		
		
		
	}

}
