package josephbettendorff.javachallenges.week1_20111206;

public class LCM
{
	/**
	 * Computes the Lowest Common Multiple of a sequence of input integers
	 * @param inputs An array of at least two positive integers (n > 0)
	 * @return The smallest positive integer divisible by each input integer
	 */
	public static int lcmOfArray(int... inputs)
	{
		// suppose we have two numbers, from the list, A and B
		// lcmOfArray(inputs) will be a multiple of lcm(a,b)
		// we can find the lcm of all numbers by finding the lcm of the first two numbers, lcm(a, b)
		// then finding lcm(lcm(a, b), c),
		// repeating in this manner until we have iterated over every input
		int length = inputs.length;
		int lcm = lcm(inputs[0], inputs[1]);
		int next = 2;
		while (next < length)
		{
			lcm = lcm(lcm, inputs[next]);
			next++;
		}
		
		return lcm;
	}
	
	/**
	 * Computes the Lowest Common Multiple of two positive integer
	 * @param a A positive integer, a > 0
	 * @param b Another positive integer, b > 0
	 * @return The smallest positive integer divisible by both input integers
	 */
	private static int lcm(int a, int b)
	{
		// flip the inputs first to ensure a >= b to make the math easier
		if (b > a)
		{
			return lcm(b,a);
		}
		// otherwise just find the smallest multiple of a such that a*x divides b
		int lcm = a;
		while (lcm % b != 0)
		{
			lcm += a;
		}
		return lcm;
	}
}
