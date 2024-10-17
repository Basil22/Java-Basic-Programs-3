package TwentyToThirty;

public class No30_CheckHowManyVowels {

	public static void main(String[] args) {
		String[] vowel = {"a", "e", "i", "o", "u"};
		int count = 0;
		
		String input = "capgemini training";
		String[] inputArray = input.split("");
		
		for(int i=0; i<inputArray.length; i++) {
			for(int j=0; j<vowel.length; j++) {
				if(inputArray[i].equals(vowel[j])) {
					count++;
				}
			}
		}
		System.out.println("No. of Vowels: " + count);
	}

}
