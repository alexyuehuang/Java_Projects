package lab7;

public class Student {
	private String firstName, lastName;
	private final int id;
	private int totalAttemptedCredits, totalPassingCredits;
	private double totalGradeQualityPoints, bearBucksBalance;
	/**
	 * @param firstName
	 * @param lastName
	 * @param id
	 * @param totalAttemptedCredits
	 * @param totalPassingCredits
	 * @param totalGradeQualityPoints
	 * @param bearBucksBalance
	 */
	public Student(String firstName, String lastName, int id) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getId() {
		return id;
	}
	public int getTotalAttemptedCredits() {
		return totalAttemptedCredits;
	}
	public void setTotalAttemptedCredits(int totalAttemptedCredits) {
		this.totalAttemptedCredits = totalAttemptedCredits;
	}
	public int getTotalPassingCredits() {
		return totalPassingCredits;
	}
	public void setTotalPassingCredits(int totalPassingCredits) {
		this.totalPassingCredits = totalPassingCredits;
	}
	public double getTotalGradeQualityPoints() {
		return totalGradeQualityPoints;
	} 
	public void setTotalGradeQualityPoints(double totalGradeQualityPoints) {
		this.totalGradeQualityPoints = totalGradeQualityPoints;
	}
	public double getBearBucksBalance() {
		return bearBucksBalance;
	}
	public void setBearBucksBalance(double bearBucksBalance) {
		this.bearBucksBalance = bearBucksBalance;
	}
	public String getFullName() {
		return firstName+" "+lastName;
	}
	public void submitGrade(double grade, int credits) {
		this.totalGradeQualityPoints = this.totalGradeQualityPoints +(grade*credits);
		this.totalAttemptedCredits = this.totalAttemptedCredits +credits;
		if (grade>=1.7) {
			this.totalPassingCredits ++;
		}
	}
	public double calculateGradePointAverage() {
		return (this.totalGradeQualityPoints/this.totalAttemptedCredits);
	}
	public String getClassStanding() {
		if (totalPassingCredits<30) {
			return "FirstYear";
		}
		else if (totalPassingCredits<60) {
			return "Sophomore";
		}
		else if (totalPassingCredits<90) {
			return "Junior";
		}
		else {
			return "Senior";
		}
	}
	public boolean isEligibleForPhiBetaKappa() {
		boolean a = false;
		if (totalAttemptedCredits>=98 && this.calculateGradePointAverage()>=3.60||totalAttemptedCredits>=75 && this.calculateGradePointAverage()>=3.80) {
			a=true;
		}
		return a;
	}
	public void depositBearBucks(double amount) {
		this.bearBucksBalance = this.bearBucksBalance+amount;
	}
	public void deductBearBucks(double amount) {
		this.bearBucksBalance = this.bearBucksBalance-amount;
	}
	public double cashOutBearBucks() {
		double a = this.getBearBucksBalance();
		if (this.getBearBucksBalance()<=10) {
			this.deductBearBucks(a);
			return 0;
		}
		else {
			this.deductBearBucks(a);
			return a-10;
		}
		
	}
	public Student createLegacy(String firstName, Student otherParent, boolean isHyphenated, int id) {
		Student a = new Student ("a", "b", id);
		a.setFirstName(firstName);
		if (isHyphenated) {
			a.setLastName(this.getLastName()+"-"+otherParent.getLastName());
		}
		else {
			a.setLastName(this.getLastName());
		}
		a.setBearBucksBalance(0);
		a.depositBearBucks(this.cashOutBearBucks()+otherParent.cashOutBearBucks());
		return a;
	}
	public String toString() {
		return firstName+" "+lastName+ id;
	}
}
