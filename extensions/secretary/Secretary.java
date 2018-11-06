package secretary;

import cse131.ArgsProcessor;

public class Secretary {

	public static void main(String[] args) {
		ArgsProcessor ap=  new ArgsProcessor(args);
		int N = ap.nextInt("enter N");
		double [] applicants = new double [N];
		int [] times = new int [N-1];
		for (int k =1; k<N; k++) {
			for (int j=0; j<100; j++) {
				for (int i=0; i<N; i++) {
					applicants[i] = Math.random();
				}
				int max =0;
				int maxmax = 0;
				for (int i=0; i<=k; i++) {
					if (applicants[i]>applicants[max]) {
						max= i;
					}
				}
				if(k+1 ==N) {
					max=k;
				}
				int g =0;
				if(k+1!=N) {
					for (int i=k+1;i<N; i++ ) {
						if(applicants[i]>applicants[max]&&g==0) {
							max=i;
							g=1;
						}
						if(i==N-1&&g==0) {
							max=i;
						}
					}
				}
				System.out.print(max+"+");
				for (int i=0; i<N; i++) {
					if (applicants[i]>applicants[maxmax]) {
						maxmax= i;
					}
				}
				System.out.println(maxmax);
				if(maxmax == max) {
					times[k-1] ++;
				}
			}	
		}
		int max = times[0];
		int a =0;
		for (int k =1; k<N; k++) {
			if(times[k-1]>max) {
				max = times[k-1];
				a=k;
			}
		}
		a++;
		for (int k =1; k<N; k++) {
			System.out.println(times[k-1]);
		}
		System.out.println("k"+a);
	}

}
