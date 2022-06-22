package exerciciosWhile;

import java.util.Scanner;

public class doWhile02 {

	private static final char Y = 0;

	public static void main(String[] args) {
		
		/*
		 * Fa�a um programa que apresente o menu de op��es a seguir, permita ao usu�rio
		 * escolher a op��o desejada, receba os dados necess�rios para executar a
		 * opera��o e mostre o resultado. Verifique a possibilidade de op��o inv�lida e
		 * n�o se preocupe com restri��es do tipo sal�rio inv�lido.
		 * 
		 * Menu de op��es: 1 � Imposto, 2 � Novo Sal�rio, 3 � Classifica��o, 4 �
		 * Finalizar o programa, 5 � Finalizar o programa. Digite a op��o desejada.
		 * 
		 * Na op��o 1: receber o sal�rio de um funcion�rio, calcular e mostrar o valor
		 * do imposto usando as regras da tabela 3.
		 * 
		 * Na op��o 2: receber o sal�rio de um funcion�rio, calcular e mostrar o valor
		 * do novo sal�rio usando as regras da tabela 4.
		 * 
		 * Na op��o 3: receber o sal�rio de um funcion�rio e mostrar sua classifica��o
		 * usando a tabela 5.
		 */
		
		String classificacao;
		int opcao, porcentagemImposto;
		float salario, valorImposto, aumento = 0;
		char finalizar;
		
		do {
			
			Scanner ler = new Scanner (System.in);
			
			System.out.print("Selecione a op��o desejada: \n");
			System.out.print(" 1 - Imposto \n 2 - Novo Sal�rio \n 3 - Classifica��o \n 4 - Finalizar o programa \n");
			
			opcao = ler.nextInt();
			
			if (opcao <= 0 || opcao > 4) {
				System.out.println("Op��o inv�lida!");
			}
			
			switch (opcao) {
			
				case 1:
					System.out.println("1 - Imposto");
					System.out.println("Digite o sal�rio do funcion�rio: ");
					salario = ler.nextInt();
					
					if (salario < 500) {
						porcentagemImposto = 5;
					} else if (salario > 500 && salario < 850) {
						porcentagemImposto = 10;
					} else {
						porcentagemImposto = 15;
					}
					
					valorImposto = (porcentagemImposto * salario) / 100;
					
					System.out.println("O valor do imposto � de: ");
					System.out.println(valorImposto);
					
					break;
					
				case 2: 
					System.out.println("2 - Novo Sal�rio");
					System.out.println("Digite o sal�rio do funcion�rio: ");
					salario = ler.nextInt();
					
					if (salario > 1500) {
						aumento = 250;
						System.out.println(aumento);
					} else if (salario >= 750 && salario <= 1500) {
						aumento = 50;
						System.out.println(aumento);
					} else if (salario >= 450 && salario < 750) {
						aumento = 75;
						System.out.println(aumento);
					} else if (salario < 450) {
						aumento = 100;
						System.out.println(aumento);
					}
					
					System.out.printf("Voc� recebeu um aumento de: %.2f", aumento);
					System.out.println("");
					
					salario = salario + aumento;
					
					System.out.printf("Seu sal�rio atual � de: %.2f", salario);
					
					break;
					
				case 3:
					
					System.out.println("3 - Classifica��o");
					System.out.println("Digite o sal�rio do funcion�rio: ");
					
					salario = ler.nextInt();
					
					if (salario > 750) {
						classificacao = "Bem remunerado";
						System.out.printf("Classifica��o: %s ", classificacao);
					} else {
						classificacao = "Mal remunerado";
						System.out.printf("Classifica��o: %s ", classificacao);
					}
					
					break;
					
				case 4:
					
					System.out.println("Programa finalizado!");
			
					break;
			} 
			
		} while (opcao <= 0 || opcao > 4);

	}
}
