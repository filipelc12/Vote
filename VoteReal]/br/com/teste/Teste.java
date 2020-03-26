
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
		
		
		Chapa chapa1 = new Chapa("AMERICA", 13);
		Chapa chapa2 = new Chapa("BRASIL", 12);
		Chapa chapa3 = new Chapa("CANADA", 60);
		Chapa chapa4 = new Chapa("ALEMANHA", 78);
		Chapa chapa5 = new Chapa("PERU", 45);
		
		
		Login login = new Login("teste", "1234");
		
		login.isVerificado();
		
		System.out.println(login.isVerificado());
		login.verificaLogin();
		
		
		
		chapas.add(chapa1);
		chapas.add(chapa2);
		chapas.add(chapa3);
		chapas.add(chapa4);
		chapas.add(chapa5);
		
		Votando votando = new Votando(chapas, login);
		
	//	System.out.println(votando.getLogin().isVerificado());
		
		Urna urna = new Urna();
		Urna urna2 = new Urna();
		Urna urna3 = new Urna();
		Urna urna4 = new Urna();
		
		urnas.add(urna);
		urnas.add(urna2);
		urnas.add(urna3);
		urnas.add(urna4);
		
		ContaVoto contagem = new ContaVoto(chapas, urnas);
		

		
		urna.registraVoto(votando.executaVoto());
		urna.registraVoto(votando.executaVoto());
		
		urna2.registraVoto(votando.executaVoto());
		urna2.registraVoto(votando.executaVoto());
		urna2.registraVoto(votando.executaVoto());
		urna2.registraVoto(votando.executaVoto());
		
		//urna3.registraVoto(votando.executaVoto());
		
		urna4.registraVoto(votando.executaVoto());
		urna4.registraVoto(votando.executaVoto());
		
	
		
		//urna.imprimeVoto();
		
		contagem.imprimeTodosVotos();
		contagem.computaVoto();
		
		
		System.out.println(urna.getVotos().get(0).getId());

		
		System.out.println("Numero total de votos: " +contagem.qtdVoto());
		//contagem.qtdVoto();
		//System.out.println(contagem.resultado());
		contagem.resultado();
		
		
	
		

	}

}
