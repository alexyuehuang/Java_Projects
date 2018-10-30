package exercises8;

import java.util.LinkedList;
import java.util.List;

public class UsingList {

	public static void main(String[] args) {
		//
		// Your code goes here:
		//
		List<String> a = new LinkedList<String>();
		a.add("open mouth");
		a.add("insert food");
		a.add("chew");
		a.add("chew");
		a.add("swallow");
		System.out.println(a);
		a.add("digest");
		System.out.println(a);
		a.remove("digest");
		System.out.println(a);
	}

}
