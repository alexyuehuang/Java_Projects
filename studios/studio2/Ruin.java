package studio2;

import cse131.ArgsProcessor;

public class Ruin {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		double startAmount = ap.nextDouble("The amount of money you start with?");
		double winChance = ap.nextDouble("The probability that you win?");
		double winAmount = ap.nextDouble("The amount of money you win?");
		double totalPlays = ap.nextDouble("The number of times you simulate this program?");
		double lossChance = 1.0 - winChance;
		double ruin = 0.0;
		if (lossChance != winChance) {
			ruin =( Math.pow((lossChance/winChance), startAmount)- Math.pow((lossChance/winChance), winAmount))/(1-Math.pow((lossChance/winChance),winAmount));				
		}
		else {
			ruin = 1 - startAmount/winAmount;
		}
		int lossTimes = 0;
		int i = 1;
		for (i = 1; i <= totalPlays; i++) {
			double amountNow = startAmount; 
			int count = 0;
			String status = "";
			while ((amountNow != 0 )&& (amountNow != winAmount)) {
				if (winChance >= Math.random()) {
					amountNow = amountNow + 1;
				}
				else {
					amountNow = amountNow - 1;
				}
				count++;
			}
			if (amountNow ==0) {
				status = "LOSE";
				lossTimes++;
			}
			else {
				status = "WIN";
			}
			System.out.println("Simulation "+ i + ": " + count + " rounds	 	" + status);
		} 
		double ruinRate = (double)lossTimes/(double)(i-1);
		System.out.println("\n" + "Losses: " + lossTimes + " Simulations: " + (i-1) + "\n" + "Actural Ruin Rate: " + ruinRate + "    Expected Ruin Rate: " + ruin);
	}

}
