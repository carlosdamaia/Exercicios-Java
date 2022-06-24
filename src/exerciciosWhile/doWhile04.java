package exerciciosWhile;

import java.util.Scanner;

public class doWhile04 {

	public static void main(String[] args) {
		
//		Foi feita uma pesquisa sobre a audiência de canal de TV em várias casas de uma cidade, em determinado dia. 
//		Para cada casa consultada foi fornecido o número do canal (4, 5, 7, 12) e o número de pessoas que estavam assistindo àquele canal. 
//		Se a televisão estivesse desligada, nada era anotado, ou seja, essa casa não entrava na pesquisa.
//
//		Faça um programa que:
//
//		a) Leia um número indeterminado de dados (número do canal e número de pessoas que estavam assistindo);
//
//		b) Calcule e mostre a porcentagem de audiência de cada canal.
//
//		Para encerrar a entrada de dados, digite o número do canal zero.
		
		int audiencia = 0, audiencia04 = 0, audiencia05 = 0, audiencia07 = 0, audiencia12 = 0, contadorLoop = 0, totalAudiencia; 
		int finalizarContagem = 1;
		float[] porcentagemAudiencias = {0, 0, 0, 0};
		
		Scanner ler = new Scanner(System.in);
		
		do {
			
			System.out.println("*Digite o número de pessoas assistindo os seguintes canais*");
			
			System.out.print("Canal 04: ");
			audiencia = ler.nextInt();
			audiencia04 = audiencia + audiencia04;
			audiencia = 0;
			
			System.out.println("");
			System.out.print("Canal 05: ");
			audiencia = ler.nextInt();
			audiencia05 = audiencia + audiencia05;
			audiencia = 0;
			
			System.out.println("");
			System.out.print("Canal 07: ");
			audiencia = ler.nextInt();
			audiencia07 = audiencia + audiencia07;
			audiencia = 0;
			
			System.out.println("");
			System.out.print("Canal 12: ");
			audiencia = ler.nextInt();
			audiencia12 = audiencia + audiencia12;
			audiencia = 0;
			
			contadorLoop++;
			
			if (contadorLoop >= 1) {
				System.out.println("*******************************************************");
				System.out.println("0 = Finalizar pesquisa e obter resultados 1 = Continuar");
				System.out.println("*******************************************************");
				finalizarContagem = ler.nextInt();
			}
			
		} while (finalizarContagem != 0);
		
		totalAudiencia = audiencia04 + audiencia05 + audiencia07 + audiencia12;
		
		porcentagemAudiencias[0] = (100 * audiencia04) / totalAudiencia;
		porcentagemAudiencias[1] = (100 * audiencia05) / totalAudiencia;
		porcentagemAudiencias[2] = (100 * audiencia07) / totalAudiencia;
		porcentagemAudiencias[3] = (100 * audiencia12) / totalAudiencia;
		
		System.out.printf("Canal 04: \n%d telespectadores \nPercentual: %.2f", audiencia04, porcentagemAudiencias[0]);
		System.out.println("");
		System.out.printf("Canal 05: \n%d telespectadores \nPercentual: %.2f", audiencia05, porcentagemAudiencias[1]);
		System.out.println("");
		System.out.printf("Canal 07: \n%d telespectadores \nPercentual: %.2f", audiencia07, porcentagemAudiencias[2]);
		System.out.println("");
		System.out.printf("Canal 12: \n%d telespectadores \nPercentual: %.2f", audiencia12, porcentagemAudiencias[3]);
		System.out.println("");
		System.out.printf("\nTotal de audiência: %d", totalAudiencia);
		
	}

}
