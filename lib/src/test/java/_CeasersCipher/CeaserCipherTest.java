package _CeasersCipher;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CeaserCipherTest {

	private CeasersCipher ceaserCipher = new CeasersCipher();
	
	@Test
	void testCipheredMessageWithOffset12()
	{
		assertEquals("nai mdq kag pauzs", ceaserCipher.DoCiphering("How are you doing", 12));
	}
	
	@Test
	void testCipheredMessageEmptyString()
	{
		assertEquals("", ceaserCipher.DoCiphering("", 1));
	}
	
	//fail test..
//	@Test
//	void testCipheredMessageFailTest()
//	{
//		assertEquals("nai mdq kag pauzs", ceaserCipher.DoCiphering("How are you doing", 11));
//	}

}
