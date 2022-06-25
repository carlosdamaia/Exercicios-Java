package exerciciosFor;

import java.util.Scanner;

public class For02 {

	public static void main(String[] args) {
		
		 /* Faça um programa para calcular a tabuada de qualquer número digitado pelo usuário.*/
		 
		Scanner ler = new Scanner(System.in);
		int numero, resultado;
		
		System.out.print("Digite o número da tabuada desejada: ");
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
