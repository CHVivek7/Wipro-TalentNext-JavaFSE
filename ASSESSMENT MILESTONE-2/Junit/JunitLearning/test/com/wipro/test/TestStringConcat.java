package com.wipro.test;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.wipro.task.*;
public class TestStringConcat {
	@Test
	void Test() {
		DailyTasks dt = new DailyTasks();
		String actualResult = dt.doStringConcat("Hello", "World");
		String expectedResult = "Hello World";
		assertEquals(expectedResult, actualResult);
	}
	
}
