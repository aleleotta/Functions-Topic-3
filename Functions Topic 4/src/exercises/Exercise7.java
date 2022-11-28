package exercises;
import java.util.*;

public class Exercise7 {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println();
		n = sc.nextInt();
		System.out.println(prime(n));
		sc.close();
	}
	
	private static boolean prime(int n) {
		boolean prime = true;
		int div = 0;
		for(int i = 2; i < n; i++) {
			if (n % i == 0) {
				prime = false;
				break;
			}
		}
		return prime;
	}
}
/*Escribe una función a la que se le pase como parámetro
 *un número entero y devuelva el número de divisores primos que tiene.
 *Utiliza para ello la función que definiste en
 *el ejercicio anterior, esPrimo().*/