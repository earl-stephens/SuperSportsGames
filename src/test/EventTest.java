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

}
