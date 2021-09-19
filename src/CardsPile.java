import java.util.*;

import javax.print.attribute.HashAttributeSet;
public class CardsPile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rounds = sc.nextInt();
		int[] piles = new int[rounds];
		for(int i=0;i<rounds;i++)
			piles[i] = sc.nextInt();
		int number = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i=0;i<100;i++)
			arr.add(i+1);
		for(int i=0;i<rounds;i++)
		{
			arr = convert(arr, piles[i]); 
//			printList(arr);
		}
		System.out.println(arr.get(number-1));
	}
	public static ArrayList<Integer> convert(ArrayList<Integer> arr, int pile)
	{
		ArrayList<ArrayList<Integer>> newarr = new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<pile;i++)
			newarr.add(new ArrayList<Integer>());
		for(int i=0,j=0;i<100;i++)
		{
			newarr.get(j).add(arr.get(i));
			j = (j+1)%pile;
		}
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int i=0;i<pile;i++)
		{
			int j=0;
			while(j<(100/pile))
			{
				result.add(newarr.get(i).get(j));
				j++;
			}
		}
		return result;
	}
	public static void printList(ArrayList<Integer> arr)
	{
		System.out.println();
		for(int i=0;i<arr.size();i++)
			System.out.print(arr.get(i)+" ");
		System.out.println();
	}
}
