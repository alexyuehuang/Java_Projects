package exercises4;

import cse131.ArgsProcessor;

public class Pitches {

	public static void main(String[] args) {
		ArgsProcessor ap =new ArgsProcessor (args);
		double k = ap.nextDouble("what is pitch 1?");
		double j = ap.nextDouble("what is pitch 2?");
		double frequency = 440.0*Math.pow(2,(k/12));
		double frequency2 = 440.0*(Math.pow(2, (j/12)));
		double ratio  = frequency/frequency2;
		System.out.println(frequency +"\n"+ frequency2+ "\n"+ ratio);
		// encoding has 0 as concert A
		//    1 would be Bb, just above A
		//   -1 would be Ab, just below A


	}

}
