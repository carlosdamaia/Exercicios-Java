package exerciciosFor;

import java.util.Random;
import java.util.Scanner;

public class ForMain03 {

	public static void main(String[] args) {
		
//		Foi feita uma estatística em cinco cidades brasileiras para coletar dados sobre acidentes de trânsito. 
//		Foram obtidos os seguintes dados:
//
//		a) código da cidade;
//
//		b) número de veículos de passeio;
//
//		c) número de acidentes de trânsito com vítimas.
//
//		Deseja-se saber:
//
//		a) Qual é o maior e qual é o menor índice de acidentes de trânsito e a que cidades pertencem;
//
//		b) Qual é a média de veículos nas cinco cidades juntas;
//
//		c) Qual é a média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio.
		
		Random rand = new Random();
		Scanner ler = new Scanner(System.in);
		ForCidades03 cidade1 = new ForCidades03();	
		ForCidades03 cidade2 = new ForCidades03();
		ForCidades03 cidade3 = new ForCidades03();
		ForCidades03 cidade4 = new ForCidades03();
		ForCidades03 cidade5 = new ForCidades03();
		ForCidades03[] listaCidades = {cidade1, cidade2, cidade3, cidade4, cidade5};
		int acidentesMax = 0;
		int acidentesMin = 0;
		int totalVeiculos = 0;
		double mediaVeiculos;
		int indexTrafegoReduzido = 0;
		double mediaAcidentes = 0;
		int totalTrafegoReduzido = 0;
		String cidadeMax = null, cidadeMin = null;
		
		for (int i = 0; i < 2; i++) {
		
			//listaCidades[i].codigo = rand.nextInt(100);
			
			listaCidades[i].gerarCodigo();
			
			System.out.println(listaCidades[i].gerarCodigo());
			
			System.out.printf("Insira o nome da cidade: ");
			
			listaCidades[i].nomeCidade = ler.nextLine();
			System.out.printf("Código: %d | Cidade: %s", listaCidades[i].codigo, listaCidades[i].nomeCidade);
			
			System.out.printf("\nInsira o número de veículos: ");
			listaCidades[i].numeroVeiculos = ler.nextInt();
			totalVeiculos = totalVeiculos + listaCidades[i].numeroVeiculos;
			
			// Calcular media de acidentes em cidades com menos de 2000 veiculos
			if(listaCidades[i].numeroVeiculos < 2000) {
				indexTrafegoReduzido++;
				totalTrafegoReduzido = totalTrafegoReduzido + listaCidades[i].numeroVeiculos;
				mediaAcidentes = totalTrafegoReduzido / indexTrafegoReduzido;
			}
			
			System.out.printf("Insira o número de acidentes: ");
			listaCidades[i].numeroAcidentes = ler.nextInt();
			
			// Preenche menor e maior numero de acidentes
			if(listaCidades[i].numeroAcidentes > acidentesMax) {
				cidadeMax = listaCidades[i].nomeCidade;
				acidentesMax = listaCidades[i].numeroAcidentes;
				if(acidentesMin == 0) {
					cidadeMin = listaCidades[i].nomeCidade;
					acidentesMin = listaCidades[i].numeroAcidentes;
				}
			}
			if(listaCidades[i].numeroAcidentes < acidentesMin) {
				cidadeMin = listaCidades[i].nomeCidade;
				acidentesMin = listaCidades[i].numeroAcidentes;
			}
			
			// Limpar buffer
			ler.nextLine();
			
		}
		
		// Calcula media de veiculos
		mediaVeiculos = totalVeiculos / listaCidades.length;
		
		// Menor e maior numero de acidentes
		System.out.printf("\nMaior número de acidentes: %d (%s) | Menor número: %d (%s)", acidentesMax, cidadeMax, acidentesMin, cidadeMin);
		
		// Media de veiculos nas 5 cidades
		System.out.printf("\nA média de veículos entre as 5 cidades são de: %.2f por cidade", mediaVeiculos);
		
		System.out.printf("\nA media de acidentes entre cidades com menos de 2000 veículos: %.2f", mediaAcidentes);

	}

}
