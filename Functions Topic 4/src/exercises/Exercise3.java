package exercises;
import java.util.*;

public class Exercise3 {
	public static void main(String[] args) {
		int x, y;
		int option;
		Scanner sc = new Scanner(System.in);
		System.out.print("First number: ");
		x = sc.nextInt();
		System.out.print("Second number: ");
		y = sc.nextInt();
		System.out.println("Option 1: Cilinder area");
		System.out.println("Option 2: Cilinder volume");
		System.out.print("Select option: ");
		option = sc.nextInt();
		formulas(option, x, y);
		sc.close();
	}
	
	private static void formulas(int option, int x, int y) {
		switch (option) {
		case 1:
			int area = (int) (2 * Math.PI * x * (x + y));
			System.out.println("Area: " + area);
			break;
		case 2:
			int volume = (int) (Math.PI * (x * x) * y);
			System.out.println("Volume: " + volume);
			break;
		default:
			System.out.println("ERROR!");
		}
	}
}
