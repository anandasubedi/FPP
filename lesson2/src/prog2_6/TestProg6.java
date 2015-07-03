package prog2_6;
import java.util.Arrays;

import junit.framework.Assert;

import org.junit.Test;

public class TestProg6 {
	String[] resultArray = new String[2];
	String[] ExpectedArray = { "apple", "ball" };

	@Test
	public void testRemoveDups() {
		// assertTrue(resultArray.equals(ExpectedArray));
		String[] testArray = {"apple","banana","cat","banana","dog","book","cat"};
		String[] expectedArray = { "apple", "banana", "cat", "dog", "book" };

		String[] resultArray = new String[5];
		resultArray = Prog6.removeDups(testArray);
		Assert.assertTrue(Arrays.equals(resultArray, expectedArray));

	}

}
