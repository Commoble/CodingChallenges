package josephbettendorff.javachallenges.week2_20211220;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import josephbettendorff.javachallenges.week3_20211220.Heteromecic;

public class HeteromecicTests
{
	@Test
	void heteromecicCases()
	{
		Assertions.assertTrue(Heteromecic.isHeteromecic(0));
		Assertions.assertTrue(Heteromecic.isHeteromecic(2));
		Assertions.assertFalse(Heteromecic.isHeteromecic(7));
		Assertions.assertTrue(Heteromecic.isHeteromecic(110));
		Assertions.assertFalse(Heteromecic.isHeteromecic(136));
		Assertions.assertTrue(Heteromecic.isHeteromecic(156));
	}
}
