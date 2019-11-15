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
		
		/*
		 * Implementar o loop de votacao
		 * 
		 * criacao do boolean finaliza votacao
		 */
		int t = 1; // saida do loop
		Chapa tChapa = new Chapa(); // chapa que será votada
		Voto tVoto = new Voto(); // retorno do voto
		while(t==1){
			
			Scanner in = new Scanner(System.in);
			int voto;
			
		
			// primeiro for para mostrar as opções de voto
			for(int i = 0; i <= chapas.length - 1; i++) 
				System.out.println(chapas[i].mostraNaUrna());
			
			
			// Imprime e recebe o numero da chapa
			System.out.println("Digite o numero da chapa");
			int votoIn = in.nextInt();
			
			//for para receber o numero da chapa
			for(int i = 0; i <= chapas.length - 1; i++) {
				if(votoIn == chapas[i].getNumeroChapa()) {
					//printa a confirmacao
					System.out.println("Voce tem certeza que deseja vota na chapa: " +chapas[i].getNomeChapa() +"\n [S]sim");
					System.out.println("Caso voce nao esteja certo digite outra tecla");
					//Se o usuario digitar S confirma o voto, se nao volta ao inicio;
					Scanner confirma = new Scanner (System.in);
					char confirmaVoto = confirma.next().charAt(0); //necessario tratar exceção do numero
					if(confirmaVoto == 's') { // if para comparar o voto
						System.out.println("Voto confirmado");
						
						//Não sei como retornar um Voto melhor do que dessa forma 
						//tChapa = chapas[i];
						tVoto.setChapa(chapas[i]);
						t = 2;// t para sair do loop
						
					}
					else
						t = 1;
					
					
					
					
				//	chapas[i].setContadorDeVotos(chapas[i].getContadorDeVotos() + 1);
				}
				else {
					System.out.println("Numero de chapa invalido! Digite outro numero");
					t = 1;
				}//saida da verificacao do numero invalido
				
			} // saida do for de chapas
			
			
		}// loop principal
		
		System.out.println("Numero da chapa TESTE" +tChapa.getNumeroChapa());
		return tVoto;
		
		
		
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
