package condicionales;

import java.util.Scanner;

/*
 * Dada una hora por teclado, (horas, minutos y segundos)
 * realiza un algoritmo que muestre la hora después de incrementarle un segundo. 
 */

/*
 * Ejemplos de Entrada y Salida:
 * 
 * Introduce un tiempo [hh:mm:ss]: > 00:59:59
 * 00h 59m 59s + 1s = 01h 00m 00s
 */

public class Ejercicio07 {
	public static void main(String[] args) {
		int horas, minutos, segundos;
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
		
		horas = Integer.parseInt(parts[0]);
		minutos = Integer.parseInt(parts[1]);
		segundos = Integer.parseInt(parts[2]);
		
		// Mirar si los numeros son correctos
		if (minutos >= 60 || segundos >= 60) {
			System.out.printf("Input invalida.\nExit.");
			sc.close();
			return;
		}
		
		// Empezar a imprimir respuesta
		System.out.printf("%02dh %02dm %02ds + 1s = ", horas, minutos, segundos);
		
		
		// Sumar un segundo a la hora del usuario
		segundos +=1;
		
		if (segundos >= 60) {
			segundos -= 60;
			minutos ++;
		}
		
		if (minutos >= 60) {
			minutos -= 60;
			horas ++;
		}
		
		// Imprimir respuesta
		System.out.printf("%02dh %02dm %02ds", horas, minutos, segundos);
		
		sc.close();
	}
}
