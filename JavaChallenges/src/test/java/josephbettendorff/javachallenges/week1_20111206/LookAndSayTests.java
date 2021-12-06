package josephbettendorff.javachallenges.week1_20111206;

import java.math.BigInteger;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LookAndSayTests
{
	@Test
	void lookAndSayExamples()
	{
		Assertions.assertEquals(BigInteger.valueOf(23002799999999L), LookAndSay.lookAndSay(1213200012171979L));
		// second expected value is 44444444446666666666, we need to do some bigint math to create it
		BigInteger secondExpectedValue = BigInteger.valueOf(4444444444L);
		secondExpectedValue = secondExpectedValue.multiply(BigInteger.valueOf(10000000000L));
		secondExpectedValue = secondExpectedValue.add(BigInteger.valueOf(6666666666L));
		Assertions.assertEquals(secondExpectedValue, LookAndSay.lookAndSay(54544666L));
		Assertions.assertEquals(BigInteger.valueOf(555555555L), LookAndSay.lookAndSay(95L));
		Assertions.assertEquals(BigInteger.valueOf(23456789L), LookAndSay.lookAndSay(1213141516171819L));
		Assertions.assertEquals(BigInteger.valueOf(200L), LookAndSay.lookAndSay(120520L));
		Assertions.assertEquals(BigInteger.valueOf(-1L), LookAndSay.lookAndSay(231L));
	}
}
