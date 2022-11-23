package exercises;
import java.util.*;

public class Exercise1 {
	public static void main(String[] args) {
		int n = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce a number: ");
		n = sc.nextInt();
		eco(n);
		sc.close();
	}
	
	private static void eco(int n) {
		for(int i = 1; i <= n ; i++) {
			System.out.println("Eco");
		}
	}
}