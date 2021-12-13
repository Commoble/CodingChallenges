package josephbettendorff.javachallenges.week2_20211213;

public class StaircaseOfRecursion
{
	/**
	 * Returns the number of ways a person can climb n stairs,
	 * where the person may only climb 1 or 2 steps at a time.
	 * Returns 1 if n is 0.
	 * @param n A non-negative integer (n >= 0)
	 * @return A positive integer (output > 0)
	 */
	public static int waysToClimb(int n)
	{
		return n <= 1
			? 1
			: waysToClimb(n-1) + waysToClimb(n-2);
	}
}
