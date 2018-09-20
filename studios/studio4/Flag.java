package studio4;

import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import cse131.ArgsProcessor;
import sedgewick.StdAudio;
import sedgewick.StdDraw;
import sedgewick.StdIn;

public class Flag {

	
	public static void main(String[] args) throws FileNotFoundException {
		//
		//  Add code for your studio below here.
		//
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.setPenRadius(0.03);
		double[] a = {0.4, 0.5, 0.6};
		double[] b= {0.58, 0.38, 0.58};
		StdDraw.polygon(a, b);
		double[] c = {0.4, 0.5, 0.6};
		double[] d= {0.45, 0.65, 0.45};
		StdDraw.polygon(c, d);
		StdDraw.filledRectangle(0.5, 0.2, 0.5, 0.05);
		StdDraw.filledRectangle(0.5, 0.8, 0.5, 0.05);
		StdDraw.setPenColor(Color.RED);
		double x  =0;
		double y = 1;
		while(x<=1) {
			StdDraw.pause(1000);
			x= x+0.1;
			y = y-0.1;
			StdDraw.text(x, y, "Israel");
		}
		System.setIn(new FileInputStream("music/firstcut.txt"));

	        // repeat as long as there are more integers to read in
		int index = 0;
		int[] z = new int[10000];
		double[] y1 = new double[10000];
	        while (!StdIn.isEmpty()) {        	
	            // read in the pitch, where 0 = Concert A (A4)
	            int pitch = StdIn.readInt();
	            z[index] = pitch;
	            // read in duration in seconds
	            double duration = StdIn.readDouble();
	            y1[index] = duration;
	            index++;
	            // build sine wave with desired frequency
	            double hz = 440 * Math.pow(2, pitch / 12.0);
	            int N = (int) (StdAudio.SAMPLE_RATE * duration);
	            double[] a1 = new double[N+1];
	            for (int i = 0; i <= N; i++) {
	                a1[i] = Math.sin(2 * Math.PI * i * hz / StdAudio.SAMPLE_RATE);
	            }
	        	

	            // play it using standard audio
	            StdAudio.play(a1);
	        }
	        int index2 =0;
	        while (true) {
	            int pitch = z[index2];
	            // read in duration in seconds
	            double duration = y1[index2];
	            index2++;
	            // build sine wave with desired frequency
	            double hz = 440 * Math.pow(2, pitch / 12.0);
	            int N = (int) (StdAudio.SAMPLE_RATE * duration);
	            double[] a1 = new double[N+1];
	            for (int i = 0; i <= N; i++) {
	                a1[i] = Math.sin(2 * Math.PI * i * hz / StdAudio.SAMPLE_RATE);
	            }
	            if (y1[index2]==0) {
	            	index2 =0;
	            }
	            StdAudio.play(a1);
	}
	}

}
