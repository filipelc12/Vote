
package br.com.teste;
import br.com.myvote.Login;
import br.model.control.Votando;

import java.util.ArrayList;
import java.util.List;

import br.com.model.*;

public class Teste {
	
	public static void main(String[] args) {
		
		List<Chapa> chapas = new ArrayList<Chapa>();
		
		
		Chapa chapa1 = new Chapa("PT", 13);
		Chapa chapa2 = new Chapa("PTB", 12);
		
		chapas.add(chapa1);
		chapas.add(chapa2);
		
		Votando votando = new Votando(chapas);
		
		votando.toString();
		System.out.println(votando.toString());
		
		
		
		
		
		

	}

}
