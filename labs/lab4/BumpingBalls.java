package lab4;

import cse131.ArgsProcessor;
import sedgewick.StdAudio;
import sedgewick.StdDraw;

public class BumpingBalls { 
	
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
    	int numBalls = ap.nextInt("Number of balls: ");
    	int numIte = ap.nextInt("Number of iterations: ");
        StdDraw.setXscale(0, 1.0);
        StdDraw.setYscale(0, 1.0);
    	StdDraw.setPenColor(StdDraw.BLUE);
        double radius = 0.05;
    	double[] px = new double[numBalls];
    	double[] py = new double[numBalls];
    	double[] vx = new double[numBalls];
    	double[] vy = new double[numBalls];

		for(int i = 0; i<numBalls; i++) {
			while (px[i]==0 &&py[i]==0) {
				px[i] = Math.random();
				py[i] = Math.random();
				for (int j=0;j<i; j++) {
					if ((Math.pow((px[i]-px[j]), 2)+(Math.pow((py[i]-py[j]), 2)))<(Math.pow((2*radius), 2))) {
						px[i]=0;
						py[i]=0;
					}
				}
			}
		}
		for(int k = 0; k<numBalls; k++) {
				vy[k]= (Math.random()/100)+0.01;
				if (Math.random()>0.5) {
					vy[k] = -vy[k];
				}
				vx[k]= (Math.random()/100)+0.01;
				if (Math.random()>0.5) {
					vx[k] = -vx[k];
				}
			}
		for(int j = 0; j<numBalls; j++) {
			StdDraw.picture(px[j], py[j], "images/smileyface.gif");
		}
		for(int i = 0; i<numIte; i++) {
			StdDraw.clear();
			for(int j = 0; j<numBalls; j++) {
				for (int k = 0; k<numBalls; k++) {
					if (Math.abs(px[j] + vx[j]) > 1.0 - radius || px[j] + vx[j] < radius) {
						vx[j] = -vx[j];
		            	StdAudio.play("sound/BonkCrsh.wav");
					}
					if (Math.abs(py[j] + vy[j]) > 1.0 - radius||py[j] + vy[j] < radius) {
						vy[j] = -vy[j];
		            	StdAudio.play("sound/BonkCrsh.wav");
					}
					if (j<k&&(Math.pow(((px[j]+vx[j])-(px[k]+vx[k])), 2)+(Math.pow(((py[j]+vy[j])-(py[k]+vy[k])), 2)))<(Math.pow((2*radius), 2))) {
						vx[j] = -vx[j];
						vy[j] = -vy[j];
						vx[k] = -vx[k];
						vy[k] = -vy[k];
		            	StdAudio.play("sound/elaugh.wav");
					}
				}
				px[j] = px[j]+vx[j];
				py[j] = py[j]+vy[j];
				StdDraw.picture(px[j], py[j], "images/smileyface.gif");
			}
            StdDraw.show(20); 
		}
	}

}
