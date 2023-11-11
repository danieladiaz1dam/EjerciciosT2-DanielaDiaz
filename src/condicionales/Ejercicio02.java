package condicionales;

import java.util.Scanner;

/*
 * Diseña una aplicación en la que, dado un número de DNI, calcule la letra que le corresponde.
 */

/*
 * Ejemplos de Entrada y Salida:
 * 
 * Introduce tu numero de DNI: > 5
 * DNI inválido.
 * 
 * Introduce tu numero de DNI: > 123456789
 * DNI inválido.
 * 
 * Introduce tu numero de DNI: > 12345678
 * Tu DNI completo es 12345678Z
 */

public class Ejercicio02 {
	public static void main(String[] args) {
		final String LETRAS_DISPONIBLES = "TRWAGMYFPDXBNJZSQVHLCKE";
		int dni;
		Scanner sc = new Scanner(System.in);

		// Preguntar numero al usuario
		System.out.printf("Introduce tu numero de DNI: ");
		dni = sc.nextInt();

		// Asegurar que el numero es válido
		while (dni < 10000000 || dni > 99999999) {
			System.out.printf("DNI inválido.\n");
			System.out.printf("Introduce tu numero de DNI: ");
			dni = sc.nextInt();
		}

		// Imprimir DNI
		System.out.printf("Tu DNI completo es %d%s", dni, LETRAS_DISPONIBLES.charAt(dni % 23));

		sc.close();
	}
}
