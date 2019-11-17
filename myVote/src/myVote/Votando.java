package myVote;

import java.util.Scanner;
import java.util.Arrays;


public class Votando {
	
	private Login login;
	private Chapa[] chapas;
	
	public Votando(Login login, Chapa[] chapas) {
		this.chapas = chapas;
		
		
		
		// if que faz o construtor apenas SE o login for verdadeiro
		if(login.isVerificado()) {
			this.login = login;
			System.out.println("login criado");
		}
	}
	
	
	public Voto votacao() {
		
		Voto voto = new Voto(); //cria um voto
		Scanner in = new Scanner(System.in);
		Chapa chaps = new Chapa(); // Chapa que irá receber um voto
		Chapa chapaNulo = new Chapa("Nulo", 0); //Caso o usuario vote um um id de chapa nao econtrado, seu voto sera anulado
		
		/*
		 * Implementar o loop de votacao
		 * 
		 * criacao do boolean finaliza votacao
		 */
		boolean feito = false; // boolean para sair do loop
		
		//loop da votação
		do{
			//impressao de chapas
			for(int i = 0; i <= chapas.length -1; i++) {
				System.out.println(chapas[i].mostraNaUrna());
				
			}
			// Solicita o numero da chapa e recebe no int RecebeVoto
			System.out.println("Por favor, informe o numero da chapa que deseja votar!");
			int recebeVoto = in.nextInt();
			
						

			
			//loop para aplicar o voto
			for(int i = 0;  i<= chapas.length -1; i++) {
				if(recebeVoto == chapas[i].getNumeroChapa()) { // se o numero do usuario for igual ao numero da chapa
					chaps.setNomeChapa(chapas[i].getNomeChapa()); 
					chaps.setNumeroChapa(chapas[i].getNumeroChapa());
					voto.setChapa(chapas[i]);
					chapas[i].setContadorDeVotos(chapas[i].getContadorDeVotos() +1); // Implementa um voto no contador
					System.out.println("Voce votou na Chapa: " +chapas[i].getNomeChapa());
					System.out.println("Obrigado!");
					feito = true; // se o voto foi computado o boolean para sair do sistema rece TRUE
					break;
					
				}
			}
			if(feito)// Se true ele dá um break para sair do WHILE e nao cair no segundo for para 'pegar' votos nulos
				break;
			
				
				// For para pegar votos nulos
			for(int i = 0; i<= chapas.length -1; i++) {
					if(recebeVoto != chapas[i].getNumeroChapa()) {
						System.out.println("Numero nao encontrado. Seu voto sera computado como nulo");
						chapaNulo.setContadorDeVotos(chapaNulo.getContadorDeVotos() +1); // Incrementa o contador de voto nulo
						voto.setChapa(chapaNulo); // Faz o voto ter a chapa NULO;
						feito = true;
						break;
						
					
				}
			}
			
			break;
			
			
			
			
		}while(!feito);
		
		
		
		
		
		return voto;
		
	}//Fim do metodo
			
				
			
		
		
				
			


	public Login getLogin() {
		return login;
	}


	public void setLogin(Login login) {
		this.login = login;
	}


	public Chapa[] getChapas() {
		return chapas;
	}


	public void setChapas(Chapa[] chapas) {
		this.chapas = chapas;
	}
	
	
	
	

}
