package exercises3;

import cse131.ArgsProcessor;

public class TimesTable {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int N = ap.nextInt("Max value for table?");
		
		//  Table should include rows and columns for 0...N  
		//     making N+1 rows and columns
		int[][] table = new int[N+1][N+1];
		for (int i = 0; i <= N; i++) {
			for (int j = 0; j<= N; j++) {
				table[i][j]= i * j; 
			}
		}
		for (int s = 0; s <= N; s++) {
			for (int t = 0; t<= N; t++) {
				System.out.print(table[s][t]+ "  ");
			}
			System.out.println("");
		}
	}

}
