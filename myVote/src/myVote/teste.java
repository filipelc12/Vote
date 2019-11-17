package myVote;

import java.util.ArrayList;
import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		char c;
		/*
		c = entrada.next().charAt(0);
		
		System.out.println(c);
		if(c == 's')
			System.out.println("ok!");
		else
			System.out.println("Not ok");
		*/
		
		//teste 
		System.out.println("Filipe sim"+"sim");
		
		
		/*
		
		
		int mais = 1;
		
		Chapa chapa1 = new Chapa("PT", 13);
		Chapa chapa2 = new Chapa("PSDB", 45);
		Chapa chapa3 = new Chapa("Novo", 30);
		
		Chapa chaps[] = {chapa1, chapa2, chapa3};
		
		
		
		Login teste = new Login("teste", "teste");
		
		teste.verificaLogin();
		
		//System.out.println(chaps[1].toString());
		
		
		
		Votando vots = new Votando(teste, chaps);
		
		vots.votacao();
		
		//System.out.println("teste");
		
		
*/
		
		Login log = new Login("teste", "teste");
		Chapa chapa1 = new Chapa("CHAPA BRASIL", 13);
		Chapa chapa2 = new Chapa("CHAPA AMERICA", 30);
		Chapa chapa3 = new Chapa("CHAPA RIO GRANDE", 12);
		Chapa chapa4 = new Chapa("CHAPA SUL", 50);
		Chapa chapa5 = new Chapa("Chapa NULO", 0);
		
		ContaVotos conta = new ContaVotos();
		
		conta.adicionaChapa(chapa1);
		conta.adicionaChapa(chapa2);
		conta.adicionaChapa(chapa3);
		conta.adicionaChapa(chapa4);
		conta.adicionaChapa(chapa5);
			
	
		
		Urna ur = new Urna();
		
		Voto vota = new Voto();
		
		
		Chapa chapas[] = {chapa1, chapa2, chapa3, chapa4};
		
		log.verificaLogin();
		
		Votando vot = new Votando(log, chapas);
		
				
		Urna urna = new Urna();
		Urna urna2 = new Urna();
		
		
		//System.out.println(urna.getId());
		
		
		
		
		Voto voto = vot.votacao();
		urna.adicionaVotos(voto);
				
		
		Voto voto2 = vot.votacao();
		urna2.adicionaVotos(voto2);
		
		System.out.println(urna.lista());
		
		System.out.println("O total de votos e: " +urna.getContagemDeVoto());
		
		System.out.println(chapa5.getContadorDeVotos());
		
		conta.votoPorChapa();
		

	}

}
