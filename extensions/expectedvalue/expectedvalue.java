package expectedvalue;

import cse131.ArgsProcessor;

public class expectedvalue {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		double p = ap.nextDouble("What is the chance that the startup will succeed?");
		double gamer = p*190000 + (1 - p)*5000;
		double programmer = Math.random()*5000 + 110000;
		double utgamer = 3*Math.sqrt(gamer);
		double utprogrammer = 2*Math.sqrt(programmer);
		boolean begamer = utgamer > utprogrammer;
		System.out.println("Gamer: " + gamer + "\n" + "EU(Gamer): " + utgamer + "\n" + "Programmer: " + programmer + "\n" + "EU(Programmer): " + utprogrammer + "\n" + "You should be a gamer and not a programmer? " + begamer);
	}

}
