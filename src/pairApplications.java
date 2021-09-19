import java.util.*;
public class pairApplications {

	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(1,2));
		List<Integer> l2 = new ArrayList<Integer>(Arrays.asList(2,4));
		List<Integer> l3 = new ArrayList<Integer>(Arrays.asList(3,5));
		List<Integer> l4 = new ArrayList<Integer>(Arrays.asList(4,7));
		List<Integer> l5 = new ArrayList<Integer>(Arrays.asList(5,10));
		List<List<Integer>> foregroundApplications = new ArrayList<>(Arrays.asList(l1,l2,l3,l4,l5));
		List<Integer> l6 = new ArrayList<Integer>(Arrays.asList(2,5));
		List<Integer> l7 = new ArrayList<Integer>(Arrays.asList(1,3));
		List<List<Integer>> backgroundApplications = new ArrayList<>(Arrays.asList(l6,l7));
		
		List<List<Integer>> result = findApplicationMapping(10, foregroundApplications, backgroundApplications);
		for(List<Integer> ls : result)
		{
			for(Integer l : ls)
				System.out.print(l+" ");
			System.out.println();
		}
	}
	public static List<List<Integer>> findApplicationMapping(int deviceCapacity, List<List<Integer>> foregroundApplications, List<List<Integer>> backgroundApplications){
		List<List<Integer>> result = new ArrayList<>();
		
		return result;
	}
}
