package condicionales;

import java.util.Scanner;

/*
 * Escribe un programa que solicite al usuario un número entero entre 1 y 99.
 * El programa debe mostrarlo con letras, por ejemplo, para 56 se verá: “cincuenta y seis”.
 */

/*
 * Ejemplos de Entrada y Salida:
 * 
 * Introduce un numero [-99~99]: > 10
 * 10 se escribe "diez".
 * 
 * Introduce un numero [-99~99]: > 18
 * 18 se escribe "dieciocho".
 * 
 * Introduce un numero [-99~99]: > 74
 * 74 se escribe "setenta y cuatro".
 * 
 * Introduce un numero [-99~99]: > -6
 * -6 se escribe "menos seis".
 * 
 * Introduce un numero [-99~99]: > 200
 * Numero inválido
 * 
 * Introduce un numero [-99~99]: > -200
 * Numero inválido
 * 
 */

public class Ejercicio04 {
	public static String num2str(int num) {
		String res = "";
		
		// Mirar si es decena
		if (num % 10 == 0 && num != 0) {
			res += switch(num) {
			case 10: yield "diez";
			case 20: yield "veinte";
			case 30: yield "treinta";
			case 40: yield "cuarenta";
			case 50: yield "cincuenta";
			case 60: yield "sesenta";
			case 70: yield "setenta";
			case 80: yield "ochenta";
			case 90: yield "noventa";
			default: yield "";
			};
		}
		// Mirar si se escribe raro
		else if (num < 20) {
			res += switch (num) {
			case 0: yield "cero";
			case 1: yield "uno";
			case 2: yield "dos";
			case 3: yield "tres";
			case 4: yield "cuatro";
			case 5: yield "cinco";
			case 6: yield "seis";
			case 7: yield "siete";
			case 8: yield "ocho";
			case 9: yield "nueve";
			case 10: yield "diez";
			case 11: yield "once";
			case 12: yield "doce";
			case 13: yield "trece";
			case 14: yield "catorce";
			case 15: yield "quince";
			case 16: yield "dieciseis";
			case 17: yield "diecesiete";
			case 18: yield "dieciocho";
			case 19: yield "diecinueve";
			default: yield "";
			};
		}
		// Mirar decenas
		else  {
			res += switch(num / 10) {
			case 2: yield "veinti";
			case 3: yield "trainta y ";
			case 4: yield "cuarenta y ";
			case 5: yield "cincuenta y ";
			case 6: yield "sesenta y ";
			case 7: yield "setenta y ";
			case 8: yield "ochenta y ";
			case 9: yield "noventa y ";
			default: yield "";
			};
		}
		
		// Mirar las unidades
		if (num > 20) {			
			res += switch(num % 10) {
			case 1: yield "uno";
			case 2: yield "dos";
			case 3: yield "tres";
			case 4: yield "cuatro";
			case 5: yield "cinco";
			case 6: yield "seis";
			case 7: yield "siete";
			case 8: yield "ocho";
			case 9: yield "nueve";
			default: yield "";
			};
		}
		
		return res;
	}

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		
		// Predir el numero al usuario
		System.out.printf("Introduce un numero [-99~99]: ");
		num = sc.nextInt();
		
		if (num < -99 || num > 99) {
			System.out.printf("Numero inválido");
			sc.close();
			return;
		}
		
		/*
		 * Pruebas :)
		for (int i = 0; i < 100; i++) {
			System.out.printf("%d %s\n",i, num2str(i));
			if (i%10 == 9) System.out.println();
		}
		*/
		
		// Imprimir el valor en string, si es menor a cero, escribir "menos" delante
		System.out.printf("%d se escribe \"%s\".", num, num < 0 ? "menos " + num2str(num*-1) : num2str(num));

		sc.close();
	}
}
