package prueba;

import java.util.Scanner;

public class Prueba {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Escribe un número: ");
		int entero = sc.nextInt();
		
		// Bucle que se inicializa en 1 
		for (int i = 1; i < 10; i++) {
			
			// Muestra la tabla del número que indiquemos
			int resultado = entero * i;
			System.out.println(entero + " x " + i " = " + resultado);
			
		}
	}

}
