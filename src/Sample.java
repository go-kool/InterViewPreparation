import java.util.Scanner;

public class Sample {

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

	public static int maxLength(int[] array)
	{
		int max_length=0;
		for (int i = 0; i < array.length; i++) {
			int sum=0;
			for (int j = i; j < array.length; j++) {
				sum=sum+array[j];
				if(sum==0)
				{
					max_length=Math.max(max_length, j-i+1);
				}
			}
		}
		return max_length;
	}
}
