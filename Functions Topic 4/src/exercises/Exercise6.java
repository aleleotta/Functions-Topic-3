package exercises;
import java.util.*;

public class Exercise6 {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce a number: ");
		n = sc.nextInt();
		System.out.println("Prime number?");
		System.out.println(esPrimo(n));
		sc.close();
	}
	
	private static boolean esPrimo(int n) {
		boolean primo = true;
		for(int i = 2; i < n; i++) {
			if (n % i == 0) {
				primo = false;
				break;
			}
		}
		return primo;
	}
}