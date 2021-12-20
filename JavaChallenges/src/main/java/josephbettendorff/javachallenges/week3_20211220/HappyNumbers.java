package josephbettendorff.javachallenges.week3_20211220;

import java.util.HashSet;
import java.util.Set;

public class HappyNumbers
{
	/**
	 * Given a number n, let sumSquareDigits(n) = the sum of the squares of its digits
	 * The result of this function can be fed back into the function indefinitely
	 * Let a number be considered "happy" if repeated calculation eventually results in 1,
	 * and "not happy" if repeated calculation never results in 1
	 * @param n Positive integer (n > 0)
	 * @return True if the number is happy, false if not
	 */
	public static boolean happy(int n)
	{
		// repeatedly calculate until calculation either returns 1, or a number that we have already calculated
		Set<Integer> found = new HashSet<>();
		while (true)
		{
			if (n == 1)
				return true;
			if (found.contains(n))
				return false;
			found.add(n);
			n = sumSquareDigits(n);
		}
	}
	
	/**
	 * Returns the sum of the squares of a number's digits,
	 * e.g. (1232) -> 1^2 + 2^2 + 3+2 + 2^2 = 1 + 4 + 9 + 4 = 18
	 * @param n Positive whole number (n > 0)
	 * @return Sum of squares of the number's digits
	 */
	private static int sumSquareDigits(int n)
	{
		int sum = 0;
		while (n > 0)
		{
			int digit = n % 10;
			sum += digit*digit;
			n /= 10;
		}
		return sum;
	}
}
