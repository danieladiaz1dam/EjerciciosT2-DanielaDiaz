package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Realiza un programa que lea y acepte únicamente aquellos que sean mayores que el último dado.
 * La introducción de números finaliza con la introducción de un 0. Al final se mostrará:
 * El total de números introducidos, excluido el 0.
 * El total de números fallados.
 */

/*
 * Ejemplos de Entrada y Salida:
 * 
 * Introduce el primer numero: > 0
 * Introduce el primer numero: > abc
 * Input inválida.
 * Introduce el primer numero: > 1
 * Introduce un numero: > 2
 * Introduce un numero: > 3
 * Introduce un numero: > 1
 * No puedes introducir un numero menor.
 * Introduce un numero: > abc
 * Input inválida.
 * Introduce un numero: > 4
 * Introduce un numero: > 0
 * 
 * Total de numeros introducidos: 5
 * Numero de fallos: 1
 * 
 */

public class Ejercicio08 {
	public static void main(String[] args) {
		int currentMax = 0, input = -1, contadorFallos = 0, contadorNumeros = 0;
		Scanner sc = new Scanner(System.in);

		// Inicialiazar la variable currentMax con el primer numero, esta no puede ser 0
		do {
			try {
				System.out.printf("Introduce el primer numero: ");
				currentMax = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.printf("Input inválida.\n");
				sc.nextLine();
			}
		} while (currentMax == 0);

		// Pedir numero y sumar a los contadores
		do {
			try {
				System.out.printf("Introduce un numero: ");
				input = sc.nextInt();

				// si el numero introducido es más pequeño
				if (input < currentMax && input != 0) {
					// contamos un fallo
					System.out.printf("No puedes introducir un numero menor.\n");
					contadorFallos++;
					// si no, actualizamos el currentMax
				} else
					currentMax = input;

				// contamos los numeros
				contadorNumeros++;
			} catch (InputMismatchException e) {
				System.out.printf("Input inválida.\n");
				sc.nextLine();
			}

		} while (input != 0);

		// Imprimir todo
		System.out.printf("\nTotal de numeros introducidos: %d\n", contadorNumeros);
		System.out.printf("Numero de fallos: %d\n", contadorFallos);

		sc.close();
	}
}
