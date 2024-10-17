package TwentyToThirty;

import java.util.Scanner;

public class No25_DisplayMagicNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your number: ");
		int n = scan.nextInt();
		int sum = 0;
		int rem;

		int num = n;
		while (num > 9) {
			while (num > 0) {
				rem = num % 10;
				sum += rem;
				num /= 10;
			}
			num = sum;
			sum = 0;
		}

		if (num == 1)
			System.out.println("Magic Number.");
		else
			System.out.println("Not Magic Number.");

		scan.close();
	}

}
