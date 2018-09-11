package studio2;

public class Pi {

	public static void main(String[] args) {
		double totalTimes = 0;
		double inTimes = 0;
		for (int i = 0; i <= 100000; i++) {
			double a = Math.random();
			double b = Math.random();
			if (Math.sqrt(Math.pow((a-0.5),2)+Math.pow((b-0.5), 2))<=0.5) {
				inTimes++;
			}
			totalTimes++;
		}
		System.out.println("Pi is " + 4*(inTimes/totalTimes));
	}

}
