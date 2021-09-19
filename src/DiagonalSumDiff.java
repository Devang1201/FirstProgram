import java.util.*;
public class DiagonalSumDiff {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[][] arr = new int[size][size];
		for(int i=0;i<size;i++)
			for(int j=0;j<size;j++)
				arr[i][j] = sc.nextInt();
		int leftdiagonalsum = 0, rightdiagonalsum=0;
		for(int i=0;i<size;i++)
			leftdiagonalsum += arr[i][i];
		int i=size-1;
		while(i>=0)
		{
			rightdiagonalsum += arr[size-i-1][i];
			i--;
		}
		int result = Math.abs(leftdiagonalsum - rightdiagonalsum);
		System.out.println(result);
	}
}
