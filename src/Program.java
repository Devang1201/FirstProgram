import java.util.*;

public class Program {
  public static List<Integer> riverSizes(int[][] matrix) {
		ArrayList<Integer> result = new ArrayList<>();
		int m = matrix.length;
		int n = matrix[0].length;
		boolean visited[][] = new boolean[m][n];
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				visited[i][j] = false;
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				if(!visited[i][j] && matrix[i][j]==1)
				{
					System.out.println("Before call "+i+" "+j+" "+matrix[i][j]);
					int count = depthFirstSearch(i, j, matrix, visited, m, n, 0);
					result.add(count);
				}
		return result;
	}
	public static boolean isSafe(int x, int y, int[][] matrix, boolean[][] visited, int m, int n)
	{
		return x>=0 && x<m && y>=0 && y<n && !visited[x][y] && matrix[x][y]==1;
	}
	public static int depthFirstSearch(int x, int y, int[][] matrix, boolean[][] visited, int m, int n, int count)
	{
		if(count==0)
			System.out.println("First call "+x+" "+y+" "+matrix[x][y]);
		else
			System.out.println("Recursive call "+x+" "+y+" "+matrix[x][y]);
		visited[x][y] = true;
		count++;
		
		int dx[] = {-1, 0, 1, 0};
		int dy[] = {0, -1, 0, 1};
		
		for(int i=0;i<4;i++)
		{
			if(isSafe(x+dx[i], y+dy[i], matrix, visited, m, n))
			{
				int newCount=0;
				System.out.println("Count before call "+count);
				newCount = depthFirstSearch(x+dx[i], y+dy[i], matrix, visited, m, n, count);
				System.out.println("New count "+newCount);
				count = newCount;
				System.out.println("Count after call "+count);
			}
			else
				System.out.println("Not safe "+(x+dx[i])+" "+(y+dy[i]));
		}
		return count;
	}
	public static void main(String args[])
	{
		int matrix[][] = {
		                   {1, 0, 0, 1, 0},
		                   {1, 0, 1, 0, 0},
		                   {0, 0, 1, 0, 1},
		                   {1, 0, 1, 0, 1},
		                   {1, 0, 1, 1, 0}
		                 };
		List<Integer> result = Program.riverSizes(matrix);
		for(int i:result)
			System.out.println(i);
	}
}
