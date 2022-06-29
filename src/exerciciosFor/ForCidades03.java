package exerciciosFor;

import java.util.Random;

public class ForCidades03 {
	
	Random rand = new Random();
	
	public int codigo;
	public String nomeCidade;
	public int numeroVeiculos;
	public int numeroAcidentes;
	
	public String gerarCodigo() {
		
		this.codigo = rand.nextInt(200);
		
		return "codigo: " + this.codigo;
		
	}
	
	
}
