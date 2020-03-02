package myVote;

import java.util.ArrayList;
import java.util.Scanner;

public class Votando2 {
	
	private Login login;
	private ArrayList<Chapa> chapas;
	
	
	public Votando2(Login login, ArrayList<Chapa> chapas) {
		this.login = login;
		this.chapas = chapas;
		
	}


	public Login getLogin() {
		return login;
	}


	public void setLogin(Login login) {
		this.login = login;
	}
	
	
	public void votacao(){
		Scanner in = new Scanner(System.in); //Scanner
		//Voto voto = new Voto();
		
		
		
	}

}
