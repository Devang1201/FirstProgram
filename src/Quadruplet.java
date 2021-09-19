import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Quadruplet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Float> arr = new ArrayList<>();
		System.out.println("Enter Input:");
		while (sc.hasNextFloat()) {
			float input = sc.nextFloat();
			arr.add(input);
		}
		float product=1;
		int i=0,j=1,k=2,l=3;
		if(arr.size()<4)
			System.out.println("Invalid Input");
		else
		{
			for(;i<arr.size()-3;i++)
				for(j=i+1;j<arr.size()-2;j++)
					for(k=j+1;k<arr.size()-1;k++)
						for(l=k+1;l<arr.size();l++)
						{
							float newProd = arr.get(i) * arr.get(j) * arr.get(k) * arr.get(l);
							if(newProd > product)
							{
//								System.out.println(i+" "+j+" "+k+" "+l+" "+newProd);
								product = newProd;
							}
						}
		}
		System.out.println("Product: "+product);
	}

}
