package studio5x.tests;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import lab5.tests.utils.StringTestUtils;

class MergeCombinerTestUtils {
	static String[] createUninspiringlyCombinedArray(String[] a, String[] b) {
		String[] result = new String[a.length + b.length];
		System.arraycopy(a, 0, result, 0, a.length);
		System.arraycopy(b, 0, result, a.length, b.length);
		Arrays.sort(result, String::compareToIgnoreCase);
		return result;
	}

	public static Collection<Object[]> createDefaultConstructorArguments() {
		Collection<Object[]> result = new LinkedList<>();
		result.add(new Object[] { StringTestUtils.createStringList(), StringTestUtils.createStringList() });
		result.add(new Object[] { StringTestUtils.createStringList("A"), StringTestUtils.createStringList() });
		result.add(new Object[] { StringTestUtils.createStringList(), StringTestUtils.createStringList("A") });
		result.add(new Object[] { StringTestUtils.createStringList("A"), StringTestUtils.createStringList("B") });
		result.add(new Object[] { StringTestUtils.createStringList("B"), StringTestUtils.createStringList("A") });
		result.add(new Object[] { StringTestUtils.createStringList("A", "B"),
				StringTestUtils.createStringList("C", "D") });
		result.add(new Object[] { StringTestUtils.createStringList("C", "D"),
				StringTestUtils.createStringList("A", "B") });
		result.add(new Object[] { StringTestUtils.createStringList("A", "C"),
				StringTestUtils.createStringList("B", "D") });
		result.add(new Object[] { StringTestUtils.createStringList("B", "E", "G"),
				StringTestUtils.createStringList("I", "N", "S") });
		result.add(new Object[] { StringTestUtils.createStringList("I", "N", "S"),
				StringTestUtils.createStringList("B", "E", "G") });
		result.add(new Object[] { StringTestUtils.createStringList("E", "G", "N"),
				StringTestUtils.createStringList("B", "I", "S") });
		return result;
	}

	public static Collection<Object[]> createExtendedConstructorArguments() {
		Collection<Object[]> result = createDefaultConstructorArguments();
		Random random = new Random();
		final int STRING_LENGTH = 3;
		for (int[] configs : new int[][] { { 5, 4 }, { 10, 7 } }) {
			int iterationCount = configs[0];
			int arrayLength = configs[1];
			for (int i = 0; i < iterationCount; i++) {
				List<String> aStrings = StringTestUtils.createUniqueSortedStringList(
						() -> StringTestUtils.nextRandomString(random, STRING_LENGTH), arrayLength);
				List<String> bStrings = StringTestUtils.createUniqueSortedStringList(
						() -> StringTestUtils.nextRandomString(random, STRING_LENGTH), arrayLength);
				result.add(new Object[] { aStrings, bStrings });
			}
		}
		return result;
	}

	public static String createMessage(String[] expected, String[] actual) {
		return "\nexpected:\n\t\t" + Arrays.toString(expected) + "\nactual:\n\t\t" + Arrays.toString(actual) + "\n";
	}

}
