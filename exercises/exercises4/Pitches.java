package exercises4;

import cse131.ArgsProcessor;

public class Pitches {

	public static void main(String[] args) {
		ArgsProcessor ap =new ArgsProcessor (args);
		double k = ap.nextDouble("what is the pitch?");
		double frequency = 440.0*Math.pow(2,(k/12));
		double frequency7 = 440.0*(Math.pow(2, ((7+k)/12)));
		double ratio  = frequency7/frequency;
		System.out.println(frequency +"\n"+ frequency7+ "\n"+ ratio);
		// encoding has 0 as concert A
		//    1 would be Bb, just above A
		//   -1 would be Ab, just below A


	}

}
