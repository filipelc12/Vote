package br.com.model;

public class Chapa {
	
	private String nomeChapa;
	private String integrantes;
	private int	   numeroChapa;
	private int	   ContadorDeVoto;
	
	
	public Chapa(String nomeChapa, int numeroChapa) {
		this.nomeChapa = nomeChapa;
		this.numeroChapa = numeroChapa ;
		
		
	}


	@Override
	public String toString() {
		return "Chapa [nomeChapa=" + nomeChapa + ", numeroChapa=" + numeroChapa + "]";
	}
	
	
	
	
	
	
	
	

}
