package lab5.tests.strings;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import lab5.Strings;
import lab5.tests.utils.StringTestUtils;
import lab5.tests.utils.UnitTestUtils;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 * 
 *         {@link Strings#isLexicographicallyBefore(String, String)}
 *         {@link Strings#equals(String, String)}
 *         {@link Strings#isLexicographicallyAfter(String, String)}
 */
@RunWith(Parameterized.class)
public class StringComparisonTest {
	private final String a;
	private final String b;
	private final CompareResult expected;

	public StringComparisonTest(String a, String b, CompareResult expected) {
		this.a = a;
		this.b = b;
		this.expected = expected;
	}

	@Rule
	public TestRule timeout = UnitTestUtils.createTimeoutRule();

	@Test
	public void testAlphabeticallyBefore() {
		boolean actual = Strings.isLexicographicallyBefore(a, b);
		if (expected.isExpectedBefore()) {
			assertTrue(actual);
		} else {
			assertFalse(actual);
		}
	}

	@Test
	public void testEquals() {
		boolean actual = Strings.equals(a, b);
		if (expected.isExpectedEquals()) {
			assertTrue(actual);
		} else {
			assertFalse(actual);
		}
	}

	@Test
	public void testAlphabeticallyAfter() {
		boolean actual = Strings.isLexicographicallyAfter(a, b);
		if (expected.isExpectedAfter()) {
			assertTrue(actual);
		} else {
			assertFalse(actual);
		}
	}

	@Parameters(name = "{0}; {1}; expected: {2}")
	public static Collection<Object[]> getConstructorArguments() {
		List<Object[]> result = new LinkedList<>();
		result.add(new Object[] { "", "", CompareResult.EQUALS });

		result.add(new Object[] { "A", "B", CompareResult.BEFORE });
		result.add(new Object[] { "A", "A", CompareResult.EQUALS });
		result.add(new Object[] { "B", "A", CompareResult.AFTER });

		result.add(new Object[] { "AAA", "AAB", CompareResult.BEFORE });
		result.add(new Object[] { "AAA", "AAA", CompareResult.EQUALS });
		result.add(new Object[] { "AAB", "AAA", CompareResult.AFTER });

		result.add(new Object[] { "AAAAA", "AABAA", CompareResult.BEFORE });
		result.add(new Object[] { "AAAAA", "AAAAA", CompareResult.EQUALS });
		result.add(new Object[] { "AABAA", "AAAAA", CompareResult.AFTER });

		Random random = new Random();
		for (int len = 1; len < 5; len++) {
			for (int lcv = 0; lcv < 8; lcv++) {
				String s = StringTestUtils.nextRandomString(random, len);
				result.add(new Object[] { s, s, CompareResult.EQUALS });
			}
		}

		for (int i = 0; i < 100; i++) {
			String a = StringTestUtils.nextRandomString(random, random.nextInt(3) + 2);
			String b = StringTestUtils.nextRandomString(random, random.nextInt(3) + 2);

			result.add(new Object[] { a, b, CompareResult.valueOf(a, b) });

		}
		return result;
	}

	private static enum CompareResult {
		BEFORE(true, false, false), EQUALS(false, true, false), AFTER(false, false, true);
		private final boolean isExpectedBefore;
		private final boolean isExpectedEquals;
		private final boolean isExpectedAfter;

		private CompareResult(boolean isExpectedBefore, boolean isExpectedEquals, boolean isExpectedAfter) {
			this.isExpectedBefore = isExpectedBefore;
			this.isExpectedEquals = isExpectedEquals;
			this.isExpectedAfter = isExpectedAfter;
		}

		public boolean isExpectedBefore() {
			return isExpectedBefore;
		}

		public boolean isExpectedEquals() {
			return isExpectedEquals;
		}

		public boolean isExpectedAfter() {
			return isExpectedAfter;
		}

		public static CompareResult valueOf(String a, String b) {
			int v = a.compareTo(b);
			return v < 0 ? BEFORE : (v == 0) ? EQUALS : AFTER;
		}
	}
}
