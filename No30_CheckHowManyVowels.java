package TwentyToThirty;

import java.util.HashSet;
import java.util.Set;

public class No30_CheckHowManyVowels {

	public static void main(String[] args) {
		
		// Define vowels using a set for fast lookup
		Set<Character> vowels = new HashSet<>(Set.of('a', 'e', 'i', 'o', 'u'));
		int count = 0;

		String input = "Java Programs";

		// Convert the string to lowercase for case-insensitive comparison
		input = input.toLowerCase();

		// Iterate over each character in the input string
		for (char ch : input.toCharArray()) {
			if (vowels.contains(ch)) {
				count++;
			}
		}

		System.out.println("No. of Vowels: " + count);
	}

}
