package josephbettendorff.javachallenges.week2_20211213;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StaircaseOfRecursionTests
{
	@Test
	void waysToClimbCases()
	{
		Assertions.assertEquals(1, StaircaseOfRecursion.waysToClimb(0));
		Assertions.assertEquals(1, StaircaseOfRecursion.waysToClimb(1));
		Assertions.assertEquals(2, StaircaseOfRecursion.waysToClimb(2));
		Assertions.assertEquals(8, StaircaseOfRecursion.waysToClimb(5));
	}
}
