package bucles;

import java.util.Scanner;

/*
 * Escribe un programa que incremente la hora de un reloj. Se pedirán por teclado:
 * Hora
 * Minutos
 * Segundos
 * Cantidad de segundos a incrementar
 * La aplicación debe mostrar la nueva hora.
 * Por ejemplo, si el usuario introduce hora=13, minutos=59 y segundos=51, y
 * se desea incrementar en 10 segundos, el resultado a mostrar es 14:00:01.
 * 
 */

/*
 * Ejemplos de Entrada y Salida:
 * 
 * Introduce una hora concreta [hh:mm:ss]: > ::
 * Input invalida.
 * Exit.
 * 
 * Introduce una hora concreta [hh:mm:ss]: > 2:60:65
 * Input invalida.
 * Exit.
 * 
 * Introduce una hora concreta [hh:mm:ss]: > 1:00:00
 * Cuantos segundos quieres adelantarlo?: > 3600
 * 1h 0m 0s + 3600s = 2h 0m 0s
 *
 */

public class Ejercicio01 {
	public static void main(String[] args) {
		int horas, minutos, segundos, suma;
		String input;
		String[] parts;
		Scanner sc = new Scanner(System.in);

		// Pedir hora al usuario
		System.out.printf("Introduce una hora concreta [hh:mm:ss]: ");
		input = sc.next();

		// Si el input es valido, separarlo en numeros
		parts = input.split(":");

		if (parts.length != 3) {
			System.out.printf("Input invalida.\nExit.");
			sc.close();
			return;
		}
		
		// Separar input en variables
		horas = Integer.parseInt(parts[0]);
		minutos = Integer.parseInt(parts[1]);
		segundos = Integer.parseInt(parts[2]);

		// Mirar si los numeros son correctos
		if (minutos >= 60 || segundos >= 60) {
			System.out.printf("Input invalida.\nExit.");
			sc.close();
			return;
		}

		// Pedir cuanto se quiere adelantar
		System.out.printf("Cuantos segundos quieres adelantarlo?: ");
		suma = sc.nextInt();
		
		System.out.printf("%dh %dm %ds + %ds = ", horas, minutos, segundos, suma);
		
		// Adelantar segundos
		segundos += suma;
		
		// Mirar si hay que adelantar minutos
		while (segundos >= 60) {
			segundos -= 60;
			minutos++;
		}
		
		// Mirar si hay que adelantar horas
		while (minutos >= 60) {
			minutos -= 60;
			horas++;
		}

		// Imprimir resultado
		System.out.printf("%dh %dm %ds\n", horas, minutos, segundos);

		sc.close();
	}
}
