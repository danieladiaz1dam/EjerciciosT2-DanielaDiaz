package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

// nano time
// https://docs.oracle.com/javase/6/docs/api/java/lang/System.html#nanoTime%28%29

/*
 * Para dos números dados, a y b, es posible calcular el máximo común divisor
 * (el número más grande que divide a ambos) mediante un algoritmo ineficiente pero sencillo:
 * desde el menor de a y b, ir buscando, de forma decreciente (-1), el primer número que
 * divide a ambos simultáneamente.
 * Teniendo en cuenta lo que se acaba de explicar, realiza un programa que calcule el
 * máximo común divisor de dos números.
 */

/*
 * Ejemplos de Entrada y Salida:
 * 
 * Introduce dos numeros: > 1 0
 * Input inválida.
 * Exit.
 * 
 * Introduce dos numeros: > 15 20
 * mcm: 5
 * 
 */

public class Ejercicio04 {
	public static void main(String[] args) {
		int a = 0, b = 0, tmp;
		Scanner sc = new Scanner(System.in);
		long startTime = 0, endTime = 0;
		boolean debug = false;

		do {
			try {
				// Pedir numeros
				System.out.printf("Introduce dos numeros: ");
				a = sc.nextInt();
				b = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.printf("Input inválida.\n");
				sc.nextLine();
			}
		} while (a < 1 || b < 1);

		// Para ver lo que tarda en ejecutarse
		if (debug)
			startTime = System.nanoTime();

		// Asegurar que a < b
		if (a > b) {
			tmp = b;
			b = a;
			a = tmp;
		}

		// Mirar un numero que divida a los dos de forma excata
		// a / 2, al tener menos numeros, tarda menos
		// en c++ aprendi que moviendo los bits para la izquierda multiplica por 2
		// y mover los bits a la derecha divide entre 2, también aprendi que dividir
		// es muy complicado para la CPU, asi que a >> 1 siempre sera mas rapido que a /
		// 2
		// ( en c++ es a >> 1, supongo que aqui también )
		// ( la dani del futuro lo ha comprobado y si es asi )
		for (int i = (a >> 1); i > 0; i--) {
			if (a % i == 0 && b % i == 0) {
				System.out.printf("mcm: %d\n", i);
				break;
			}
		}

		// Imprimir lo que tarda en ejecutarse ( de nano segundo a segundo es dividir entre 10^9)
		if (debug) {
			endTime = System.nanoTime();
			System.out.println("Took " + (double) (endTime - startTime) / (1000 * 1000 * 1000) + "s");
		}

		sc.close();
	}
}
