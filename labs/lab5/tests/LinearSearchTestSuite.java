package lab5.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import lab5.tests.linearsearch.LinearSearchTest;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ LinearSearchTest.class })
public class LinearSearchTestSuite {
}
