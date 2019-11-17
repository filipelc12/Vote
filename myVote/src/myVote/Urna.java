package myVote;

import java.util.Arrays;
import java.util.ArrayList;


public class Urna {
	
	private int id;
	private int contagemDeVoto;
	private static ArrayList<Voto> votos = new ArrayList<>();
	

	

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
	
	
	public ArrayList<Voto> getVotos() {
		return votos;
	}

	public void setVotos(ArrayList<Voto> votos) {
		this.votos = votos;
	}

	//metodo que adiciona votos na urna
	public void adicionaVotos(Voto voto) {
		
		

		votos.add(voto);
		
		
	}
	
	
	static public void adicionar(Voto voto) {
		votos.add(voto);
	}
	
	//lista votos da urna
	static public String lista() {
		String saida = "";
		
		int i = 0;
		
		for(Voto v: votos) {
			saida += "\n====== VOTO NUMERO: " +(i++) +"=====\n";
			saida += v.imprimir();
		}
		
		
		return saida;
		
		
	}
	
	public int contaVoto() {
		int votoContador = 1;
		
		int i = 0;
		
		for(Voto v: votos) {
			votoContador += i++;
		}
		
		contagemDeVoto = votoContador;
		
		return votoContador;
		
		
	}
	
	// passa os votos da urna para o contato de votos de cada chapa
	public int passaVotoContador() {
		
		int contador = 0;
		int i = 0;
		
		for(Voto v: votos) {
			
		}
		
		
		
		
		return contador;
	}
	
	
	

}
