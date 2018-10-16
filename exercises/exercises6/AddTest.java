package exercises6;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddTest {

	@Test
	public void test() {
		assertEquals(0, Add.add(0, 0));
		assertEquals(12, Add.add(10, 2));
		assertEquals(26, Add.add(20, 6));
		assertEquals(25, Add.add(3, 22));
		assertEquals(0, Add.addAny(0, 0));
		assertEquals(12, Add.addAny(10, 2));
		assertEquals(26, Add.addAny(20, 6));
		assertEquals(-19, Add.addAny(3, -22));
	}

}
