package Controll;

import Tela.TelaSistemaPrincipal;

public class SistemaPrincipalPetShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int op = 0;

		do {
			op = TelaSistemaPrincipal.menuSistemaPrincipalPetShop();
			
			switch(op) {
			case 1:CadastroDono.cadastroDono();
			case 2:CadastroPet.cadastroPet();
			case 9:break;
            default :System.out.println("Opção inválida");
			}
		}while(op != 9);
	}

}
