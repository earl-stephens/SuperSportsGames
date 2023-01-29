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
	void testForSumOfIntegers() {
		
		Assert.assertEquals(133, sd.sum());
	}
	
	@Test
	void testForCalculatingMean() {
		
		Assert.assertEquals(26.60, sd.mean(), 0.02);
	}
	
	@Test
	void testForOriginalNumberMinusMean() {
		double[] expectedArray = {-2.60, 3.40, -8.60, -6.60, 14.4};
		
		Assert.assertEquals(expectedArray[2], sd.originalsMinusMean()[2], 0.02);
		Assert.assertEquals(expectedArray[4], sd.originalsMinusMean()[4], 0.02);
	}
}
