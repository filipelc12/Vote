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
		int recebeVoto;
		boolean fimVoto = false;
		
		System.out.println(chapas.toString()); //Metodo para mostrar todas as chapas da votação
		
		while(true) {
			
			System.out.println("Informe o numero da sua chapa de acordo com os numeros mostrados acima! \n");
			
			recebeVoto = in.nextInt();
						
			for(int i = 0; i<chapas.size(); i++) {
				if(recebeVoto == chapas.get(i).getNumeroChapa()) {
					System.out.println("Voto computado para a chapa " +chapas.get(i).getNomeChapa());
					voto.setChapa(chapas.get(i));
					fimVoto = true;
				
				}
				
			}
			if(fimVoto)
				break;
			
			System.out.println("O numero da chapa nao existe!" );
			System.out.println("Se voce deseja inserir outro numero digite [1] caso contrario digite outra tecla e seu voto sera anulado!\n");
			int simOuNao = in.nextInt();
			
			if(simOuNao != 1 ){
				System.out.println("Seu voto foi computado como Nulo!");
				
				break;
			}
			
		}
		
		return voto;
		
	}
	
	
	
	
	
	/*
	 * else {
					System.out.println("O numero da chapa não existe!\n" );
					System.out.println("Se voce deseja inserir outro numero digite [s] caso contrário seu voto sera anulado!");
					char simOuNao = in.next().charAt(0);
					if(simOuNao != 's' || simOuNao != 'S'){
						break;
					}
						
					
						
				}
	 */
	
	
	

}
