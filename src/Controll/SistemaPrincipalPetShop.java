package Controll;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

import Tela.TelaPetShop;
import model.Dono;
import model.Pet;

public class SistemaPrincipalPetShop {

	static Scanner lerInt = new Scanner(System.in);
	static Scanner lerStr = new Scanner(System.in);
	static Scanner lerLong= new Scanner(System.in);

	static ArrayList <Dono> donos = new ArrayList();
	static ArrayList <Pet> pets = new ArrayList();


	public static void mostrarDadosDonoPet() {

		for (Dono dono : donos) {
			for (Pet pet : pets) {

				System.out.println("\n Dados Pessoais \n"
						+"\n ==============================================\n"
						+ "\n Dono \n"
						+ "\n Código : "+dono.getCodigoDono()
						+ "\n Nome do Dono : "+dono.getNome()
						+ "\n Apelido : "+dono.getApelido()
						+ "\n Data de Nascimento do Dono \n : "+dono.getDataNascimentoDono()
						+ "\n Pet/s : "+dono.getAnimal()
						+ "\n =============================================\n"
						+ "\n Pet/s \n"
						+ "\n Código : "+pet.getCodigo()
						+ "\n Raça : "+pet.getRaca()
						+ "\n Data de Nascimento : "+pet.getDataNascimentoPet()
						+ "\n Cor : "+pet.getCor()
						+ "\n Peso : "+pet.getPeso()
						+ "\n Data de Vacinação : "+pet.getDataVacina()
						+ "\n Tipo de Vacina : "+pet.getTipoVacina()
						+ "\n ==============================================\n");
			}
		}

	}

	public static void cadastrarDonoPet( ) {
		int codDono = +1;
		int codPet = +1;

		System.out.println("\n Código : "+codDono);

		System.out.println("Digite o Nome ");
		String nome = lerStr.nextLine(); 

		System.out.println(" Digite seu Apelido ");
		String apelido = lerStr.nextLine(); 

		System.out.println("Digite sua Data de Nascimento ");
		long dataNascimentoDono = Long.parseLong(lerLong.nextLine()); 

		System.out.println("Digite Animais de Estimação");
		String animal = lerStr.nextLine(); 


		System.out.println("\n==================="
				+ "\n Cadastro do Pet \n");


		System.out.println("Codigo : "+codPet);

		System.out.println("Digite a Raça");
		String raca = lerStr.nextLine(); 

		System.out.println("Data de Nascimento");
		Long dataNascimentoPet= Long.parseLong(lerLong.nextLine()); 

		System.out.println("Cor do Pet");
		String cor = lerStr.nextLine(); 

		System.out.println("Peso do Pet");
		String peso = lerStr.nextLine(); 

		System.out.println("Data das Vacinas");
		Long dataVacina = Long.parseLong(lerLong.nextLine()); 

		System.out.println("Tipo de Vacinas");
		String tipoVacina = lerStr.nextLine(); 

		Dono d1 = new Dono(nome,codDono, apelido,dataNascimentoDono,animal);
		Pet p1 = new Pet(codPet, raca,dataNascimentoPet,cor,0,dataVacina, tipoVacina);

		donos.add(d1);
		pets.add(p1);

	}

	public static void pesquisarDono() {

		System.out.println("Digite Nome do Dono");
		String nomeDono =lerStr.nextLine();

		for (Dono dono : donos) {
			for (Pet pet : pets) {

				if(dono.getNome().equalsIgnoreCase(nomeDono)) {
					
					System.out.println( "\n Dono \n"
							+ "\n Código : "+dono.getCodigoDono()
							+ "\n Nome do Dono : "+dono.getNome()
							+ "\n Apelido : "+dono.getApelido()
							+ "\n Data de Nascimento do Dono \n : "+dono.getDataNascimentoDono()
							+ "\n Pet/s : "+dono.getAnimal()
							+ "\n =============================================\n"
							+ "\n Pet/s \n"
							+ "\n Código : "+pet.getCodigo()
							+ "\n Raça : "+pet.getRaca()
							+ "\n Data de Nascimento : "+pet.getDataNascimentoPet()
							+ "\n Cor : "+pet.getCor()
							+ "\n Peso : "+pet.getPeso()
							+ "\n Data de Vacinação : "+pet.getDataVacina()
							+ "\n Tipo de Vacina : "+pet.getTipoVacina()
							+ "\n ==============================================\n");
				}

			}
		}
	}

	public static void pesquisarPet() {

		System.out.println("Digite Nome do Pet");
		String nomePet =lerStr.nextLine();

		for (Dono dono : donos) {
			for (Pet pet : pets) {

				if(dono.getNome().equalsIgnoreCase(nomePet)) {
					
					System.out.println("\n Pet/s \n"
							+ "\n Código : "+pet.getCodigo()
							+ "\n Raça : "+pet.getRaca()
							+ "\n Data de Nascimento : "+pet.getDataNascimentoPet()
							+ "\n Cor : "+pet.getCor()
							+ "\n Peso : "+pet.getPeso()
							+ "\n Data de Vacinação : "+pet.getDataVacina()
							+ "\n Tipo de Vacina : "+pet.getTipoVacina()
							+ "\n ==============================================\n"
							+ "\n Dono \n"
							+ "\n Código : "+dono.getCodigoDono()
							+ "\n Nome do Dono : "+dono.getNome()
							+ "\n Apelido : "+dono.getApelido()
							+ "\n Data de Nascimento do Dono \n : "+dono.getDataNascimentoDono()
							+ "\n Pet/s : "+dono.getAnimal()
					        + "\n ==============================================\n");
				}

			}
		}
	}
}

