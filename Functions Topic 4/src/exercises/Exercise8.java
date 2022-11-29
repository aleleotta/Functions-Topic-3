package exercises;
import java.util.*;

public class Exercise8 {
	public static void main(String[] args) {
		double a, b, option;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce the first number: ");
		a = sc.nextDouble();
		System.out.println("Introduce the second number: ");
		b = sc.nextDouble();
		System.out.println("Operators:\n'+' = 1\n'-' = 2\n'*' = 3\n'/' = 4 ");
		System.out.print("Choose an operator: ");
		option = sc.nextDouble();
		double result = calculator(option, a, b);
		System.out.println("Result: " + result);
		sc.close();
	}
	
	static double calculator(double option, double a, double b){
		double result = 0;
		if(option == 1) {
			result = a + b;
		} else if(option == 2) {
			result = a - b;
		} else if(option == 3) {
			result = a * b;
		} else if(option == 4) {
			result = a / b;
		} else {
			System.out.println("Invalid operator!");
		}
		return result;
	}
}
/*Diseñar la función calculadora(),
 *a la que se le pasan dos números reales (operandos) y
 *qué operación se desea realizar con ellos. Las operaciones disponibles 
 *son sumar, restar, multiplicar o dividir.
 *Estas se especifican mediante un número: 1 para la suma,
 *2 para la resta, 3 para la multiplicación y 4 para la división.
 *La función devolverá el resultado de la operación mediante un número real.
*/