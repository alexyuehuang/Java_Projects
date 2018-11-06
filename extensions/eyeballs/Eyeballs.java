package eyeballs;

import java.awt.Color;

import sedgewick.StdDraw;
import cse131.ArgsProcessor;

public class Eyeballs {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		StdDraw.picture(0.5, 0.5, "images/ken.jpg");
		int N = ap.nextInt("How many eyeballs?");
		N++;
		int i=0;
		double [] x = new double [N];
		double [] y = new double [N];
		while (i<N) {
			StdDraw.show(50);
			if (StdDraw.mousePressed()) {
				StdDraw.setPenColor(Color.WHITE);
				StdDraw.filledCircle(StdDraw.mouseX(), StdDraw.mouseY(), 0.04);
				StdDraw.setPenColor(Color.RED);
				StdDraw.filledCircle(StdDraw.mouseX(), StdDraw.mouseY(), 0.02);
				StdDraw.setPenColor(Color.BLACK);
				StdDraw.circle(StdDraw.mouseX(), StdDraw.mouseY(), 0.04);
				x[i] = StdDraw.mouseX();
				y[i] = StdDraw.mouseY();
				i=i+1;
			}
		}
		double mx = 0;
		double my =0;
//		while (true) {
//			StdDraw.show(5);
//			mx =  StdDraw.mouseX();
//			my =  StdDraw.mouseY();
//			for (int j=0; j<N; j++) {
//				StdDraw.setPenColor(Color.WHITE);
//				StdDraw.filledCircle(x[j], y[j], 0.04);
//				StdDraw.setPenColor(Color.RED);
//				double dx = mx-x[j];
//				double dy = my-y[j];
//				double d = Math.sqrt(Math.pow(dx, 2)+Math.pow(dy, 2));
//				StdDraw.filledCircle(x[j]+(0.02*dx/d),y[j]+(0.02*dy/d), 0.02);
//			}
//		}
		int k=0;
		double [] px = new double[50];
		double [] py = new double[50];
		while (k<k+1) {
			StdDraw.show(5);
			int w = k%50;
			mx = px[w];
			my = py[w];
			px[w] =  StdDraw.mouseX();
			py[w] =  StdDraw.mouseY();
			for (int j=0; j<N; j++) {
				StdDraw.setPenColor(Color.WHITE);
				StdDraw.filledCircle(x[j], y[j], 0.04);
				StdDraw.setPenColor(Color.RED);
				double dx = mx-x[j];
				double dy = my-y[j];
				double d = Math.sqrt(Math.pow(dx, 2)+Math.pow(dy, 2));
				StdDraw.filledCircle(x[j]+(0.02*dx/d),y[j]+(0.02*dy/d), 0.02);
			}
			k++;
		}
	}
}
