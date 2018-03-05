package ex1;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class SeqSegFinderTest {

	@Test
	public void basicExample() {
		assertEquals(Arrays.asList(new Segment(10,20),new Segment(5, 27)), 
				new SeqSegmentFinder(
				Arrays.asList(new Segment(1, 8),
						new Segment(10, 12),
						new Segment(18, 20),
						new Segment(5, 7),
						new Segment(24, 27),
						new Segment(29, 33))).filterByDelta(5));
	}
}
