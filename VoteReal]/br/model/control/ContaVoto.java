package br.model.control;

import java.util.ArrayList;
import java.util.List;

import br.com.model.Chapa;
import br.com.model.Urna;

public class ContaVoto {
	
	private List<Urna> urnas = new ArrayList<Urna>();
	private List<Chapa> chapas = new ArrayList<Chapa>();
	
	
	public ContaVoto(List<Chapa> chapas, List<Urna> urnas) {
		this.urnas = urnas;
		this.chapas = chapas;
	}
	

	public void imprimeVotoPorUrna() {
		
		for(int ia = 0; ia<urnas.size(); ia++) {
			urnas.get(ia).imprimeVoto();
			System.out.println("=====================================");
		}
		
	}
	
	


}
