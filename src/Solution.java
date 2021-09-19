import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Float> arr = new ArrayList<>();
		PriorityQueue<Float> maxheap = new PriorityQueue<>();
		System.out.println("Enter Input:");
		while (sc.hasNextFloat()) {
			float input = sc.nextFloat();
			arr.add(input);
			if (input < 4.5) {
				maxheap.add(input);
				while (maxheap.size() > 3) {
					System.out.println("Removing: "+maxheap.poll());
				}
			}
		}
//		for (Float i : arr)
//			System.out.print(i + " ");
		System.out.println();
		System.out.println("Answer:");
		while(!maxheap.isEmpty())
			System.out.println(maxheap.poll());
	}
}
