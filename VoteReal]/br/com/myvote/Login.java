/**
 * @author filipe.carvalho
 * 
 * Objetivo:
 * Fornecer um login a pessoa para que a mesma possa exercer o voto
 * 
 * Atributos
 * usuario		nome do usuario
 * senha		senha do usuario
 * verificado	Boolean utilizado para confirmar login correto 
 * 
 * 
 * 
 * 
 * 
 */

package br.com.myvote;

import java.util.Scanner;

public class Login {
	
	private String usuario;
	private String senha;
	private Usuario pessoa;
	private boolean verificado;
	
	public Login() {
		
	}
	
	public Login(String usuario, String senha) {
		this.usuario = usuario;
		this.senha = senha;
		this.verificado = verificado;
		
	}
	
	
	
	public String getusuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
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

	
	
	
	
	/*
	 * Metodo verificaLogin
	 * 
	 * O objetivo e fazer com que o usuario digite o login e senha corretos
	 * caso a senha esteja incorreta sera solicitado digitar novamente
	 * 
	 * 
	 * VARIAVEIS
	 * 
	 * in Scanner............Receber Scanner
	 * entradaLogin String...Receber input
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	public void verificaLogin() {
		Scanner in = new Scanner(System.in);
		System.out.println("Informe seu login: "); 
		String entradaLogin = in.nextLine();
		if(!entradaLogin.equals(usuario)) 
			System.out.println("\n Usuario nao identificado!");
		else {
			System.out.println("Digite sua senha: ");
			String entradaSenha = in.nextLine();
			while(!entradaSenha.equals(senha) && !verificado) {
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
