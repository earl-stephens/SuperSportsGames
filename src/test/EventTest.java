package test;
import main.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class EventTest {

	@Test
	void testForEventObject() {
		int[] ages = {24, 30, 18, 20, 41};
		Event event = new Event("Curling", ages);
		
		Assert.assertNotNull(event);
	}

	@Test
	void testForGettingNameAndAges() {
		int[] ages = {24, 30, 18, 20, 41};
		Event event = new Event("Curling", ages);
		
		Assert.assertEquals("Curling", event.getName());
		Assert.assertEquals(ages, event.getAges());
	}
	
	@Test
	void testForMax_Age() {
		int[] ages = {24, 30, 18, 20, 41};
		Event event = new Event("Curling", ages);
		
		Assert.assertEquals(41, event.max_age());
	}
	
	@Test
	void testForMinAge() {
		int[] ages = {24, 30, 18, 20, 41};
		Event event = new Event("Curling", ages);
		
		Assert.assertEquals(18, event.min_age());
	}
	
	@Test
	void testForAverageAge() {
		int[] ages = {24, 30, 18, 20, 41};
		Event event = new Event("Curling", ages);
		
		Assert.assertEquals(26.60, event.average_age(), 0.02);
	}
	
	@Test
	void testForStandardDeviation() {
		int[] ages = {24, 30, 18, 20, 41};
		Event event = new Event("Curling", ages);
		
		Assert.assertEquals(8.28, event.standard_deviation_age(), 0.02);
	}
}
