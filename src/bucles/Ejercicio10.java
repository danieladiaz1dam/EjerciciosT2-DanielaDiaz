package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Realiza un programa que nos diga si un número introducido por teclado es capicúa o no.
 * El número debe ser mayor o igual que 0.
 */

/*
 * Ejemplos de Entrada y Salida:
 * 
 * Introduce un numero: > -6
 * Introduce un numero: > abc
 * Input inválida.
 * Introduce un numero: > 6
 * 6 es capicúa.
 * Introduce un numero: > 1234
 * 1234 no es capicúa.
 * Introduce un numero: > 1221
 * 1221 es capicúa.
 * 
 */

public class Ejercicio10 {
	public static void main(String[] args) {
		int num = -1, bk, numReversed = 0;
		Scanner sc = new Scanner(System.in);

		// Pedir un numero
		do {
			try {
				System.out.printf("Introduce un numero: > ");
				num = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.printf("Input inválida.\n");
				sc.nextLine();
			}
		} while (num < 0);

		bk = num;

		// Hacer el numero pero invertido
		while (num > 0) {
			numReversed = numReversed * 10 + num % 10;
			num /= 10;
		}

		if (bk == numReversed)
			System.out.printf("%d es capicúa.\n", bk);
		else
			System.out.printf("%d no es capicúa.\n", bk);

		sc.close();
	}
}
