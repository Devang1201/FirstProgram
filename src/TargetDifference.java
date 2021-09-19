import java.util.*;
public class TargetDifference {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int target = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i] = sc.nextInt();
		}
		int count = 0;
		for(int i=0;i<size;i++)
			for(int j=0;j<size;j++)
			{
				if(arr[i]-arr[j]==target)
					count++;
			}
		System.out.println(count);
	}

}
