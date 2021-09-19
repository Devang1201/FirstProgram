
public class SampleCode {

	public static void main(String[] args) {
		int[] arr = new int[5];
		for(int i=0;i<5;i++)
			arr[i] = i;
		arr = convert(arr);
		for(int i=0;i<5;i++)
			System.out.println(arr[i]);
	}
	public static int[] convert(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
			arr[i]++;
		return arr;
	}

}
