package br.com.myvote;

public class Login {
	
	private Usuario usuario;
	private String senha;
	private boolean verificado;
	
	public Login() {
		
	}
	
	public Login(String senha) {
		this.senha = senha;
		
	}
	
	
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public boolean isVerificado() {
		return verificado;
	}
	public void setVerificado(boolean verificado) {
		this.verificado = verificado;
	}
	
	
	
	
	

}
