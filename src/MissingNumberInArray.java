import java.util.ArrayList;
import java.util.Scanner;

public class MissingNumberInArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numberOfTestCases = s.nextInt();
		for (int i = 0; i < numberOfTestCases; i++) {
			int n = s.nextInt();
			ArrayList<Integer> arrayList = new ArrayList<Integer>();
			for (int j = 0; j < n - 1; j++) {
				arrayList.add(s.nextInt());
			}
			
			int sumOfArray=0;
			for(int a:arrayList)
			{
			    sumOfArray=a+sumOfArray;
			}
			
			int actualSum=0;
			actualSum=(n*(n+1))/2;
			System.out.println(actualSum-sumOfArray);		}
	}

}
