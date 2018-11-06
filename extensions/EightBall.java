import java.awt.Color;

import cse131.ArgsProcessor;
import sedgewick.StdDraw;

public class EightBall {

	public static void main(String[] args) {
		StdDraw.setXscale(0, 1.0);
		StdDraw.setYscale(0, 1.0);
		StdDraw.setPenColor(Color.BLACK);
		double [] a= new double[3];
		a[0] = 0.3;
		a[1] = 0.5;
		a[2] = 0.7;
		double [] b= new double[3];
		b[0] = 0.7;
		b[1] = 0.3;
		b[2] = 0.7;
		StdDraw.filledCircle(0.5, 0.5, 0.5);
		while (true) {
			StdDraw.show(1000);
			StdDraw.clear();
			StdDraw.setPenColor(Color.BLACK);
			StdDraw.filledCircle(0.5, 0.5, 0.5);
			ArgsProcessor ap = new ArgsProcessor(args);
			String noUse= ap.nextString("your question?");
			int k= (int)(Math.random()*4);
			String words = "";
			Color r = Color.RED;
			if (k==3) {
				int g= (int)(Math.random()*5);
				if (g==0) {
					words = "Don't count on it.";
				}
				if (g==1) {
					words = "My reply is no.";
				}
				if (g==2) {
					words =  "My sources says no.";
				}
				if (g==3) {
					words = "Outlook not so good.";
				}
				if (g==4) {
					words =  "Very Doubtful.";
				}
			}
			if (k==2) {
				int g= (int)(Math.random()*5);
				r = Color.YELLOW;
				if (g==0) {
					words = "Reply hazy, try again.";
				}
				if (g==1) {
					words =  "Ask again later.";
				}
				if (g==2) {
					words = "Better not tell you now.";
				}
				if (g==3) {
					words = "Cannot predict now.";
				}
				if (g==4) {
					words = "Concentrate and ask again.";
				}
			}
			if (k<=1) {
				int g= (int)(Math.random()*10);
				r = Color.GREEN;
				if (g==0) {
					words =  "It is certain.";
				}
				if (g==1) {
					words = "It is decidedly so.";
				}
				if (g==2) {
					words = "Without a doubt.";
				}
				if (g==3) {
					words = "Yes-definitely.";
				}
				if (g==4) {
					words =  "You may rely on it.";
				}
				if (g==5) {
					words = "As I see it, yes.";
				}
				if (g==6) {
					words = "Most likely.";
				}
				if (g==7) {
					words =  "Yes.";
				}
				if (g==8) {
					words = "Signs point to yes.";
				}
				if (g==9) {
					words = "Outlook good.";
				}
			}
			for(int i=0; i<180; i++) {
				StdDraw.show(1);
				StdDraw.clear();
				StdDraw.setPenColor(Color.BLACK);
				StdDraw.filledCircle(0.5, 0.5, 0.5);
				StdDraw.setPenColor(new Color (0, 0, i+69));
				StdDraw.filledPolygon(a, b);
				StdDraw.setPenColor(r);
				StdDraw.text(0.5, 0.5, words, i-179);
			}
		}
	}

}
