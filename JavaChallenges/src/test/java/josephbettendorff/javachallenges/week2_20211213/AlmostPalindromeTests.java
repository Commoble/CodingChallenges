package josephbettendorff.javachallenges.week2_20211213;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AlmostPalindromeTests
{
	@Test
	void almostPalindromeCases()
	{
		Assertions.assertTrue(AlmostPalindrome.almostPalindrome("abcdcbg"));
		Assertions.assertTrue(AlmostPalindrome.almostPalindrome("abccia"));
		Assertions.assertFalse(AlmostPalindrome.almostPalindrome("abcdaaa"));
		Assertions.assertFalse(AlmostPalindrome.almostPalindrome("1234312"));
	}
}
