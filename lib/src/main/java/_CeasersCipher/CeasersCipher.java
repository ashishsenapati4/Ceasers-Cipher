package _CeasersCipher;

public class CeasersCipher {
	private static char LETTER_A = 'a';
	private static char LETTER_Z = 'z';

	private static int MAX_LETTER = 26;
	
	public String DoCiphering(String text, int offset)
	{
		offset %= MAX_LETTER;
		char[] char_array = text.toCharArray();
		String str = "";
		
		for(int i = 0; i<char_array.length;++i)
		{
			if(char_array[i] != ' ')
			{
				char_array[i] += offset;
				if(char_array[i] > LETTER_Z)
				{
					char_array[i] -= MAX_LETTER;
				}
				if(char_array[i] < LETTER_A)
				{
					char_array[i] += MAX_LETTER;
				}
				str += char_array[i];
			}
			else
			{
				str += char_array[i];
			}
		}
		return str;
	}
}
