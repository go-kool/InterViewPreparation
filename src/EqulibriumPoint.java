import java.util.Scanner;

public class EqulibriumPoint {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int totalNumberOfTestCases = sc.nextInt();
		for (int k = 0; k < totalNumberOfTestCases; k++) {
			System.out.println(equlibriumPoint());
		}
	}

	public static int equlibriumPoint() {
		Scanner sc = new Scanner(System.in);
		int numberOfElements = sc.nextInt();
		int[] array = new int[numberOfElements];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		int sum = 0;
		int leftSum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		for (int i = 0; i < array.length; i++) {
			sum = sum - array[i];
			if (sum == leftSum) {
				return i + 1;
			}
			leftSum = leftSum + array[i];
		}
		return -1;
	}
}
