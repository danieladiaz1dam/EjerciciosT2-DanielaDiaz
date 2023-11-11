package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * De forma similar a la actividad 4, realiza un programa que calcule el mínimo
 * común múltiplo de dos números dados. En este caso, habrá que partir del máximo
 * de los dos e ir incrementando hasta encontrar el primer número que sea múltiplo
 * de los dos números.
 */

/*
 * Ejemplos de Entrada y Salida:
 * 
 * Introduce dos numeros: > 1 0
 * Input inválida.
 * Exit.
 * 
 * Introduce dos numeros: > 5162 3546
 * mcm: 9152226
 */

public class Ejercicio05 {
	public static void main(String[] args) {
		int a = 0, b = 0, tmp, res = -1, i;
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

		if (debug)
			startTime = System.nanoTime();

		// Asegurar que a < b
		if (a > b) {
			tmp = b;
			b = a;
			a = tmp;
		}

		// Mirar si B es multiplo de A
		res = b % a;
		if (res == 0) {
			// finalizar programa
			System.out.printf("mcd: %d\n", a);
			sc.close();
			return;
		}

		// Mirar si A divide a algun multiplo de B
		i = 1;
		while (res != 0) {
			res = (b * i) % a;
			i++;
		}

		// imprimir el mcm
		System.out.printf("mcm: %d\n", --i * b);

		// Imprimir cuanto ha tardado
		if (debug) {
			endTime = System.nanoTime();
			System.out.println("Took " + (double) (endTime - startTime) / (1000 * 1000 * 1000) + "s");
		}

		sc.close();
	}
}
