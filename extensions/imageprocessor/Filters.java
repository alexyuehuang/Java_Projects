package imageprocessor;
/**
 * Name: Jake Gordon
 * Lab Section: H
 * Date:9/13
 * ImageProcessor.java
 * CSE 131 Lab 1
 */

import java.awt.Color;
import java.util.Random;



public class Filters {
	// Some sample methods:

	// This method cuts each color component of a pixel in half to produce the new image.
	public static int darker(int pixelComponent) {
		return pixelComponent/2;
	}

	// This method sums the color components of two pixels to produce a third.
	// Note that when the total exceeds 255, there is a strange effect.
	// USED IN: example_combine
	public static int combine(int pixelAComponent, int pixelBComponent) {
		return pixelAComponent+pixelBComponent;
	}

	// This method takes the color of each pixel and creates a new color without any green.  Returns an array of integers [r, g ,b].
	// USED IN: example_purplish
	public static Color purplish(Color c) {
		return Color.black;  // FIXME
	}

	// Now that you've seen the examples, complete the following methods.
	// The headers have been completed for you.
	//
	// NB: The 'return 0' and 'return new Color(0,0,0)' lines are simply placeholders
	// to prevent the compiler from complaining.  They should be removed or modified when
	// you add your implementation.

	/**Complete the method called copy that copies
	 *the first source image to the target panel.  
	 *(Hint: This is a very simple method.)**/
	public static int copy(int pixelComponent) {
		return pixelComponent;
	}

	//This method averages the color components of two pixels.
	// USED IN: composite
	public static int composite(int a, int b) {
		return (a +b)/2;
	}

	//This method returns the negative of a pixel by inverting its color components.
	// USED IN: negative
	public static int negative(int a) {
		return (256-a);
	}

	//This method reduces the number of possible values for a given color component
	//from 256 to 2, by returning either 0 or 255 based on the original value.
	// USED IN: posterize
	public static int posterize(int a) {
		int b = a/128;
		int c = (b==1)? 255:0;
		return c;
	}

	//This method returns a color that is brighter than the original color.
	// USED IN: brighter
	//FIX ME
	public static Color brighter(Color c) {
		return c.brighter();
	}

	//This method returns a color that is some shade of gray, by making a new
	//color having equal RGB components. returns an array of integers [r, g ,b].
	// USED IN: grayscale
	public static Color grayscale(Color c) {
		int a = c.getRed();
		int b = c.getBlue();
		int d = c.getGreen();
		int e = (a+b+d)/3;
		Color q = new Color (e, e, e);
		return q;  // FIXME
	}

	//This method returns either black or white, based on the intensity of the
	//originally provided color. returns an array of integers [r, g ,b].
	// USED IN: blackWhite
	public static Color blackAndWhite(Color c) {
		int a = c.getRed();
		int b = c.getBlue();
		int d = c.getGreen();
		Color q = new Color (0, 0, 0);
		if(a + b + d < 256) {
			q = Color.BLACK;
		}
		else {
			q = Color.WHITE;
		}
		return q;   // FIXME
	}

	//This method combines two images by choosing for each location the brighter 
	//pixel in the same location from the two source images.
	// USED IN: combineBrighter
	public static Color combineBrighter(Color c1, Color c2) {
		int a = c1.getRed();
		int b = c1.getBlue();
		int d = c1.getGreen();
		int x = c2.getRed();
		int y = c2.getBlue();
		int z = c2.getGreen();
		Color q = new Color (0,0,0);
		if(a + b + d > x + y + z) {
			q = c1;
		}
		else {
			q = c2;
		}
		return q;  // FIXME


	}
	/**This is the beginning of another extension*
	 * 
	 * 
	 */

	//This method performs background subtraction by returning the color blue
	//if the two colors are close enough; otherwise, it returns the first color.
	/**
	 * 
	 * @param source1Color one color
	 * @param source2Color another color
	 * @param tolerance the saturation difference between color components, such that they are considered the same
	 * @return
	 */
	public static Color bgSubtract(Color source1Color, Color source2Color, int tolerance) {
		Color q = new Color (0,0,0);
		int a = source1Color.getRed();
		int b = source1Color.getBlue();
		int d = source1Color.getGreen();
		int x = source2Color.getRed();
		int y = source2Color.getBlue();
		int z = source2Color.getGreen();
		if (Math.abs(a-x)<= tolerance && Math.abs(b-y)<= tolerance && Math.abs(d-z)<= tolerance) {
			q = Color.BLUE;
		}
		else {
			q = source1Color;
		}
		return q;

	}

	private static Random r = new Random();
	public static Color genRandomColor() {
		return new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256));		
	}
	//This method performs background replacement by returning the color from the
	//second image if the color from the first image is blue; otherwise returns
	//the color from the first image.
	public static Color bgReplace(Color s1Color, Color s2Color) {
		int a = s1Color.getRed();
		int b = s1Color.getBlue();
		int d = s1Color.getGreen();
		Color q = new Color (a, d, b);
		if (a ==0 && b==255 && d==0) {
			q = s2Color;
		}
		return q;
	}

}
