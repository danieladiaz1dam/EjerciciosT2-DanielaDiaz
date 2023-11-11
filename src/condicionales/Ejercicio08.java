package condicionales;

import java.util.Scanner;

/*
 * Determinar el precio de un billete de tren, conociendo la distancia a recorrer,
 * y sabiendo que si el número de días de estancia es superior a 7 y la distancia
 * superior a 800 km el billete tiene una reducción del 30%.
 * El precio por kilómetro es de 2,5€. La distancia a recorrer y el número de días
 * de estancia los debes solicitar al usuario por teclado.
 */

/*
 * Ejemplos de Entrada y Salida:
 * 
 * Introduce la distancia a recorrer en el tren: > 1000
 * Introduce los dias de instancia: > 5
 * El coste total de su viaje es de 2500,00€
 * 
 * Introduce la distancia a recorrer en el tren: > 1000
 * Introduce los dias de instancia: > 8
 * El coste total de su viaje es de 1750,00€
 */

public class Ejercicio08 {
	public static void main(String[] args) {
		final float PRECIO_KILOMETRO = 2.5f, DESCUENTO_BILLETE = .3f;
		float precioBillete, distancia;
		int nDias;
		Scanner sc = new Scanner(System.in);

		// Preguntar info al usuario
		System.out.printf("Introduce la distancia a recorrer en el tren: ");
		distancia = sc.nextFloat();

		if (distancia < 0) {
			System.out.printf("Distancia invalida.\nExit.");
			sc.close();
			return;
		}

		System.out.printf("Introduce los dias de instancia: ");
		nDias = sc.nextInt();

		if (nDias < 0) {
			System.out.printf("Numero de dias invalido.\nExit.");
			sc.close();
			return;
		}
		// Fin preguntar info al usuario

		// Calcular precio del billete
		precioBillete = distancia * PRECIO_KILOMETRO;

		// Calcular descuento
		if (distancia > 800 && nDias > 7)
			precioBillete -= precioBillete * DESCUENTO_BILLETE;

		// Imprimir el precio final del billete
		System.out.printf("El coste total de su viaje es de %.2f€", precioBillete);

		sc.close();
	}
}
