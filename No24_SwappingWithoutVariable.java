package TwentyToThirty;

public class No24_SwappingWithoutVariable {

	public static void main(String[] args) {
		int a = 5;
		int b = 6;

		System.out.print(String.format("Before Swapping: a=%d and b=%d", a, b));

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println(String.format("\nAfter Swapping: a=%d and b=%d", a, b));
	}

}
