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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Voto> getVotos() {
		return votos;
	}

	public void setVotos(List<Voto> votos) {
		this.votos = votos;
	}

	@Override
	public String toString() {
		return "Urna [id=" + id + ", votos=" + votos + "]";
	}
	
	public void registraVoto(Voto voto) {
		votos.add(voto);
	}
	
	public void imprimeVoto() {
		
		for(int i = 0; i<votos.size(); i++) {
			System.out.println("Voto " +i +": " +votos.get(i).toString());
			
		}
		
	}
	

}
