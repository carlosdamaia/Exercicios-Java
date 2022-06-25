package exerciciosFor;

public class For01 {

	public static void main(String[] args) {
		
		/*
		 * Um funcionário de uma empresa recebe, anualmente, aumento salarial. Sabe-se
		 * que:
		 * 
		 * a) esse funcionário foi contratado em 2000, com salário inicial de
		 * R$1.000,00;
		 * 
		 * b) Em 2001, ele recebeu aumento de 1,5%, sobre o seu salário inicial;
		 * 
		 * c) A partir de 2002 (inclusive), os aumentos salariais sempre corresponderam
		 * ao dobro do percentual do ano anterior.
		 * 
		 * Faça um programa que determine o salário desse funcionário dos anos de 2000 à
		 * 2017. Apresente todos os valores.
		 */
		
		double salario = 1000.00;
		double aumento;
		double percentualAumento = 1.5;
		
		for (int ano = 2000; ano <= 2017; ano++) {
			if (ano >= 2002) {
				percentualAumento = percentualAumento * 2;
			}
			System.out.printf("Salário: %.2f reais | Ano: %d | Percentual de Aumento: %.2f\n", salario, ano, percentualAumento);
			aumento = percentualAumento * salario / 100;
			salario = aumento + salario;
		}

	}

}
