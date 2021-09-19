import java.util.*;
public class Trial{
	public static int iter=0;
	public static void main(String[] args) {
		int[][] maze = {
				{1, 8, 21, 7},
				{19, 17, 10, 20},
				{2, 18, 23, 22},
				{14, 25, 4, 13}
		};
		int result = findMinimumWeight(maze, 4, 0, 0, maze[0][0]);
		System.out.println(result);
	}
	public static int findMinimumWeight(int[][] arr, int size, int i, int j, int min)
	{
//		System.out.println(i+" "+j);
		if(min < arr[i][j])
			min = arr[i][j];
		if(i==size-1 && j==size-1)
			return min;
		int x[] = {1, 0};
		int y[] = {0, 1};
		int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
		if(isSafe(arr, size, i+x[0], j+y[0]))
			min1 = findMinimumWeight(arr, size, i+x[0], j+y[0], min);
		if(isSafe(arr, size, i+x[1], j+y[1]))
			min2 = findMinimumWeight(arr, size, i+x[1], j+y[1], min);
		return Math.min(min1,  min2);
	}
	public static boolean isSafe(int[][] arr, int size, int i, int j)
	{
		return i<size && j<size;
	}
}
