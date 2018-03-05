package ex2;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class CharMapTest {

	@Test
	public void findCat() {
		CharMapper c = new CharMapper();
		Assert.assertEquals(Arrays.asList("cat"), c.findWordsForCode("005"));
	}
}
