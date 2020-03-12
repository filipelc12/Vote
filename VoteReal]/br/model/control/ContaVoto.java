package br.model.control;

import java.util.ArrayList;
import java.util.List;

import br.com.model.Urna;

public class ContaVoto {
	
	public ContaVoto() {
		
	}
	

	public void imprimeVotoPorUrna(List<Urna> urna) {
		
		for(int ia = 0; ia<urna.size(); ia++) {
			urna.get(ia).imprimeVoto();
			System.out.println("=====================================");
		}
		
	}
	
	


}
