package speeding;

import cse131.ArgsProcessor;

public class SpeedLimit {

	public static void main(String[] args) {
		ArgsProcessor ap= new ArgsProcessor(args);
		int speed = ap.nextInt("what is your reported speed?");
		int limit = ap.nextInt("what is the speed limit?");
		int fine = (speed >= limit+10) ? (speed-10-limit)*10+50 : 0;
		int over = speed-limit;
		System.out.println("You reported a speed of "+speed+" MPH for a speed limit of "+limit+" MPH."+"\n"+"You went "+over+" MPH over the speed limit."+"\n"+"Your fine is $"+fine);
	}

}
