package condicionales;

import java.util.Scanner;

/*
 * Escribe una aplicación que solicite al usuario un número comprendido entre 0 y 9999.
 * La aplicación tendrá que indicar si el número introducido es capicúa.
 * Un número es capicúa si se lee igual de izquierda aderecha que de derecha a izquierda.
 */

/*
 * Ejemplos de Entrada y Salida:
 * 
 * Introduce un numero entre 0 y 9999: > 5
 * 5 es capicua
 * 
 * Introduce un numero entre 0 y 9999: > 10
 * 10 no es capicua
 * 
 * Introduce un numero entre 0 y 9999: > 11
 * 11 es capicua
 * 
 * Introduce un numero entre 0 y 9999: > 500
 * 500 no es capicua
 * 
 * Introduce un numero entre 0 y 9999: > 525
 * 525 es capicua
 * 
 * Introduce un numero entre 0 y 9999: > 5234
 * 5234 no es capicua
 * 
 * Introduce un numero entre 0 y 9999: > 5665
 * 5665 es capicua
 */

public class Ejercicio01 {
	public static void main(String[] args) {
		// Numero y cifras
		int num;
		int c1, c2, c3, c4;
		Scanner sc = new Scanner(System.in);

		// Preguntar un numero al usuario
		System.out.printf("Introduce un numero entre 0 y 9999: ");
		num = sc.nextInt();

		// Mirar que el numero sea valido
		while (num < 0 || num > 9999) {
			System.out.printf("Numero inválido.\n");
			System.out.printf("Introduce un numero entre 0 y 9999: ");
			num = sc.nextInt();
		}

		// Separar el numero en cifras
		c1 = num / 1000;
		c2 = num / 100 % 10;
		c3 = num / 10 % 10;
		c4 = num % 10;

		if (num < 10)
			System.out.printf("%d es capicua.", num);
		else if (num < 100)
			System.out.printf("%d %ses capicua.", num, c3 == c4 ? "" : "no ");
		else if (num < 1000)
			System.out.printf("%d %ses capicua.", num, c2 == c4 ? "" : "no ");
		else
			System.out.printf("%d %ses capicua.", num, (c1 == c4 && c2 == c3) ? "" : "no ");

		// System.out.printf("\nc1: %d, c2: %d, c3: %d, c4: %d", c1, c2, c3, c4);

		sc.close();
	}
}
