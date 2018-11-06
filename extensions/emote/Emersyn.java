package emote;

import java.awt.Color;

import sedgewick.StdDraw;

public class Emersyn {

	/**
	 * Coordinates and dimensions use the StdDraw coordinate system
	 * So, (0.5, 0.5) is the nominal center of the screen
	 *   and 0.5 and 0.5 are the nominal halfWidth and halfHeight
	 * 
	 * @param xCenter x coordinate of center of what you draw
	 * @param yCenter y coordinate of center of what you draw
	 * @param halfWidth half the width of your drawing
	 * @param halfHeight half the height of your drawing
	 * @param howHot on a scale from -1.0 to 1.0, how hot is the emote?
	 * @param howHappy on a scale from -1.0 to 1.0, how happy is the emote?
	 * @param howOther on a scale from -1.0 to 1.0, some third emotion of your choosing
	 */
	public static void emote(
			double xCenter, double yCenter,
			double halfWidth, double halfHeight,
			double howHot, double howHappy, double howOther
			){
		//
		// Do not issue clear or show
		//  Just draw the emote to show the current values of
		//     its emotions, as represented by the inputs above
		//  You can change the face code below:  it's there so
		//    you see something when you run the program as given
		//
		
		//
		// face
		//
		
		double faceRad = 0.9*Math.min(halfWidth, halfHeight);	
		int red=0;
		int green=0;
		int blue =0;
		if (howHot>=0) {
			red =255;
			green = (int)(255*(1-Math.abs(howHot)));
			blue =0;
		}
		else {
				red =0;
				green = (int)(255*(1-Math.abs(howHot)));
				blue =(int)(127*(-howHot+1));
		}
		Color c = new Color(red, green, blue);
		StdDraw.setPenColor(c); 
		StdDraw.filledCircle(xCenter, yCenter, faceRad);	
		StdDraw.setPenColor(Color.BLACK); 
		StdDraw.filledCircle(0.4, 0.6, 0.025);
		StdDraw.filledCircle(0.6, 0.6, 0.025);
		StdDraw.setPenColor(Color.WHITE); 
		StdDraw.circle(0.4, 0.6, 0.05);
		StdDraw.circle(0.6, 0.6, 0.05);
		StdDraw.setPenColor(Color.BLACK);
		double [] x = {0.35, 0.35, 0.45, 0.45};
		howOther = howOther/20+0.7;
		double [] y = {howOther, howOther+0.05, howOther+0.05, howOther};
		double [] px = {0.65, 0.65, 0.55, 0.55};
		StdDraw.filledPolygon(x, y);
		StdDraw.filledPolygon(px, y);
		if(howHappy>=0) {
			StdDraw.arc(0.5, 0.5, 0.1, 180+90*(1-howHappy), 270+90*howHappy);
		}
		else {
			StdDraw.arc(0.5, 0.3, 0.1, 180-90*(1-howHappy),90*(1-howHappy));
		}
	}

}

