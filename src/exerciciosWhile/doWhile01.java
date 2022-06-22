package exerciciosWhile;

import java.util.Scanner;

public class doWhile01 {

	public static void main(String[] args) {
		
		int altura, base, area;
		boolean estaValido = false;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("***Calcule a base de um triangulo***");
		
		do {
			
			System.out.println("Digite a altura do triangulo: ");
			
			altura = ler.nextInt();
			
			System.out.println("Digite a base do triangulo: ");
			
			base = ler.nextInt();
			
			if (altura > 0 && base > 0) {
				estaValido = true;
				
				area = (altura * base) / 2;
				
				System.out.printf("A area do triangulo é de " + area);
				System.out.println("");
				System.out.println("");
			}
			else {
				estaValido = false;
				System.out.println("***Digite valores válidos!***");
				System.out.println("");
			}
			
		}
		
		while (estaValido);

	}

}
