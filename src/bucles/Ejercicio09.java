package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado. 
 * El número introducido debe ser mayor que 0.
 */

/*
 * Ejemplos de Entrada y Salida:
 * 
 * Introduce un numero mayor que 0: > abc
 * Input inválida.
 * Introduce un numero mayor que 0: > -4
 * Introduce un numero mayor que 0: > 12345
 * El numero tiene 5 cifras.
 */

public class Ejercicio09 {
	public static void main(String[] args) {
		int num = 0, contador = 0;
		Scanner sc = new Scanner(System.in);

		// Pedir un numero
		do {
			try {
				System.out.printf("Introduce un numero mayor que 0: ");
				num = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.printf("Input inválida.\n");
				sc.nextLine();
			}
		} while (num <= 0);

		while (num > 0) {
			num /= 10;
			contador++;
		}

		System.out.printf("El numero tiene %d cifras.\n", contador);
		sc.close();
	}
}
