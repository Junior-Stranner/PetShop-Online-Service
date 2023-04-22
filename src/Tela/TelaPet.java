package Tela;

import java.util.Scanner;

import model.Pet;

public class TelaPet {
	static Scanner lerStr = new Scanner(System.in);
	static Scanner lerInt = new Scanner(System.in);
	static Scanner lerLong = new Scanner(System.in);

	public static void lerCadastroPet(Pet pet) {

		System.out.println(pet.getCodigo());

		System.out.println("Digite a Raça");
		String raca = lerStr.nextLine(); 

		System.out.println("Data de Nascimento");
		Long dataNascimento = Long.parseLong(lerLong.nextLine()); 

		System.out.println("Cor do Pet");
		String cor = lerStr.nextLine(); 

		System.out.println("Peso do Pet");
		String peso = lerStr.nextLine(); 

		System.out.println("Data das Vacinas");
		Long dataVacina = Long.parseLong(lerLong.nextLine()); 

		System.out.println("Tipo de Vacinas");
		String tipoVacina = lerStr.nextLine(); 


		try {

			pet.setCodigo(0);
			pet.setRaca(raca);
			pet.setDataNascimento(dataNascimento);
			pet.setCor(cor);
			pet.setPeso(0);
			pet.setDataVacina(dataVacina);
			pet.setTipoVacina(tipoVacina);
					
		}
		catch (NullPointerException erro) {
			System.out.println("Erro na instanciação de objeto");
		}

	}
	
	public static int menuCadastroPet() {
		System.out.println( "\n Cadastro Pet"
				+ "\n 1 - Cadastrar Pet"
				+ "\n 2 - Mostrar Dados Pet"
				+ "\n 3 - Voltar "
				+ "\n 4 - Finalizar Sistema");
		return lerInt.nextInt();
		
	}
}
