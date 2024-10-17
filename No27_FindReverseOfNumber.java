package TwentyToThirty;

import java.util.Scanner;

public class No27_FindReverseOfNumber {

	public static void main(String[] args) {
		System.out.print("Enter the Number: ");
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt(), rev = 0, rem = 0;
		while (num != 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num /= 10;
		}

		System.out.println("Reverse is: " + rev);
		scan.close();
	}

}
