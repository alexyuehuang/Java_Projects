package studio8;

import java.util.LinkedList;

public interface Working {
	public boolean amWorking();
	
	

	public static void main(String[] args) {
		LinkedList<Working> w = new LinkedList<Working>();
		Time ta = new Time(10,14, true);
		Date da = new Date(11,1,2018, false);
		w.add(da);
		w.add(ta);
		System.out.println(w);
	}
}
