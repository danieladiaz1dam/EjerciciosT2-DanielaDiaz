package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Solicita al usuario un número n y dibuja un triángulo de base y altura n. 
 * Por ejemplo para n=4 debe dibujar lo siguiente:
 *    *
 *   * *
 *  * * *
 * * * * *
 *
 */

/*
 * Ejemplos de Entrada y Salida:
 * 
 * Introduce el tamaño de la piramide: 0
 * Input inválida.
 * Exit.
 * 
 * Introduce el tamaño de la piramide: > 3
  *    * 
  *   * * 
  *  * * * 
  * 
  * 
  * Introduce el tamaño de la piramide: > 6
  *       * 
  *      * * 
  *     * * * 
  *    * * * * 
  *   * * * * * 
  *  * * * * * * 

 */

public class Ejercicio03 {
	public static void main(String[] args) {
		int size = 0;
		Scanner sc = new Scanner(System.in);

		do {
			try {
				// Pedir el tamaño
				System.out.printf("Introduce el tamaño de la piramide: ");
				size = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.printf("Input inválida.\n");
				sc.nextLine();
			}
		} while (size < 1);

		// Imprimir lineas de la piramide
		for (int i = 0; i < size; i++) {
			// Imprimir los espacios
			for (int j = 0; j <= size - i; j++) {
				System.out.printf(" ");
			}

			// Imprimir los asteriscos
			for (int j = 0; j <= i; j++) {
				System.out.printf("* ");
			}

			// Imprimir el salto de linea
			System.out.printf("\n");
		}

		sc.close();
	}
}
