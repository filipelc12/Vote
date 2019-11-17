package myVote;

import java.util.Scanner;


public class Chapa {
	
	private String nomeChapa, integrantes;
	private int numeroChapa;
	private int contadorDeVotos = 0;
	
	
	
	public Chapa(String nomeChapa, int numeroChapa) {
		this.nomeChapa = nomeChapa;
		this.numeroChapa = numeroChapa;
		this.contadorDeVotos = contadorDeVotos;
		
	}
	
	
	
	public Chapa() {
		this.nomeChapa = "Chapa nulo";
		this.numeroChapa = 0;
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



	public int getContadorDeVotos() {
		return contadorDeVotos;
	}



	public void setContadorDeVotos(int contadorDeVotos) {
		this.contadorDeVotos = contadorDeVotos;
	}



	@Override
	public String toString() {
		return "Chapa [nomeChapa=" + nomeChapa + ", integrantes=" + integrantes + ", numeroChapa=" + numeroChapa
				+ ", contadorDeVotos=" + contadorDeVotos + "]";
	}
	
	public String mostraNaUrna() {
		return "Chapa: " +nomeChapa +"\n Numero da chapa: " +numeroChapa;
	}
	
	
	

}
