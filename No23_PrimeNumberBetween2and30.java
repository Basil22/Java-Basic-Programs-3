package TwentyToThirty;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class No23_PrimeNumberBetween2and30 {

	public static void main(String[] args) {
		List<Integer> primeArrayList = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		
		primeArrayList.add(2);
		primeArrayList.add(3);
		primeArrayList.add(5);
		primeArrayList.add(7);
				
		for(int i=2; i<=30; i++) {
			if(!(i%2==0 || i%3==0 || i%5==0 || i%7==0)) primeArrayList.add(i);
		}
		System.out.println(primeArrayList);
		scan.close();
	}
}
