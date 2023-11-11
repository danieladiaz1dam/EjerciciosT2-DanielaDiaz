package condicionales;

import java.util.Scanner;

/*
 * En una granja se compra diariamente una cantidad de comida para los animales. 
 * Los animales son todos de la misma especie y sabemos que cada animal come los
 * mismos kilos de comida de media diariamente.
 * 
 * Diseña un programa que solicite al usuario los valores anteriores
 * (cantidad de comida comprada, número de animales y kilos de comida que
 * comen todos los animales en total), y determine si disponemos de alimento
 * suficiente para cada animal. En caso negativo, debe calcular cuál es
 * la ración que corresponde a cada uno de los animales.
 * 
 * Nota: Evita que la aplicación realice divisiones por cero.

 */

/*
 * Ejemplos de Entrada y Salida:
 * 
 * Cuantos kilos de comida has comprado?: > 100
 * Cuantos animales tienes?: > 10
 * Cuantos kilos de comida se necesitan en total?: > 100
 * Tienes suficiente comida!!
 * 
 * Cuantos kilos de comida has comprado?: > 100
 * Cuantos animales tienes?: > 10
 * Cuantos kilos de comida se necesitan en total?: > 110
 * No tienes comida suficiente, cada animal comeria 10,00Kg
 */

public class Ejercicio03 {
	public static void main(String[] args) {
		int comidaComprada, numAnimales, comidaNecesaria;
		Scanner sc = new Scanner(System.in);

		// Pedir info al usuario
		System.out.printf("Cuantos kilos de comida has comprado?: ");
		comidaComprada = sc.nextInt();

		if (comidaComprada <= 0) {
			System.out.printf("Kilos de comida inválidos.\nExit.");
			sc.close();
			return;
		}

		System.out.printf("Cuantos animales tienes?: ");
		numAnimales = sc.nextInt();

		if (numAnimales <= 0) {
			System.out.printf("Cantidad de animales inválida.\nExit.");
			sc.close();
			return;
		}

		System.out.printf("Cuantos kilos de comida se necesitan en total?: ");
		comidaNecesaria = sc.nextInt();

		if (comidaNecesaria <= 0) {
			System.out.printf("Cantidad de comida inválida.\nExit.");
			sc.close();
			return;
		}
		// Fin pedir info al user

		// Mirar si tenemos suficiente comida
		if (comidaNecesaria <= comidaComprada)
			System.out.printf("Tienes suficiente comida!!");
		else // Si no tenemos comida suficiente, imprimir cuanto puede comer cada animal
			System.out.printf("No tienes comida suficiente, cada animal comeria %.2fKg.",
					(double) comidaComprada / numAnimales);

		sc.close();

	}
}
