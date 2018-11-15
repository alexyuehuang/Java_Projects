package memorymatch;

import java.awt.Color;
import sedgewick.StdDraw;

public class MemoryMatch {

	public static Color[][] genBoard(){
		Color [] c= {Color.RED, Color.GREEN, Color.BLACK, Color.BLUE, Color.YELLOW, Color.CYAN, Color.GRAY, Color.ORANGE};
		int [] times = new int [8];
		Color [] [] color= new Color[4][4];
		for (int i=0; i<4; i++) {
			for (int j=0; j<4; j++) {
				int k = (int)Math.random()*8;
				while (times[k]>=2) {
					k = (int)Math.random()*8;
				}
				times[k]++;
				color[i][j] = c[k];
			}
		}
		return color;
	}

	public static void drawBoard(Color[][] board){
		StdDraw.setYscale(1, 0);
		
	}

	public static boolean isOver(Color[][] board){
		return false;
	}

	public static double[] click(){
		// FIXME
		return new double[] { 0, 0 };
	}
	
	public static void clickCount(int clicks){
		// FIXME
	}

	public static void playGame(){
		// FIXME
	}



	public static void main(String[] args) {
		playGame();
	}

}
