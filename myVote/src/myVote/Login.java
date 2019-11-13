package myVote;

import java.util.Scanner;

public class Login {
	
	private String nomelogin;
	private String senha;
	private boolean verificado;
	
	public Login(String nomelogin, String senha) {
		this.nomelogin = nomelogin;
		this.senha = senha;
		
	}

	public String getNomelogin() {
		return nomelogin;
	}

	public void setNomelogin(String nomelogin) {
		this.nomelogin = nomelogin;
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

	/* Classe utilizada para verifcar o login do usuario
	 * Retorna o boolen verificado como true 
	 * 
	 */
	public void verificaLogin() {
		Scanner in = new Scanner(System.in);
		System.out.println("Informe seu login: "); 
		String entradaLogin = in.nextLine();
		if(!entradaLogin.equals(nomelogin)) 
			System.out.println("\n Usuario nao identificado!");
		else {
			System.out.println("Digite sua senha: ");
			String entradaSenha = in.nextLine();
			while(!entradaSenha.equals(senha)) {
				System.out.println("Senha incorreta! \n digite novamente!");
				entradaSenha = in.nextLine();
			}
			if(entradaSenha.equals(senha)) {
				System.out.println("senha correta!");
				verificado = true;
			}
			
		}
			
			
	}
	
	
	
	

}
