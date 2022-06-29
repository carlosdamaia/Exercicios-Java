package exerciciosFor;

import java.util.Random;
import java.util.Scanner;

public class ForMain03 {

	public static void main(String[] args) {
		
//		Foi feita uma estat�stica em cinco cidades brasileiras para coletar dados sobre acidentes de tr�nsito. 
//		Foram obtidos os seguintes dados:
//
//		a) c�digo da cidade;
//
//		b) n�mero de ve�culos de passeio;
//
//		c) n�mero de acidentes de tr�nsito com v�timas.
//
//		Deseja-se saber:
//
//		a) Qual � o maior e qual � o menor �ndice de acidentes de tr�nsito e a que cidades pertencem;
//
//		b) Qual � a m�dia de ve�culos nas cinco cidades juntas;
//
//		c) Qual � a m�dia de acidentes de tr�nsito nas cidades com menos de 2.000 ve�culos de passeio.
		
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
			System.out.printf("C�digo: %d | Cidade: %s", listaCidades[i].codigo, listaCidades[i].nomeCidade);
			
			System.out.printf("\nInsira o n�mero de ve�culos: ");
			listaCidades[i].numeroVeiculos = ler.nextInt();
			totalVeiculos = totalVeiculos + listaCidades[i].numeroVeiculos;
			
			// Calcular media de acidentes em cidades com menos de 2000 veiculos
			if(listaCidades[i].numeroVeiculos < 2000) {
				indexTrafegoReduzido++;
				totalTrafegoReduzido = totalTrafegoReduzido + listaCidades[i].numeroVeiculos;
				mediaAcidentes = totalTrafegoReduzido / indexTrafegoReduzido;
			}
			
			System.out.printf("Insira o n�mero de acidentes: ");
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
		System.out.printf("\nMaior n�mero de acidentes: %d (%s) | Menor n�mero: %d (%s)", acidentesMax, cidadeMax, acidentesMin, cidadeMin);
		
		// Media de veiculos nas 5 cidades
		System.out.printf("\nA m�dia de ve�culos entre as 5 cidades s�o de: %.2f por cidade", mediaVeiculos);
		
		System.out.printf("\nA media de acidentes entre cidades com menos de 2000 ve�culos: %.2f", mediaAcidentes);

	}

}
