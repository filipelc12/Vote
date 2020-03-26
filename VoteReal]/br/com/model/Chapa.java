package br.com.model;

import br.com.utility.ControleId;

public class Chapa {
	
	private String nomeChapa;
	private String integrantes;
	private int	   numeroChapa;
	private int	   ContadorDeVoto;
	private int    id;
	
	
	public Chapa(String nomeChapa, int numeroChapa) {
		this.nomeChapa = nomeChapa;
		this.numeroChapa = numeroChapa ;
		this.id = ControleId.getId();
		
		
	}


	@Override
	public String toString() {
		return "Chapa [nomeChapa=" + nomeChapa + ", numeroChapa=" + numeroChapa + "]";
	}


	public String getNomeChapa() {
		return nomeChapa;
	}


	public void setNomeChapa(String nomeChapa) {
		this.nomeChapa = nomeChapa;
	}


	public String getIntegrantes() {
		return integrantes;
	}


	public void setIntegrantes(String integrantes) {
		this.integrantes = integrantes;
	}


	public int getNumeroChapa() {
		return numeroChapa;
	}


	public void setNumeroChapa(int numeroChapa) {
		this.numeroChapa = numeroChapa;
	}


	public int getContadorDeVoto() {
		return ContadorDeVoto;
	}


	public void setContadorDeVoto(int contadorDeVoto) {
		ContadorDeVoto = contadorDeVoto;
	}


	public int getId() {
		return id;
	}
	
	
	
	
	
	
	
	
	

}
