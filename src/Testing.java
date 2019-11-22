import java.util.ArrayList;
import java.util.Scanner;

public class Testing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of arryList master");
		int masterArrayCount = sc.nextInt();
		ArrayList<ArrayList<Integer>> master = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < masterArrayCount; i++) {
			ArrayList<Integer> branch = new ArrayList<Integer>();
			System.out.println("Enter length of branch ");
			int branchCount = sc.nextInt();
			for (int j = 0; j < branchCount; j++) {
				System.out.println("Enter branch elements");
				int branchElements = sc.nextInt();
				branch.add(branchElements);
			}
			master.add(branch);
		}
		System.out.println("enter output length");
		int q = sc.nextInt();
		for (int i = 0; i < q; i++) {
			System.out.println("enter x and y ");
			int x = sc.nextInt();
			int y = sc.nextInt();
			try {
				System.out.println(master.get(x - 1).get(y - 1));
			} catch (Exception e) {
				System.out.println("ERROR!");
			}
		}
	}
}
