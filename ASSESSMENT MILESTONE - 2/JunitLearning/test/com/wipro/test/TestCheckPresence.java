package com.wipro.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Test;
import com.wipro.task.*;

public class TestCheckPresence {
	@Test
	void Test() {
		DailyTasks dt = new DailyTasks();
		boolean actualResult = dt.checkPresence("Hello World", "World");
		assertTrue(actualResult);
	}
	
	@Test
	void Test1() {
		DailyTasks dt = new DailyTasks();
		boolean actualResult = dt.checkPresence("Hello World", "Java");
		assertFalse(actualResult);
	}
}
