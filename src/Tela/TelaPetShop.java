package Tela;

import java.sql.Date;
import java.util.Scanner;

import Controll.SistemaPrincipalPetShop;

public class TelaPetShop {

	static Scanner lerInt = new Scanner(System.in);

	public static int menuCadastroDono() {
		System.out.println("\n Cadastro Dono/Pet \n"
				+ "\n 1 - Cadastrar Dono&Pet"
				+ "\n 2 - Mostrar Dados Dono&Pet"
				+ "\n 3 - Pesquisar Dono"
				+ "\n 4 - Pesquisar Pet"
				+ "\n 9 - Voltar");
		return lerInt.nextInt();
	}	

}
