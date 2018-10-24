package studio6;

import sedgewick.StdDraw;

public class CantorStool {

	private static void drawRec(double x, double y, double halfW, double halfH) {
		while (halfH <= 0.01) {
			return;
		}
		StdDraw.rectangle(x, y, halfW, halfH);
		drawRec((1+x)/3 - 1, (1+y)/2 - 1, halfW/3, halfH/2);
		drawRec( 1 - (1+x)/3 , (1+y)/2 - 1, halfW/3, halfH/2);
	}
	public static void main(String[] args) {
		StdDraw.setXscale(-1, +1);
		StdDraw.setYscale(-1, +1);
		drawRec(0,0.5,1, 0.5);
	}

}
