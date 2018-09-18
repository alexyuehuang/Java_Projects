package lab3;

import cse131.ArgsProcessor;

public final class Dice_Simulation {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int d = ap.nextInt("how many dice will be used?");
		int t = ap.nextInt("how many times will the dice be thrown?");
		int[][] table =new int[d][t];
		for (int i = 0; i< d; i++) {
			for (int j = 0; j<t; j++) {
				table [i][j] = (int)(Math.random()*6)+1;
			}
		}
		for (int i = 0; i< t; i++) {
			for (int j = 0; j<d; j++) {
				System.out.print(table [j][i]);
			}
			System.out.println("");
		}
		int same = 0;
		for (int i = 0; i< t; i++) {
			int q = table[0][i];
			for (int j=0; j<d; j++) {
				if (table [j][i]!=q) {
					q = 0;
				}
			}
			if(q!=0) {
				same = same+ 1;
			}
		}
		double s1 = (double)(same)/(double)t;
		System.out.println("number of same value "+ same +" possibility "+ s1);
		int [] k = new int[5*d +1];
		for (int i = 0; i< t; i++) {
			int s = 0;
			for (int j = 0; j<d; j++) {
				s = s + table [j][i];
			}
			k[s-d] = k[s-d]+1; 
		}
		for (int i = d; i<6*d+1; i++ ) {
			if (k[i-d] != 0) {
				double j = (double)( (double)k[i-d]/(double)t);
				System.out.println(i + " possibility "+j);
			}
		}
	}

}
