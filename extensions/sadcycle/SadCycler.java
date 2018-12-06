package sadcycle;

import java.util.HashSet;
import java.util.Set;

public class SadCycler{
	//private int num;
	
	/**
	 * @param num
	 */
//	public SadCycler(int num) {
//		super();
//		this.num = num;
//	}

	public static Set<Long> findCycle(int base, long n){
		int num=base;
		Set<Long>a= new HashSet<Long>();
		long next=0;
		int num1=num;
		while(num1>0) {
			next+=Math.pow(num1%10, 2);
			num1=num1/10;
		}
		while(next!=1&&!a.contains(next)) {
			a.add(next);
			long next1=next;
			next=0;
			while(next1>0) {
				next+=Math.pow(next1%10, 2);
				next1=next1/10;
			}
		}
		if(next==1) {
			a=new HashSet<Long>();
			a.add((long) 1);
		}
		else {
			a=new HashSet<Long>();
			for(int i=0; i<n; i++){
				a.add(next);
				long next1=next;
				next=0;
				while(next1>0) {
					next+=Math.pow(next1%10, 2);
					next1=next1/10;
				}
			}
		}
		return a;
	}

	public static void main(String[] args){
		int num=7;
		Set<Long> a =findCycle(num, 10);
		Object[] b=a.toArray();
		for(int i=0; i<1; i++) {
			System.out.println(b[i]);
		}
	}

}
