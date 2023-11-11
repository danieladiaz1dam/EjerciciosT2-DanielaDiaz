package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

/* 
 * Realiza un programa que pida un número entero N entre 0 y 20 y luego muestre por pantalla
 * los números desde 1 hasta N, uno en cada línea, repitiendo cada número tantas veces como su valor.
 */

/*
 * Ejemplos de Entrada y Salida:
 * 
 * Introduce un numero entre 0 y 20: > 0
 * 
 * Introduce un numero entre 0 y 20: >  sdf
 * Input inválida.
 * Introduce un numero entre 0 y 20: > 
 * 
 * Introduce un numero entre 0 y 20: > 5
 * 1
 * 22
 * 333
 * 4444
 * 55555
 * 
 */

public class Ejercicio06 {
	public static void main(String[] args) {
		int n = -1;
		Scanner sc = new Scanner(System.in);

		// Pedir n
		do {
			try {
				System.out.printf("Introduce un numero entre 0 y 20: ");
				n = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.printf("Input inválida.\n");
				sc.nextLine();
			}
		} while (n < 0 || n > 20);
		
		// Para cada numerode 1 a n
		for (int i = 1; i <= n; i++) {
			// Imprimir n, n veces
			for (int j = 1; j <= i; j++) {
				System.out.printf("%d",i);
			}
			// Salto de linea
			System.out.println();
		}
		
		sc.close();
	}
}
