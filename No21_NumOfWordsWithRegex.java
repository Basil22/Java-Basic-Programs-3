package TwentyToThirty;

public class No21_NumOfWordsWithRegex {

	public static void main(String[] args) {
		String sentence = "Hello, World. \t\nHow are you?";
		String[] arrayOfWords = sentence.split("[ \n\t\\p{Punct}?]+");
		
		System.out.println(arrayOfWords.length);
	}

}
