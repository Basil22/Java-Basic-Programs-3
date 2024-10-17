package TwentyToThirty;

public class No26_LShape {
	public static void main(String[] args) {
		//METHOD 1
//		int size = 5;
//
//		for (int i = 0; i < size; i++) {
//			for (int j = 0; j < size; j++) {
//				if (j == 0 || i == size - 1) {
//					System.out.print("*");
//				} else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		
		//METHOD 2
		int n = 5;

		for (int i = 0; i < n - 1; i++) {
			System.out.println("*");
		}
		for (int j = 0; j < n; j++) {
			System.out.print("*");
		}
	}
}
