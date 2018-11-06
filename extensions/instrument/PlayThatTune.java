package instrument;
import cse131.ArgsProcessor;
import sedgewick.*;
/*************************************************************************
 *  Compilation:  javac PlayThatTune.java
 *  Execution:    java PlayThatTune < input.txt
 *  Dependencies: StdAudio.java StdAudio.java
 *
 *  This is a data-driven program that plays pure tones from
 *  the notes on the chromatic scale, specified on standard input
 *  by their distance from concert A.
 *
 *  % java PlayThatTune < elise.txt
 *
 *
 *  Data files
 *  ----------
 *  http://www.cs.princeton.edu/introcs/21function/elise.txt
 *  http://www.cs.princeton.edu/introcs/21function/99luftballons.txt
 *  http://www.cs.princeton.edu/introcs/21function/freebird.txt
 *  http://www.cs.princeton.edu/introcs/21function/Ascale.txt
 *  http://www.cs.princeton.edu/introcs/21function/National_Anthem.txt
 *  http://www.cs.princeton.edu/introcs/21function/looney.txt
 *  http://www.cs.princeton.edu/introcs/21function/StairwayToHeaven.txt
 *  http://www.cs.princeton.edu/introcs/21function/entertainer.txt
 *  http://www.cs.princeton.edu/introcs/21function/old-nassau.txt
 *  http://www.cs.princeton.edu/introcs/21function/arabesque.txt
 *  http://www.cs.princeton.edu/introcs/21function/firstcut.txt 
 *  http://www.cs.princeton.edu/introcs/21function/tomsdiner.txt
 *
 *************************************************************************/

public class PlayThatTune {

	public static void main(String[] args) {

		ArgsProcessor.useStdInput("music");
		ArgsProcessor ap = new ArgsProcessor(args);
		int times = ap.nextInt("how many frequency factors?");
		int[] num = new int[times];
		int[] denom = new int[times];
		int[] strenth = new int[times];
		for (int i =0;i<times; i++) {
			num[i] = ap.nextInt("next numerator?");
			denom[i] = ap.nextInt("next denomerator?");
			strenth[i] = ap.nextInt("next strength?");
		}
		// repeat as long as there are more integers to read in
		while (!StdIn.isEmpty()) {

			// read in the pitch, where 0 = Concert A (A4)
			int pitch = StdIn.readInt();

			// read in duration in seconds
			double duration = StdIn.readDouble();

			// build sine wave with desired frequency
			double hz = 440 * Math.pow(2, pitch / 12.0);
			int N = (int) (StdAudio.SAMPLE_RATE * duration);
			double[] a = new double[N+1];
			for (int i = 0; i <= N; i++) {
				for (int j = 0;j<times; j++) {
				double b = (num[j]/denom[j]) ;
				a[i] = strenth[j] *Math.sin(2 * Math.PI * i * b* hz / StdAudio.SAMPLE_RATE);
				}
			}

			 //play it using standard audio
			StdAudio.play(a);
		}
        StdDraw.setXscale(0, 1.0);
        StdDraw.setYscale(-1, 1.0);
    	StdDraw.setPenColor(StdDraw.BLACK);
    	double[] x = new double [3];
    	double[] y = new double [3];
    	double[] f = {1.0, 2.0, 3/2.0};
    	double[] s = {1, 0.75, 0.5};
    	double[] sum = new double [440];
    	for (int i =0; i<440; i++) {
    		StdDraw.show(4);
    		double q = ((double)i)/440.0;
    		for (int j = 0;j<3; j++) {
    		    x[j] = x[j]+(1.0/440.0);
    			double hz = 440 * Math.pow(2, 1 / 12.0);
    			y[j] =0.5*s[j] *Math.sin(2*Math.PI*q*f[j]);
    			StdDraw.filledCircle(q, y[j], 0.005);
    			sum[i] = sum[i]+y[j];
    		}
    		StdDraw.setPenColor(StdDraw.RED);
    		StdDraw.filledCircle(q, sum[i], 0.002);
    		StdDraw.setPenColor(StdDraw.BLACK);
    	}
	}
}
