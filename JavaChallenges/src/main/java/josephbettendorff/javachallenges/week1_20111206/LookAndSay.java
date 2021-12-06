package josephbettendorff.javachallenges.week1_20111206;

import java.math.BigInteger;
import java.util.Stack;

public class LookAndSay
{
	private static final BigInteger BAD_INPUT = BigInteger.valueOf(-1);
	/**
	 * For each pair of digits in the input number (read left to right),
	 * The two digits are read e.g. 53 = "five threes",
	 * and then built into the output number.
	 * 123456 = "one two, three fours, five sixes" = 244466666
	 * @param n A positive integer (n >= 10) with an even number of digits (length >= 2)
	 * @return If n has an odd number of digits, returns -1.
	 * Otherwise, returns a non-negative BigInteger (output >= 0)
	 */
	public static BigInteger lookAndSay(long n)
	{
		// start by separating n into a list of digits
		// easier to build this from the input right-to-left and then build the output left-to-right
		// this resembles a stack, so we'll use that
		Stack<Long> digits = new Stack<>();
		long remaining = n;
		while (remaining > 0)
		{
			if (remaining < 10) // we had an odd number of digits!
			{
				return BAD_INPUT;
			}
			digits.push(remaining % 10); // a digit
			remaining /= 10;
			digits.push(remaining % 10); // the count of that digit
			remaining /= 10;
		}
		
		// now we have an even-sized stack of digits
		BigInteger result = BigInteger.ZERO;
		while (!digits.isEmpty())
		{
			long count = digits.pop();
			long digit = digits.pop();
			// add that many digits to the result
			for (int i=0; i<count; i++)
			{
				result = result.multiply(BigInteger.TEN);
				result = result.add(BigInteger.valueOf(digit));
			}
		}
		
		return result;
	}
}
