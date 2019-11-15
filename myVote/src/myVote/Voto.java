package myVote;

public class Voto {
	
	private int id;
	private Chapa chapa;
	
	public Voto(Chapa chapa) {
		id = id++;
		this.chapa = chapa; 
	}
	
	public Voto() {
		
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
	
	

}
