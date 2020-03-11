package br.com.model;

import java.util.ArrayList;
import java.util.List;

public class Urna {
	
	private int id;
	private List<Voto> votos = new ArrayList<Voto>();
	
	public Urna(ArrayList<Voto> votos) {
		this.votos = votos;
	}
	
	public Urna() {
		
	}
	

}
