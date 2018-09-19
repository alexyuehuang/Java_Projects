package exercises4;

import java.awt.Color;

import sedgewick.StdDraw;

public class GraphicsDemo {

	public static void main(String[] args) {
		// blue point (look carefully, will be very small on your screen)
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.point(0.5, 0.5);
		// larger green point
		StdDraw.setPenColor(Color.GREEN);
		StdDraw.circle(0.4,0.6, 0.2);
		// unfilled red triangle
		StdDraw.setPenColor(Color.RED);
		double[] a = {0.3,  0.2, 0.4};
		double[] b = {0.1, 0.2, 0.1};
		StdDraw.polygon(a, b);
		// yellow circle, filled
		StdDraw.setPenColor(Color.YELLOW);
		StdDraw.filledCircle(0.1, 0.9, 0.1);
		// filled blue rectangle
		StdDraw.setPenColor(Color.BLUE);
		double[] c= {0.1, 0.3, 0.3, 0.1};
		double[] d = {0.1, 0.1, 0.2, 0.2};
		StdDraw.filledPolygon(c, d);


	}

}
