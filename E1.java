package RepasoArrays.PruebaGitHubDesktop;

import java.util.Scanner;

public class E1 {
	
	/*
	 * En un array de 20 elementos hay almacenados números enteros. 
	 * Haz un programa que pida un número y diga cuántas veces aparece el número dentro 
	 * del array.
	 */

	public static void main(String[] args) {

		int []array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 5, 5, 6, 3, 1, 7, 6, 1, 3, 2, 10};
		int contador = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce un numero entre el 1 y el 10: ");
		int numero = scanner.nextInt();
		
		for(int i = 0; i < array.length; i++) {
			if(numero == array[i]) {
				contador ++;
			}
		}
		System.out.println("El numero " +numero+ " se ha repetido " +contador+ " veces");
		
		scanner.close();
		
	}

}
