package Tela;

import java.util.Scanner;

public class TelaSistemaPrincipal {
	static Scanner lerInt =new Scanner(System.in);

	public static int menuSistemaPrincipalPetShop() {
		
		System.out.println("\n Bem Vindos a Peti9 \n"
				+ "\n 1 - Cadastrar Dono"
				+ "\n 2 - Cadastrar Pet"
				+ "\n 9 - Sair Do Sistema");
		return lerInt.nextInt();
		
	}
}
