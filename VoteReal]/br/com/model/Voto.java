/**
 * @author filipe.carvalho
 * 
 * OBJETIVO
 * 
 * Uma classe que contém apenas uma chapa e um ID.
 * O id recever o metodo GetId da classe controleID para que sempre que instanciada seja incrementada o ID
 * 
 */

package br.com.model;

import br.com.utility.ControleId;

public class Voto {
	
	private int id;
	private Chapa chapa;
	
	
	public Voto(Chapa chapa) {
		this.chapa = chapa;
		this.id = ControleId.getId(); //metodo gera ID
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
