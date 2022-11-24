package exercises;
import java.util.*;

public class Exercise4 {
	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce the first number: ");
		a = sc.nextInt();
		System.out.print("Introduce the second number: ");
		b = sc.nextInt();
		if(a != b) {
			System.out.print("Maximum number: " + max(a, b));
		} else if(a == b){
			System.out.println("Both numbers are equal.");
		}
		sc.close();
	}
	
	private static int max(int a, int b) {
		int maximum = 0;
		if(a > b) {
			maximum = a;
		} else {
			maximum = b;
		}
		return(maximum);
	}
}