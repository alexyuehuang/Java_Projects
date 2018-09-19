package exercises4;

import sedgewick.StdDraw;

public class WaitPoint {

	public static void main(String[] args) {
		// wait for the mouse to be pressed and released
		while (!StdDraw.mousePressed()) {
			StdDraw.pause(1000);
		}
		System.out.println("A");
		// here, the mouse has been pressed
		while (StdDraw.mousePressed()) {
		StdDraw.pause(1000);
		}
		System.out.println("k");
		// here the mouse is released
		
		
		// draw a point at the location of the mouse
		double x= StdDraw.mouseX();
		double y= StdDraw.mouseY();
		StdDraw.point(x, y);
		// here, a q has been typed
		while (!StdDraw.hasNextKeyTyped()) {
			StdDraw.pause(1000);
		}
		char key = StdDraw.nextKeyTyped();
		if(key == 'q') {
		
		StdDraw.text(0.5, 0.5, "Farewell!");
		}
	}

}
