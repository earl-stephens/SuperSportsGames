package test;
import main.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class StandardDeviationTest {

	@Test
	void testForStandardDeviationObject() {
		int[] ages = {24, 30, 18, 20, 41};
		StandardDeviation sd = new StandardDeviation(ages);
		
		Assert.assertNotNull(sd);
	}

}
