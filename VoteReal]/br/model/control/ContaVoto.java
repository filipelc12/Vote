/**
 * @author filipe.carvalho
 * 
 * OBJETIVO:
 * 
 * Recebe urnas, computa todos votos das urnas e direciona para as chapas corretas 
 * Lista todos os votos realizados;
 * 
 * 
 * 
 */

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
	
	
	/*
	 * imprimeTodosVotos
	 * 
	 * OBJETIVO
	 * printar na tela uma especie de lista com todos os votos realizados em todas as urnas
	 */

	public void imprimeTodosVotos() {
		
		for(int ia = 0; ia<urnas.size(); ia++) {
			urnas.get(ia).imprimeVoto();
			System.out.println("=====================================");
		}
		
	}
	
	/*
	 * Percorre urnas fazendo GET de todos os votos nas urnas e computando para a chapa correspondente
	 */
	
	public void computaVoto() {
		for(int ia = 0; ia<urnas.size(); ia++) {
			for(int ib = 0; ib<urnas.get(ia).getVotos().size(); ib++) {
				for(int ic = 0; ic<chapas.size(); ic++) {
					try {
					if(urnas.get(ia).getVotos().get(ib).getChapa().getNumeroChapa() == chapas.get(ic).getNumeroChapa()) {
						chapas.get(ic).setContadorDeVoto(chapas.get(ic).getContadorDeVoto()+1);
					}
					}catch (NullPointerException ex) {
						
					}
				}
			}
		}
	}
	
	/*
	 * qtdVoto
	 * 
	 * OBJETIVO
	 * retornar um int com quantidade de votos realizados
	 * 
	 * 
	 * RETORNO:
	 * int
	 */
	
	public int qtdVoto() {
		
		int qtdVoto = 0;
		for(int ia = 0; ia<urnas.size();ia++) {
			qtdVoto = qtdVoto + urnas.get(ia).getVotos().size();
		}
		
		
		return qtdVoto;
	}
	
	/*
	 * resultado
	 * 
	 * Retorna a lista de chapas com todos os votos recebidos
	 */
	
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
