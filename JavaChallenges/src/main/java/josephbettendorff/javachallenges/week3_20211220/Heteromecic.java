package josephbettendorff.javachallenges.week3_20211220;

public class Heteromecic
{
	/**
	 * @param product Non-negative integer (product >= 0)
	 * @return True if product is a product of two consecutive integers (n)(n+1), false otherwise 
	 */
	public static boolean isHeteromecic(int product)
	{
		// suppose a number n exists such that product = n * (n+1) = n^2 + n
		// this can be solved via quadratic formula
		// p = n^2 + n
		// 0 = n^2 + n - p
		// n = (-1 +/- sqrt(1 - 4*1*-p))/2
		// n = (-1 +/- sqrt(4p + 1))/2
		// n = sqrt(4p+1)/2 - 1/2 or n = -sqrt(4p+1)/2 - 1/2

		// if n < 0 then the sqrt fails, from this we confirm that the input must be >= 0
		
		// let rad = sqrt(4p+1)/2
		// if rad - 0.5 is an integer or -rad - 0.5 is an integer, then the input is heteromecic
		// boolean heteromecic = isInt(abs(sqrt(4p+1)/2) - 0.5)
		// this will be true if abs(sqrt(4p+1)) is an odd integer
		return Math.abs(Math.sqrt(4*product + 1)) % 2 == 1; // if absqrt isn't an int then this won't be 1
	}
}
