package studio9;

import java.util.HashMap;
import java.util.Map;

import lab7.Student;

public class UniversityDatabase {
	private final Map<String, Student> a;

	/**
	 * @param a
	 */
	public UniversityDatabase() {
		super();
		this.a = new HashMap<String, Student>();
	}
	/**
	 * 
	 * @param accountName
	 * @param student
	 */
	public void addStudent(String accountName, Student student) {
		a.put(accountName, student);
	}
	/**
	 * 
	 * @return
	 */
	public int getStudentCount() {
		return a.size();
	}
	public String lookupFullName(String accountName) {
		if(!a.containsKey(accountName)) {
			return null;
		}
		else {
			return a.get(accountName).getFullName();
		}
	}
	public double getTotalBearBucks() {
		double i=0;
		for(String b :a.keySet()) {
			i+=a.get(b).getBearBucksBalance();
		}
		return i;
	}
}
