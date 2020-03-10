package br.model.control;
import java.util.ArrayList;
import java.util.List;

import br.com.model.Chapa;
import br.com.model.Voto;
import br.com.myvote.*;
import java.util.Scanner;

/**
 * 
 * @author filipe
 *
 *A classe tem por função executar o processo de voto do sistema
 *
 */

public class Votando {
	
	private Login login;
	private List<Chapa> chapas;
	
	
	public Votando() {
		
	}
	
	public Votando(List<Chapa> chapas) {
		this.chapas = chapas;
	}

	@Override
	public String toString() {
		return "Votando [login=" + login + ", chapas=" + chapas + "]";
	}
	
	public Voto executaVoto() {
		
		Voto voto = new Voto(null);
		Scanner in = new Scanner(System.in);
		//Scanner on = new Scanner(System.in);
		int recebeVoto;
		boolean fimVoto = true;
		//char simOuNao = 'd';		
		
		System.out.println(chapas.toString()); //Metodo para mostrar todas as chapas da votação
		
		
		while(fimVoto) {
			recebeVoto = in.nextInt();
			for(int i = 0; i<chapas.size(); i++) {
				if(recebeVoto == chapas.get(i).getNumeroChapa()) {
					System.out.println("Voto computado para a chapa " +chapas.get(i).getNomeChapa());
					voto.setChapa(chapas.get(i));
					fimVoto = false;
				}else {
					System.out.println("O numero da chapa não existe!\n" );
					System.out.println("Se voce deseja inserir outro numero digite [s] caso contrário seu voto sera anulado!");
					char simOuNao = in.next().charAt(0);
					if(simOuNao != 's' || simOuNao != 'S'){
						break;
					}
						
					
						
				}
				
		
			}
		}
		
				
		
		return voto;
		
	}
	
	
	
	
	
	
	
	
	

}
