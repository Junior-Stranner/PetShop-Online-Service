package Teste;

import Controll.SistemaPrincipalPetShop;
import Tela.TelaPetShop;

public class TesteCadastroPetShop {

	public static void main(String[] args) {
		
		int op ;
		do {
			op = TelaPetShop.menuCadastroDono();

			switch(op) {
			case 1: SistemaPrincipalPetShop.cadastrarDonoPet();break;
			case 2: SistemaPrincipalPetShop.mostrarDadosDonoPet();break;
			case 3: SistemaPrincipalPetShop.pesquisarDono();break;
			case 4: SistemaPrincipalPetShop.pesquisarPet();break;
			case 9: break;
			default: System.out.println("Opcão Inválida !");
			}
		}while(op != 9);

	}


}

