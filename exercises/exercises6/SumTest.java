

package exercises6;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumTest {

	@Test
	public void test() {
		assertEquals(0, Sum.sum(0));
		assertEquals(1, Sum.sum(1));
		assertEquals(10, Sum.sum(4));
		for (int i =0; i<1000; i++) {
			assertEquals((i*(i+1))/2, Sum.sum(i));
		}
	}

}
