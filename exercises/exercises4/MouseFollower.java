package exercises4;

import java.awt.Color;

import cse131.ArgsProcessor;
import sedgewick.StdDraw;

public class MouseFollower {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int N = ap.nextInt("how much history?");
		double[] histX = new double[N];
		double[] histY = new double[N];
		int cur = 0;
		while (true) {
			StdDraw.clear();
			//
			// Render one frame of your animation below here
			//
			StdDraw.line(0.1, 0.1, 0.1, 0.9);
			StdDraw.line(0.1, 0.9, 0.9, 0.9);
			StdDraw.line(0.9, 0.9, 0.9, 0.1);
			StdDraw.line(0.9, 0.1, 0.1, 0.1);
			//  
			// End of your frame
			//
			// Stdraw.show(..) achieves double buffering and
			//   avoids the tight spinning loop
				double x= StdDraw.mouseX();
				double y= StdDraw.mouseY();
				histX[cur]= x;
				histY[cur] =y;
				StdDraw.pause(100);
				StdDraw.circle(histX[cur], histY[cur], 0.05);
				cur++;
				if(cur>= N) {
					cur = 0;
				}
			StdDraw.show(10);
			
		}

	}

}
