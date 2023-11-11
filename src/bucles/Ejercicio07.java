package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Escribe un programa que lea un número n e imprima una pirámide de
 * números con n filas como en la siguiente figura:
 * 1
 * 121
 * 12321
 * 1234321
 * 
 * mi piramide es mas pretty.
 */

/*
 * Ejemplos de Entrada y Salida:
 * 
 * Introduce un numero: > 0
 * 
 * 
 * Introduce un numero: > df
 * Input inválida.
 * Introduce un numero: > 
 * 
 * Introduce un numero: > 5
 *     1
 *    121
 *   12321
 *  1234321
 * 123454321
 * 
 */

public class Ejercicio07 {
	public static void main(String[] args) {
		int n = -1;
		Scanner sc = new Scanner(System.in);

		// Pedir un numero
		do {
			try {
				System.out.printf("Introduce un numero: ");
				n = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.printf("Input inválida.\n");
				sc.nextLine();
			}
		} while (n < 0 || n > 20);
		
		// Para cada numero
		for (int i = 1; i <= n; i++) {
			// Imprimir espacios
			for (int j = 1; j <= n-i; j++) {
				System.out.printf(" ");
			}
			// Imprimir de 1 a ese numero
			for (int j = 1; j <= i; j++) {
				System.out.printf("%d",j);
			}
			//Imprimir de ese numero-1 a 1
			for (int j = i-1; j>=1; j--) {
				System.out.printf("%d",j);
			}
			
			// Salto de linea
			System.out.println();
		}
		
		sc.close();
	}
}
