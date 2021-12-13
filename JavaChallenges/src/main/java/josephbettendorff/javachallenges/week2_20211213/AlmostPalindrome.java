package josephbettendorff.javachallenges.week2_20211213;

public class AlmostPalindrome
{
	/**
	 * @param input Any string
	 * @return True if, by changing exactly one character, the string becomes a palindrome (same forwards and back);
	 * returns false if the input is already a palindrome or if changing it to a palindrome would require changing more than one character
	 */
	public static boolean almostPalindrome(String input)
	{
		int length = input.length();
		// we'll look at the first half of the input compared to the second half of the input
		// (ignoring the middle character for odd-lengthed strings)
		int halfLength = length / 2;
		int changesNeeded = 0;
		for (int i=0; i < halfLength; i++)
		{
			if (input.charAt(i) != input.charAt((length-1) - i))
			{
				changesNeeded++;
				if (changesNeeded > 1) // no point in looking further
					return false;
			}
		}
		return changesNeeded == 1;
	}
}
