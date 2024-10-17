package TwentyToThirty;

import java.util.Scanner;

public class No22_PalindromeNumber {

	public static void main(String[] args) {
		
		System.out.print("Enter the Number: ");
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt(), rev=0, rem=0, ogNum=num;
		while(num != 0) {
			rem = num%10;
			rev = rev * 10 + rem;
			num /= 10;
		}
		
		if(ogNum == rev) System.out.println("Palindrome");
		else System.out.println("Not Palindrome");
		scan.close();
	}
}