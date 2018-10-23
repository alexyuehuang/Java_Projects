package lab6;

import java.awt.Color;

import sedgewick.StdDraw;

public class Triangles {
	public static void triangle(double llx, double lly, double size) {
		if (size<0.03) {
			return;
		}
		
		StdDraw.filledPolygon(new double [] {llx+size/4, llx+size/2, llx+size*0.75}, new double []{lly+size/4*Math.sqrt(3), lly, lly+size/4*Math.sqrt(3)});
		triangle(llx, lly, size/2);
		triangle(llx+size/2, lly, size/2);
		triangle(llx+size/4, lly+size/4*Math.sqrt(3), size/2);
	}
	public static void main(String[] args) {
		StdDraw.setScale(0, 1);
		double[] x = {0, 0.5, 1};
		double [] y ={0, (Math.sqrt(3)/2), 0};
		StdDraw.filledPolygon(x, y);

		StdDraw.setPenColor(Color.WHITE);
		triangle(0, 0, 1.0);
	}

}
