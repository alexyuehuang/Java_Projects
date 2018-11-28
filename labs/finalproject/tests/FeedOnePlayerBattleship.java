package finalproject.tests;

import java.util.LinkedList;
import java.util.List;

import finalproject.OnePlayerBattleship;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class FeedOnePlayerBattleship {
	public static void main(String[] args) {
		int w = 10;
		int h = 10;
		List<String> list = new LinkedList<>();
		list.add("Fred");
		list.add(Integer.toString(w));
		list.add(Integer.toString(h));
		list.add(Integer.toString(5));
		list.add("true");
		for (int r = 0; r < h; ++r) {
			for (int c = 0; c < w; ++c) {
				list.add(Integer.toString(r));
				list.add(Integer.toString(c));
			}
		}
		String[] argsForProcessing = list.toArray(new String[list.size()]);
		OnePlayerBattleship.main(argsForProcessing);
	}
}
