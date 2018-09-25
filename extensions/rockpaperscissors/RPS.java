package rockpaperscissors;

import cse131.ArgsProcessor;

public class RPS {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int times = ap.nextInt("how many times play the game?");
		int humanWin = 0;
		int computerWin = 0;
		for (int i = 0; i< times; i++) {
			int computer = (int)(Math.random()*3+1);
			System.out.println("computer choose " + computer);
			int human = ap.nextInt("make your move? rock = 1, paper = 2, scissors =3");
			System.out.println("human choose " + human);
			if ((human == 1 && computer == 3) || (human == 2 && computer == 1) || (human == 3 && computer == 2)) {
				humanWin++;
				System.out.println("human win ");
			}
			else {
				if (human != computer) {
				computerWin++;
				System.out.println("computer win ");
				}
			}
		}
		double hu = (double)humanWin/(double)times;
		double co = ((double)computerWin)/((double)times);
		System.out.println("human wins "+ hu + " computer wins " + co);
	}

}
