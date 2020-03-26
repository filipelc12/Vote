/**
 * 
 * @author filipe
 *
 *A classe tem por funÃ§Ã£o executar o processo de voto do sistema
 *
 *
 *ATRIBUTOS
 *
 *login Login
 *chapas List<Chapa>
 *
 */

package br.model.control;
import java.util.ArrayList;
import java.util.List;

import br.com.model.Chapa;
import br.com.model.Voto;
import br.com.myvote.*;
import java.util.Scanner;



public class Votando {
	
	private Login login;
	private List<Chapa> chapas;
	
	

	
	public Votando(List<Chapa> chapas, Login login) {
		this.chapas = chapas;
		
		// if que faz o construtor apenas SE o login for verdadeiro
		if(login.isVerificado()) {
			this.login = login;
			System.out.println("login criado");
		}
						
	}
	
	

	public Login getLogin() {
		return login;
	}



	public void setLogin(Login login) {
		this.login = login;
	}



	public List<Chapa> getChapas() {
		return chapas;
	}



	public void setChapas(List<Chapa> chapas) {
		this.chapas = chapas;
	}



	@Override
	public String toString() {
		return "Votando [login=" + login + ", chapas=" + chapas + "]";
	}
	
	/*
	 * Imprime todas as chapas disponiveis para votos
	 * Recebe votação, caso o numero inserido pelo usuario nao seja nenhum numero de chapa o sistema informa que o voto sera computado como nulo
	 * o usuario pode apertar o botao 1 para votar novamente
	 * 
	 * Por fim é exibido uma mensagem com o voto do usuario
	 */
	
	public Voto executaVoto() {
		
		//VARIAVEIS
		
		Voto voto = new Voto(null);//.......... Cria um voto nulo para ser preenchido no loop ou continua nulo e o voto e computado como nulo
		Scanner in = new Scanner(System.in);//. Metodo scanner
		int recebeVoto;//...................... recebe o scanner
		boolean fimVoto = false;//............. boolean para setar final da votacao
		
		
		System.out.println("Iniciando processo de votacao:");
		while(true) {
			
			if(!this.login.isVerificado()) {
				System.out.println("Login não identificado!");
				break;
			}
				
			
			System.out.println(chapas.toString());
			System.out.println("\nInforme o numero da sua chapa de acordo com os numeros mostrados acima! \n");
			
			recebeVoto = in.nextInt();
						
			for(int i = 0; i<chapas.size(); i++) {
				if(recebeVoto == chapas.get(i).getNumeroChapa()) {
					System.out.println("Voto computado para a chapa " +chapas.get(i).getNomeChapa()+"\n");
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
	
	

}
