import java.util.*;

public class MaxMarks {
	public static class Pair {
		int first, second;
		Pair(int i, int j)
		{
			first = i;
			second = j;
		}
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Questions: ");
		int q = sc.nextInt();
		System.out.println("Enter time: ");
		int t = sc.nextInt();
		ArrayList<Pair> arr = new ArrayList<>();
		for(int i=0;i<q;i++)
		{
			int a = sc.nextInt(), b = sc.nextInt();
			Pair p = new Pair(a,b);
			arr.add(p);
		}
		long startTime = System.nanoTime();
		int f = findMaxMarks(arr, q, t, 0, 0);
		System.out.println(f);
		long elapsedTime = System.nanoTime() - startTime;
//		System.out.println((double)elapsedTime/1000000);
	}
	
	public static int findMaxMarks(ArrayList<Pair> arr, int q, int t, int max, int i) {
		System.out.println(i+" "+max);
		if(i>=q)
			return max;
		if( t < arr.get(i).second)
			return max;
		return Math.max(findMaxMarks(arr, q, t-arr.get(i).second, max+arr.get(i).first, i++), 
				findMaxMarks(arr, q, t, max, i++));
	}
	
}
