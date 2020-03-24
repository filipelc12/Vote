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
	

	public void imprimeTodosVotos() {
		
		for(int ia = 0; ia<urnas.size(); ia++) {
			urnas.get(ia).imprimeVoto();
			System.out.println("=====================================");
		}
		
	}
	
	public void computaVoto() {
		for(int ia = 0; ia<urnas.size(); ia++) {
			for(int ib = 0; ib<urnas.get(ia).getVotos().size(); ib++) {
				for(int ic = 0; ic<chapas.size(); ic++) {
					try {
					if(urnas.get(ia).getVotos().get(ib).getChapa().getNumeroChapa() == chapas.get(ic).getNumeroChapa()) {
						chapas.get(ic).setContadorDeVoto(chapas.get(ic).getContadorDeVoto()+1);
					}
					}catch (NullPointerException ex) {
						//System.out.println("Ok deu null");
					}
				}
			}
		}
	}
	
	public int qtdVoto() {
		
		int qtdVoto = 0;
		for(int ia = 0; ia<urnas.size();ia++) {
			qtdVoto = qtdVoto + urnas.get(ia).getVotos().size();
		}
		
		
		return qtdVoto;
	}
	
	public void resultado() {
		System.out.println("Resultado da votacao: \n");
		for(int ia = 0; ia<chapas.size(); ia++) {
			System.out.println("Nome da Chapa: " +chapas.get(ia).getNomeChapa());
			System.out.println("Numero da chapa: " +chapas.get(ia).getNumeroChapa());
			System.out.println("Numero de Votos: " +chapas.get(ia).getContadorDeVoto());
			System.out.println("----------------------------------------------------------");
		}
	}
	



}
