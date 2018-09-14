package studio3;

import cse131.ArgsProcessor;

public class Sieve {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int n = ap.nextInt("Enter the maximum number: ");
		int [] arr = new int [n-2];
		for (int i=2; i<n; i++) {
			arr[i-2] = i;
		}

		for (int j = 0; j<n-2;j++) {
			if (arr[j] != 0) {
				int num = arr[j];
				for (int k = j+num; k < n-2; k = k + num) {
					arr[k] = 0;
				}
			}
		}
		System.out.print("Primes under " + n + " = ");
		
		for (int m = 0; m < n-2; m++) {
			if (arr[m] != 0) {
				System.out.print(arr[m] + ", ");
			}
		}
			 
	}

}
