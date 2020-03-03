package br.model.control;
import java.util.ArrayList;
import java.util.List;

import br.com.model.Chapa;
import br.com.myvote.*;

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
	
	
	
	
	
	
	
	
	

}
