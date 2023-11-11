package condicionales;

import java.util.Scanner;

/*
 * Utiliza un operador ternario para calcular el valor absoluto
 * de un número que se solicita al usuario por teclado
 */

/*
 * Ejemplos de Entrada y Salida:
 * 
 * Introduce un numero: > 74
 * 74
 * 
 * Introduce un numero: > -123
 * 123
 */

public class Ejercicio05 {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		
		// Pedir numero al usuario
		System.out.printf("Introduce un numero: ");
		num = sc.nextInt();

		// Imprimir su valor absoluto
		System.out.printf("abs(%d) = %d", num, num < 0 ? num * -1 : num);

		sc.close();
	}
}
