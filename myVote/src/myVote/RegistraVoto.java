package myVote;

public class RegistraVoto {
	
	private int id;
	private int contagemDeVoto;
	private Voto[] votos;
	
	public RegistraVoto(Voto votos[]) {
		this.votos = votos;
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


	

}
