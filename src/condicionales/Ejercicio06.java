package condicionales;

import java.util.Scanner;

/*
 * Realiza el “juego de la suma”, que consiste en que aparezcan dos números aleatorios
 * (comprendidos entre 1 y 99) y el usuario tiene que sumarlos.
 * La aplicación le pedirá al usuario que introduzca el resultado de la suma.
 * La aplicación le indicará si el resultado es correcto o no.
 */

/*
 * Ejemplos de Entrada y Salida:
 * 
 * *** Juego de la suma ***
 * 13 + 43 = > 46
 * El valor correcto es 56
 *
 * *** Juego de la suma ***
 * 8 + 7 = > 15
 * Correcto!!
 */

public class Ejercicio06 {
	public static void main(String[] args) {
		int input, rand1, rand2;
		Scanner sc = new Scanner(System.in);
		
		// Calcular numeros
		rand1 = (int) (Math.random() * 99 + 1);
		rand2 = (int) (Math.random() * 99 + 1);

		// Ponerlo pretty
		System.out.printf("*** Juego de la suma ***\n");
		
		// Preguntar al usuario
		System.out.printf("%d + %d = ", rand1, rand2);
		input = sc.nextInt();

		// Mirar si ha hecho bien la cuenta
		if (input == rand1 + rand2)
			System.out.printf("Correcto!!");
		else
			System.out.printf("El valor correcto es %d", rand1 + rand2);

		sc.close();
	}
}
