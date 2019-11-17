package myVote;

import java.util.ArrayList;

// A classe é utilizada para contar os votos e coloca-los no contador de de cada Chapa
// A classe também imprime uma string com o numero de votos por urna

public class ContaVotos {
	
	//private static ArrayList<Urna> urnas = new ArrayList<>();
	private static ArrayList<Chapa> chapas = new ArrayList<>();
	

	

	public ContaVotos() {
		
	}
	

	
	
	public int contaVoto() {
		
		int conta = 0;
		int i = 0;
		
		//for(Voto v: )
		
		
		
		return conta;
		
	}
	
	public void adicionaChapa(Chapa chapa) {
		chapas.add(chapa);
	}
	
	
	public void votoPorChapa() {
		int i = 0;
	
		
		for(Chapa chapas: chapas) {
			
			System.out.println(chapas.toString());
			
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

	

}
