package josephbettendorff.javachallenges.week1_20111206;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import josephbettendorff.javachallenges.week1_20111206.LCM;

public class LCMTests
{
	@Test
	void lcmOfArrayExamples()
	{
		Assertions.assertEquals(2744820, LCM.lcmOfArray(5, 4, 6, 46, 54, 12, 13, 17));
		Assertions.assertEquals(78712992, LCM.lcmOfArray(46, 54, 466, 544));
		Assertions.assertEquals(2520, LCM.lcmOfArray(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		Assertions.assertEquals(27965340, LCM.lcmOfArray(13, 6, 17, 18, 19, 20, 37));
	}
}
