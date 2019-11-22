import java.util.Scanner;
import java.util.Stack;

public class LeadersInAnArray {

	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int totalNumberOfTestCases = sc.nextInt();
		for (int k = 0; k < totalNumberOfTestCases; k++) {
		int numberOfElements=sc.nextInt();
		int[] array = new int[numberOfElements];
		for (int i = 0; i < array.length; i++) {
			array[i]=sc.nextInt();
		}
		int max = Integer.MIN_VALUE;
		Stack<Integer> stack = new Stack<>();
		for (int i = array.length-1; i >= 0; i-- ) {
				if(array[i]>=max)
				{
					stack.push(array[i]);
					max=array[i];
				}
		}
		StringBuffer sb = new StringBuffer();
        while(!stack.isEmpty())
            sb.append(stack.pop()+" ");
            
        System.out.println(sb);  
	}
		sc.close();
	}
}
