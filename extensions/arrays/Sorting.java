package arrays;
import cse131.ArgsProcessor;

public class Sorting {
	
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int size  = ap.nextInt("size?");
		while(size<0) {
			System.out.println("oops, the size cannot be negative");
			size  = ap.nextInt("size?");
		}
		int[] array = new int[size];
		for (int i= 0; i<size; i++) {
			array[i] = ap.nextInt("next integer?");
		}
		for(int count = 1; count<size; count++) {
			int min = array[count-1];
			int n= min;
			int m = count-1;
			for (int j = count; j<size; j++) {
				if (array[j]<min) {
					min = array[j];
					m=j;
				}
			}
			array[count-1] = array[m];
			array [m] = n;
		}
		for (int i= 0; i<size; i++) {
			System.out.print(array[i]+" ");
		}
		double mean = 0.0;
		for(int i= 0; i<size; i++) {
			mean = mean +(double)array[i];
		}
		mean = mean/((double)size);
		System.out.println("mean " +mean);
		double median = 0;
		if(size%2 ==0) {
			median = ((double)(array[size/2]+array[size/2-1]))/2.0;
		}
		else {
			median = array[(size-1)/2];
		}
		System.out.println("median " +median);
		int min = array[0];
		System.out.println("min " +min);
		int max = array[size-1];
		System.out.println("max " +max);
		int range = max-min;
		System.out.println("range " +range);

	}

}
