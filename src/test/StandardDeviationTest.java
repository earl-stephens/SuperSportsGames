package test;
import main.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StandardDeviationTest {
	StandardDeviation sd;
	
	@BeforeEach
	void setUp() {		
		int[] ages = {24, 30, 18, 20, 41};
		sd = new StandardDeviation(ages);
	}

	@Test
	void testForStandardDeviationObject() {
		
		Assert.assertNotNull(sd);
	}
	
	@Test
	void testForStandardDeviation() {
		
		Assert.assertEquals(8.28, sd.standardDeviation(), 0.02);
	}
}
