import java.util.*;
public class SavePrisoner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int c = sc.nextInt();
		int s = sc.nextInt();
		System.out.println((c+s-1)%p);
	}

}
