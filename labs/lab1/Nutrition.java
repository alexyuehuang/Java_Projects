package lab1;

import cse131.ArgsProcessor;

public class Nutrition {
	public static void main(String [] args) {
	ArgsProcessor ap = new ArgsProcessor(args);
	String name=ap.nextString("Name of the food?");
	double carbs=ap.nextDouble("Grams of Carbonhydrates in the food?");
	double fat=ap.nextDouble("Grams of Fat in the food?");
	double protein=ap.nextDouble("Grams of Protein in the food?");
	double statedCals=ap.nextDouble("numbers of calories stated?");
	double calCarbs=4*(carbs);
	double calFat=9*(fat);
	calFat=(Math.round(calFat*100))/100.0;
	double calProtein=4*(protein);
	double finalCals=calCarbs+calFat+calProtein;
	double unavaCals=finalCals-statedCals;
	unavaCals=(Math.round(unavaCals*100))/100.0;
	double fiber=unavaCals/4;
	fiber=(Math.round(fiber*100))/100.0;
	double intCarbs=(int)(1000*(calCarbs/statedCals));
	double intFat=(int)(1000*(calFat/statedCals));
	double intProtein=(int)(1000*(calProtein/statedCals));
	double douCarbs=(double)intCarbs/10.0;
	double douFat=(double)intFat/10.0;
	double douProtein=(double)intProtein/10.0;
	boolean lowCarb=douCarbs<=25;
	boolean lowFat=douFat<=15;
	double rand = Math.random();
	boolean head=rand>=0.5;
	System.out.println("Snickers has"+"\n"+"\t"+carbs+
			" grams of carbohydrates = "+calCarbs+" Calories"+"\n"+"\t"+
			fat+" grams of fat = "+calFat+" Calories"+"\n"+"\t"+
			protein+" grams of protein = "+calProtein+" Calories"+
			"\n"+"\n"+"This food is said to have "+statedCals+" (available) Calories."
			+"\n"+"With "+unavaCals+" unavailable Calories, this food has "+fiber+
			" grams of fiber"+"\n"+"\n"+"Approximately "+"\n"+"\t"+douCarbs+
			"% of your food is carbonhydrates"+"\n"+"\t"+
			douFat+"% of your food is fat"+"\n"+"\t"+
			douProtein+"% of your food is protein"+"\n"+"\n"+
			"This food is acceptable for a low-carb diet?  "+lowCarb+"\n"+
			"This food is acceptable for a low-fat diet?  "+lowFat+"\n"+
			"By coin flip, you should eat this food?   "+head);
	
	}
	}
