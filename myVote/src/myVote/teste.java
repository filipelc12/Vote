package myVote;

import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Scanner entrada = new Scanner (System.in);
		char c;
		
		c = entrada.next().charAt(0);
		
		System.out.println(c);
		if(c == 's')
			System.out.println("ok!");
		else
			System.out.println("Not ok");
		*/
		
		//teste 
		System.out.println("Filipe teste");
		
		
		
		
		
		int mais = 1;
		
		Chapa chapa1 = new Chapa("PT", 13);
		Chapa chapa2 = new Chapa("PSDB", 45);
		Chapa chapa3 = new Chapa("Novo", 30);
		
		Chapa chaps[] = {chapa1, chapa2, chapa3};
		
		
		
		Login teste = new Login("arthur", "admin123");
		
		teste.verificaLogin();
		
		//System.out.println(chaps[1].toString());
		
		
		
		Votando vots = new Votando(teste, chaps);
		
		vots.votacao();
		
		//System.out.println("teste");
		
		

		
		

	}

}
