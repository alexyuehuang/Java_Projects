package exercises8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class UsingSet {

	public static void main(String[] args) {
		//
		// Your code goes here:
		//    (most of what you want can be 
		//      copied and pasted from 
		//      your solution to UsingList)
		//
		Set<String> a = new HashSet<String>();
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
