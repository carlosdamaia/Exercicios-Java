package exerciciosFor;

import java.util.Scanner;

public class For02 {

	public static void main(String[] args) {
		
		 /* Fa�a um programa para calcular a tabuada de qualquer n�mero digitado pelo usu�rio.*/
		 
		Scanner ler = new Scanner(System.in);
		int numero, resultado;
		
		System.out.print("Digite o n�mero da tabuada desejada: ");
		numero = ler.nextInt();
		
		for (int base = 0; base <= 10; base++) {
		
			if (numero == 0) {
				break;
			}
			resultado = numero * base;
			System.out.printf("\n%d x %d = %d", numero, base, resultado);
			
		}
		
	}

}
