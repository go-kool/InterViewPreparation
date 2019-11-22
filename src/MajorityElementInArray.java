import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MajorityElementInArray {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numberOfTestCases = s.nextInt();
		for (int i = 0; i < numberOfTestCases; i++) {
			int sizeoOfArray = s.nextInt();
			ArrayList<Integer> arrayList = new ArrayList<Integer>();
			for (int j = 0; j < sizeoOfArray; j++) {
				arrayList.add(s.nextInt());
			}
			System.out.println(countFrequency(arrayList, sizeoOfArray));
			arrayList.clear();
		}
	}

	public static int countFrequency(ArrayList<Integer> list, int sizeOfArray) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		Integer j = 0;
		for (Integer object : list) {
			j = map.get(object);
			map.put(object, (j == null) ? 1 : j + 1);
		}

		// return the element if its count is more than n/2

		for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
			if (pair.getValue() > list.size() / 2)
				return pair.getKey();
		}
		return -1;

	}

}
