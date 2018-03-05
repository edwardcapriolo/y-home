package ex1;

import java.util.*;
/*
 * Given a collection of objects of a class with 2 integer fields , 
 * startTime and endTime (where startTime < endTime) , 
 * create a new collection such that the earliest startTime is preserved and the latest endTime is preserved , 
 * only if the difference between consecutive endTime and startTime is less than or equal to 5. 
 * In other words in the output collection , the difference between 2 consecutive endTime and startTime has to be greater than 5.


1------------12 18---------------33

Difference = 6 ( > 5)
 */
public class SeqSegmentFinder {

	private final Collection<Segment> segments;
	
	public SeqSegmentFinder(Collection<Segment> segments) {
		this.segments = segments;
	}
	
	public Collection<Segment> filterByDelta(long delta){
		Collection<Segment> results = new ArrayList<Segment>();
		Segment last = null;
		for(Segment s: segments) {
			if (last == null) {
				last = s;
			} else {
				if (s.getStartTime() - last.getEndTime() > delta) {
					results.add( new Segment(last.getStartTime(), s.getEndTime()));
				}
				last = s;
			}
		}
		return results;
	}
}
