package exercises2;

public class RandomAverages {

	public static void main(String[] args) {
		//
		// Write a loop that computes the average
		//     of 1, 2, ... 1000 doubles
		// In each iteration of that loop, print
		//     the average of the doubles generated
		//     thus far.
		//
		// Your code goes below here.
		int loop=0;
		double average = 0;
		double sum = 0;
		while (loop<1000) {
			loop = loop +1;
			double a = Math.random();
			sum = sum + a;
			average = sum/loop;
			System.out.println(average);
		}
		
		
		//
		//  Some questions:
		//    1) How does the average change as your loop progresses?
		// it stabilizes and getting closer to 0.5
		//    2) Can you write code in your loop that prints out the average only
		//         every 100 iterations, instead of each iteration?
		// yes. I can add another if statement in the loop to decide when it's 
		//100 iterations after the last print
		
	}

}
