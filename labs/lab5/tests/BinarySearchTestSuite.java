package lab5.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import lab5.tests.binarysearch.BinarySearchTest;
import lab5.tests.binarysearch.MidpointTest;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ MidpointTest.class, BinarySearchTest.class })
public class BinarySearchTestSuite {
}
