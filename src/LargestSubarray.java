import java.util.Scanner;

public class LargestSubarray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int totalNumberOfTestCases = sc.nextInt();
		for (int k = 0; k < totalNumberOfTestCases; k++) {
			int numberOfElements = sc.nextInt();
			int[] array = new int[numberOfElements];
			for (int i = 0; i < array.length; i++) {
				array[i] = sc.nextInt();
			}

		for (int i = 0; i < array.length; i++) {
			if(array[i]==0)
			{
				array[i]=-1;
			}
		}
			System.out.println(maxLength(array));
		}
	}

	public static int maxLength(int[] arr) {
		int sz = arr.length;
		int sum = 0, stIdx = 0, endIdx = 0, maxlen = -1;

		for (int i = 0; i < sz - 1; i++) {

			sum = (arr[i] == 0) ? -1 : 1;

			for (int j = i + 1; j < sz; j++) {
				sum += (arr[j] == 0) ? -1 : 1;
				if (sum == 0 && maxlen < j - i + 1) {
					maxlen = j - i + 1;
					stIdx = i;
				}
			}
		}
		endIdx = stIdx + maxlen - 1;
		return maxlen == -1 ? 0 : maxlen;
	}
}
