package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Realiza un programa que nos pida un número n y nos diga cuántos números hay entre 1 y n que sean primos.
 */

/*
 * Ejemplos de Entrada y Salida:
 * 
 * Introduce un numero: > -4
 * Input inválida.
 * Exit.
 * 
 * Introduce un numero: > 0
 * Input inválida.
 * Exit.
 * 
 * Introduce un numero: > 1
 * Hay 0 numero primos entre 1 y 1.
 * 
 * 
 * Introduce un numero: > 20
 * Hay 8 numero primos entre 1 y 20.
 * 
 */

public class Ejercicio02 {
	public static void main(String[] args) {
		int n = 0, c = 0;
		boolean primo;
		Scanner sc = new Scanner(System.in);
		long startTime = 0, endTime = 0;
		boolean debug = false;

		do {
			try {
				// Preguntar hasta que numero mirar si tiene primos
				System.out.printf("Introduce un numero: ");
				n = sc.nextInt();

			} catch (InputMismatchException e) {
				System.out.printf("Input inválida\n");
				sc.nextLine();
			}
		} while (n < 1);

		// Para ver lo que tarda en ejecutarse
		if (debug)
			startTime = System.nanoTime();

		// Empiezo en 2 porque 1 no es primo
		for (int i = 2; i <= n; i++) {
			primo = true;
			// mirar si es primo
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					primo = false;
					break;
				}
			}
			// Si es primo aumentar el contador
			if (primo)
				c++;
		}
		
		// Imprimir el resultado
		System.out.printf("Hay %d numero primos entre 1 y %d.\n\n", c, n);

		// Imprimir lo que tarda en ejecutarse ( de nano segundo a segundo es / 10^9)
		if (debug) {
			endTime = System.nanoTime();
			System.out.println("Took " + (double) (endTime - startTime) / (1000 * 1000 * 1000) + "s");
		}

		sc.close();
	}
}
