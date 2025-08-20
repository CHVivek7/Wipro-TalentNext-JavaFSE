package com.wipro.test;
import static org.junit.Assert.assertArrayEquals;
import org.junit.jupiter.api.Test;
import com.wipro.task.*;
public class TestSort {
	@Test
	void Test() {
		DailyTasks dt = new DailyTasks();
		int[] unsorted = {5,4,3,2,1};
		int[] actualResult = dt.sortValues(unsorted);
		int[] expectedResult = {1,2,3,4,5};
		assertArrayEquals(expectedResult, actualResult );
	}
}
