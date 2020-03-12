package br.com.model;

import br.com.utility.ControleId;

public class Voto {
	
	private int id;
	private Chapa chapa;
	
	
	public Voto(Chapa chapa) {
		this.chapa = chapa;
		this.id = ControleId.getId();
		}
	
	public Voto() {
		this.id = ControleId.getId();
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Chapa getChapa() {
		return chapa;
	}

	public void setChapa(Chapa chapa) {
		this.chapa = chapa;
	}

	@Override
	public String toString() {
		return "Voto [chapa=" + chapa + "]";
	}
	
	
	
	
	
	
	//teste
	
	

}
