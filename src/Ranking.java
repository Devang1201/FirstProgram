import java.util.*;
public class Ranking {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int rank=1;
		int prev=0;
		int leaderboard[][] = new int[r][2];
		for(int i=0;i<r;i++)
		{
			if(i!=0)
				prev = leaderboard[i-1][0];
			leaderboard[i][0] = sc.nextInt();
			if(i!=0)
			{
				if(prev==leaderboard[i][0])
					leaderboard[i][1] =  rank;
				else
				{
					rank++;
					leaderboard[i][1] = rank;
				}
			}	
			else
			{
				leaderboard[i][1] = rank;
			}
		}
		int t = sc.nextInt();
		int score[][] = new int[t][2];
		for(int i=0;i<t;i++)
		{
			score[i][0] = sc.nextInt();
			score[i][1] = 0;
		}
		for(int i=0;i<t;i++)
		{
			for(int j=0;j<r;j++)
			{
				if(score[i][0]>leaderboard[0][0])
				{
					score[i][1] = 1;
					break;
				}
				if(score[i][0]==leaderboard[j][0])
				{
					score[i][1] = leaderboard[j][1];
					break;
				}
				else if(score[i][0]>leaderboard[j][0])
				{
					score[i][1] = leaderboard[j][1];
					break;
				}
			}
			if(score[i][1]==0)
				score[i][1] = leaderboard[r-1][1]+1;
		}
		for(int i=0;i<t;i++)
			System.out.println(score[i][0]+" "+score[i][1]);
	}

}
