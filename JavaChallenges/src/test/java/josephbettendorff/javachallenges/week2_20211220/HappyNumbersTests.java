package josephbettendorff.javachallenges.week2_20211220;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import josephbettendorff.javachallenges.week3_20211220.HappyNumbers;

public class HappyNumbersTests
{
	@Test
	void happyCases()
	{
		Assertions.assertTrue(HappyNumbers.happy(1));
		Assertions.assertTrue(HappyNumbers.happy(203));
		Assertions.assertFalse(HappyNumbers.happy(11));
		Assertions.assertFalse(HappyNumbers.happy(107));
	}
}
