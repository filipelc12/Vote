
package br.com.teste;
import br.com.myvote.Login;
import br.model.control.ContaVoto;
import br.model.control.Votando;

import java.util.ArrayList;
import java.util.List;

import br.com.model.*;

public class Teste {
	
	public static void main(String[] args) {
		
		List<Chapa> chapas = new ArrayList<Chapa>();
		List<Urna> urnas = new ArrayList<Urna>();
		
		
		Chapa chapa1 = new Chapa("PT", 13);
		Chapa chapa2 = new Chapa("PTB", 12);
		
		ContaVoto contagem = new ContaVoto();
		
		chapas.add(chapa1);
		chapas.add(chapa2);
		
		Votando votando = new Votando(chapas);
		
		Urna urna = new Urna();
		Urna urna2 = new Urna();
		
		urnas.add(urna);
		urnas.add(urna2);
		
		System.out.println(urna.toString());
		
		System.out.println(votando.toString());
		
		
		/*
		
		Voto voto;
		Voto voto2;
		
		voto = votando.executaVoto();
		voto2 = votando.executaVoto();
		
		
		
		System.out.println("Voto 1: " +voto.getChapa() +voto.getId());
		System.out.println("Voto 2: " +voto2.getChapa() +voto.getId());
		
		*/
		
		urna.registraVoto(votando.executaVoto());
		urna.registraVoto(votando.executaVoto());
		
		urna2.registraVoto(votando.executaVoto());
		
	
		
		//urna.imprimeVoto();
		
		contagem.imprimeVotoPorUrna(urnas);
		
		
	
		

	}

}
