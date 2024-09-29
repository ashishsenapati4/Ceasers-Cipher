package _CeasersCipher;

public class Main {

	public static void main(String[] args) {
		
		String input = "How are you doing";
		int offset = 12;
		
		CeasersCipher obj = new CeasersCipher();
		String res = obj.DoCiphering(input, offset);
		System.out.println("Ciphered text: "+res);
				}

}
