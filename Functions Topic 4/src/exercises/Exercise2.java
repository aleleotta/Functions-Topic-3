package exercises;
import java.util.*;

public class Exercise2 {
	public static void main(String[] args) {
		int x, y;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce the first number: ");
		x = sc.nextInt();
		System.out.print("Introduce the second number: ");
		y = sc.nextInt();
		System.out.print("Numbers between " + x + " and " + y + ": ");
		whole_numbers(x, y);
		sc.close();
	}
	
	private static void whole_numbers(int x, int y) {
		for(int i = x + 1; i < y ; i++) {
			System.out.print(i + " ");
		}
	}
}