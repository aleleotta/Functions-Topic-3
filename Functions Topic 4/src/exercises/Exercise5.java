package exercises;
import java.util.*;

public class Exercise5 {
	public static void main(String[] args) {
		char letter;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce a character: ");
		letter = sc.next().charAt(0);
		System.out.println(isVocal(letter));
		sc.close();
	}
	
	private static boolean isVocal(char letter) {
		boolean vocal = false;
		switch(letter) {
			case 'A','a':
				vocal = true;
				break;
			case 'E','e':
				vocal = true;
				break;
			case 'I','i':
				vocal = true;
				break;
			case 'O','o':
				vocal = true;
				break;
			case 'U','u':
				vocal = true;
				break;
			default:
				vocal = false;
				break;
		}
		return vocal;
	}
}