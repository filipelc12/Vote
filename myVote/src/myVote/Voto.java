package myVote;

public class Voto {
	
	private int id = 0;
	private Chapa chapa;
	
	public Voto(Chapa chapa) {
		id = id++;
		this.chapa = chapa; 
	}
	
	public Voto() {
		this.id = id++;
		
		
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
	
	
	// Imprime as informações dos votos
	public String imprimir() {
		return "Nome da Chapa: " +chapa.getNomeChapa() +"\nNome Da Chapa: " +chapa.getNomeChapa();
	}
	
	

}
