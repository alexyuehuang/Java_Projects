package lists;


public class ListItem {
	//
	// Important:  Do NOT make these instance variables private
	// Our testing needs to be able to access them, so leave their
	//   declarations as you see them below.
	//
	final int number;
	ListItem next;

	/**
	 * Creates a single list item.
	 * @param number the value to be held in the item
	 * @param next a reference to the next item in the list
	 */
	ListItem(int number, ListItem next) {
		this.number = number;
		this.next   = next;
	}

	/**
	 * Return a copy of this list using recursion.  No
	 * credit if you use any iteration!  All existing lists should remain
	 * intact -- this method must not mutate anything.
	 * @return
	 */
	public ListItem duplicate() {
		ListItem a = new ListItem(this.number, this.next);
		if(next==null) {
			return a;
		}
		else {
			a.next=this.next.duplicate();
			return a;
		}
	}

	/**
	 * Recursively compute the number of elements in the list. No
	 * credit if you use any iteration!  All existing lists should remain
	 * intact.
	 * @return
	 */
	public int length() {
		if(this.next==null) {
			return 1;
		}
		else {
			return 1+this.next.length();
		}
	}

	/**
	 * Return a new list, like duplicate(), but every element
	 * appears n times instead of once.  See the web page for details.
	 * You must do this method iteratively.  No credit
	 * if you use any recursion!
	 * @param n a positive (never 0) number specifying how many times to copy each element
	 * @return
	 */

	public ListItem stretch(int n) {
//		ListItem a = new ListItem(this.number, this.next);
		ListItem array = new ListItem(this.number, null);
		ListItem pointer = array;
//		System.out.println(array);
//		System.out.println(pointer);
//		for(int i=0; i<n-1; i++) {
//			pointer.next = new ListItem(this.number, null);
//			pointer = pointer.next;
//			System.out.println(pointer);
//			System.out.println(array);
//		}
//		System.out.println("k");
//		int g=0;
		for(ListItem p=this; p!=null; p=p.next) {
			for(int i=0; i<n; i++) {
				pointer.next = new ListItem(p.number, null);
				pointer = pointer.next;
//				System.out.println(pointer);
//				System.out.println(array);
				
			}
			//System.out.println("K");
//			if(p.next.next==null) {
//				for(int i=0; i<n; i++) {
//					g=6;
//					System.out.println("k");
//					pointer.next = new ListItem(g, null);
//					pointer = pointer.next;
//					System.out.println(pointer);
//					System.out.println(array);
//				}
//			}
	}
//			//			while(p!=null&&g==0) {
//			//				if(p.next==null) {
//			//					p.next=a;
//			//					g=1;
//			//				}
//			//				p=p.next;
//			//			}
//			//			if(array.next==null) {
//			//				array.next=a;
//			//			}
//		}
		//		System.out.println(array);
		//		g=0;
		//		for(ListItem p=this.next; p!=null; p=p.next) {
		//			a=p;
		//			for(int i=0; i<n; i++) {
		//				ListItem q=array.next;
		//				while(q!=null&&g==0 ) {
		//					if(q.next==null) {
		//						q.next=a;
		//						g=1;
		//					}
		//					q=q.next;
		//				}
		//				if(array.next==null) {
		//					array.next=a;
		//				}
		//			}
		//		}
		return array.next;
		//		while(this.next!=null) {
		//			for(int i=0; i<n; i++) {
		//				
		////				for(ListItem p=this.next; p.next!=null; p=p.next) {
		////					
		////				}
		//				this.next=this.next.next;
		//			}
		//		}
		//			//a.next=this.next.stretch(n);
		//			
		////			for(int i=0; i<n; i++) {
		//				

	}

	/**
	 * Return the first ListItem, looking from "this" forward,
	 * that contains the specified number.  No lists should be
	 * modified as a result of this call.  You may do this recursively
	 * or iteratively, as you like.
	 * @param n
	 * @return
	 */

	public ListItem find(int n) {
		ListItem a= new ListItem(this.number, this.next);
		if(this.number==n) {
			return a;
		}
		if(this.next==null) {
			return null;
		}
		else {
			return this.next.find(n);
		}
	}

	/**
	 * Return the maximum number contained in the list
	 * from this point forward.  No lists should be modified
	 * as a result of this call.  You may do this method recursively
	 * or iteratively,as you like.
	 * @return
	 */

	public int max() {
		if(this.next==null) {
			return this.number;
		}
		else {
			return Math.max(this.number, this.next.max());
		}
	}

	/**
	 * Returns a copy of the list beginning at ls, but containing
	 * only elements that are even.
	 * @param ls
	 * @return
	 */
	public static ListItem evenElements(ListItem ls) {
		if(ls==null) {
			return null;
		}
		if(ls.next==null) {
			if(ls.number%2==0) {
				return ls;
			}
			else {
				return null;
			}
		}
		else {
			if(ls.number%2==0) {
				return new ListItem(ls.number, evenElements(ls.next));
			}
			else {
				return evenElements(ls.next);
			}
		}
	}	


	/**
	 * Returns a string representation of the values reachable from
	 * this list item.  Values appear in the same order as the occur in
	 * the linked structure.  Leave this method alone so our testing will work
	 * properly.
	 */
	public String toString() {
		if (next == null)
			return ("" + number);
		else
			return (number + " " + next); // calls next.toString() implicitly
	}

}
