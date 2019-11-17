package myVote;

import java.util.Arrays;
import java.util.ArrayList;


public class Urna {
	
	private int id;
	private int contagemDeVoto;
	private Voto[] votos;
	
	public Urna(Voto votos[]) {
		this.votos = votos;
		
		
		
	} 
	
	public Urna() {
		id++;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getContagemDeVoto() {
		return contagemDeVoto;
	}

	public void setContagemDeVoto(int contagemDeVoto) {
		this.contagemDeVoto = contagemDeVoto;
	}

	public Voto[] getVotos() {
		return votos;
	}

	public void setVotos(Voto[] votos) {
		this.votos = votos;
	}
	
	public int contagemVoto() {
		
		int contagem = 0;
		
		for(int i = 0; i <= votos.length -1; i++) {
			contagem =+ i;
			
		}
			
		contagemDeVoto = contagem;
		
		return contagemDeVoto;
	}
	
	
	public void registraVoto(Voto voto) {
		
		this.votos[votos.length +1] = voto;
		
	}


	

}
