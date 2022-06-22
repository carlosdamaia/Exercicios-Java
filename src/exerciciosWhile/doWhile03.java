package exerciciosWhile;

import java.util.Scanner;

public class doWhile03 {

	public static void main(String[] args) {
		
//		Faça um programa que receba várias idades, calcule e mostre a média das idades digitadas. Finalize digitando idade igual a zero.
		
		int idades = 0;
		int contadorIdades = 0; 
		int inputUsuario; 
		float mediaIdades;
		Scanner ler = new Scanner(System.in);
		
		do {
			
			if(contadorIdades == 1) {
				System.out.println("**Digite 0 se deseja finalizar**");
			}
			
			System.out.println("Digite as idades: ");
			inputUsuario = ler.nextInt();
			idades = idades + inputUsuario;
			contadorIdades++;
			
		} while (inputUsuario != 0);
		
		contadorIdades--;
		
		mediaIdades = idades / contadorIdades;
		
		System.out.printf("A média de idade entre as %d citadas é de %.2f anos",contadorIdades, mediaIdades);

	}

}
