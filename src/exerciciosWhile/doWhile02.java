package exerciciosWhile;

import java.util.Scanner;

public class doWhile02 {

	private static final char Y = 0;

	public static void main(String[] args) {
		
		/*
		 * Faça um programa que apresente o menu de opções a seguir, permita ao usuário
		 * escolher a opção desejada, receba os dados necessários para executar a
		 * operação e mostre o resultado. Verifique a possibilidade de opção inválida e
		 * não se preocupe com restrições do tipo salário inválido.
		 * 
		 * Menu de opções: 1 – Imposto, 2 – Novo Salário, 3 – Classificação, 4 –
		 * Finalizar o programa, 5 – Finalizar o programa. Digite a opção desejada.
		 * 
		 * Na opção 1: receber o salário de um funcionário, calcular e mostrar o valor
		 * do imposto usando as regras da tabela 3.
		 * 
		 * Na opção 2: receber o salário de um funcionário, calcular e mostrar o valor
		 * do novo salário usando as regras da tabela 4.
		 * 
		 * Na opção 3: receber o salário de um funcionário e mostrar sua classificação
		 * usando a tabela 5.
		 */
		
		String classificacao;
		int opcao, porcentagemImposto;
		float salario, valorImposto, aumento = 0;
		char finalizar;
		
		do {
			
			Scanner ler = new Scanner (System.in);
			
			System.out.print("Selecione a opção desejada: \n");
			System.out.print(" 1 - Imposto \n 2 - Novo Salário \n 3 - Classificação \n 4 - Finalizar o programa \n");
			
			opcao = ler.nextInt();
			
			if (opcao <= 0 || opcao > 4) {
				System.out.println("Opção inválida!");
			}
			
			switch (opcao) {
			
				case 1:
					System.out.println("1 - Imposto");
					System.out.println("Digite o salário do funcionário: ");
					salario = ler.nextInt();
					
					if (salario < 500) {
						porcentagemImposto = 5;
					} else if (salario > 500 && salario < 850) {
						porcentagemImposto = 10;
					} else {
						porcentagemImposto = 15;
					}
					
					valorImposto = (porcentagemImposto * salario) / 100;
					
					System.out.println("O valor do imposto é de: ");
					System.out.println(valorImposto);
					
					break;
					
				case 2: 
					System.out.println("2 - Novo Salário");
					System.out.println("Digite o salário do funcionário: ");
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
					
					System.out.printf("Você recebeu um aumento de: %.2f", aumento);
					System.out.println("");
					
					salario = salario + aumento;
					
					System.out.printf("Seu salário atual é de: %.2f", salario);
					
					break;
					
				case 3:
					
					System.out.println("3 - Classificação");
					System.out.println("Digite o salário do funcionário: ");
					
					salario = ler.nextInt();
					
					if (salario > 750) {
						classificacao = "Bem remunerado";
						System.out.printf("Classificação: %s ", classificacao);
					} else {
						classificacao = "Mal remunerado";
						System.out.printf("Classificação: %s ", classificacao);
					}
					
					break;
					
				case 4:
					
					System.out.println("Programa finalizado!");
			
					break;
			} 
			
		} while (opcao <= 0 || opcao > 4);

	}
}
