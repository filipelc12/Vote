package myVote;

public class ContaVotos {
	
	private Urna[] urnas;
	
	public ContaVotos() {
		
		this.urnas = urnas;
		
	}
	
	
	
	public int contadorVotos() {
		
		int contaVotos = 0;
		
		for(int i = 0; i<= urnas.length -1; i++) {
			contaVotos =+ urnas[i].contagemVoto();
			
		}
		
		
		return contaVotos;
		
	}
	
	
	

}
