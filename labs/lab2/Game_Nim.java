package lab2;

import cse131.ArgsProcessor;

public class Game_Nim {

	public static void main(String[] args) {
		ArgsProcessor ap= new ArgsProcessor(args);
		boolean first = ap.nextBoolean("do you want to play first?");
		int stick = 7;
		int c = 0;
		int i = 0;
		int round = 0;
		if (first == true) {
			System.out.println("human starts first");
		}
		else {
			System.out.println("computer starts first");
		}
		while (stick !=0) {
			int s= stick;
			if (first == true){
				ArgsProcessor ad= new ArgsProcessor(args);
				i = ad.nextInt("Remove how many sticks?");
				while (i!=2&&i!=1||i> stick) {
					System.out.println("illegal move, try again");
					i = ad.nextInt("Remove how many sticks?");
				}
				stick = stick - i;
			}
			else {
				c = (Math.random()>0.5)? 1:2;
				if (stick == 1) {
					c = 1;
				}
				stick = stick-c;
			}
			first = (first == true)? false:true;
			System.out.println("Round "+ round + ", " + s +" sticks at start, ");
			if  (first == true) {
				System.out.println("computer took "+ c +" , so "+ stick+ " sticks remain");
			}
			else {
				System.out.println("human took "+ i +" , so "+ stick +" sticks remain");
			}
			round = round +1;
		}
		if (first == true) {
			System.out.println("computer wins");
		}
		else {
			System.out.println("human wins");
		}
	}

}
