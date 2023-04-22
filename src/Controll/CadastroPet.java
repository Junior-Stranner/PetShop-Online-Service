package Controll;

import java.util.ArrayList;
import java.util.Scanner;

import Tela.TelaPet;
import model.Dono;
import model.Pet;

public class CadastroPet {

	static Scanner lerStr = new Scanner(System.in);
	static ArrayList <Pet> pets = new ArrayList();
	public static void cadastroPet() {
		
		int op = 0;
		
		do {
		
			switch(op) {
			case 1 :cadasrarPet();break;
			case 2 :mostrarDadosPet();break; 
	    	case 3: break;
			case 4:System.out.println("Finalizar Sistema !!");
			default: System.out.println("Opcão Inválida !");
			}
			
		}while(op != 4);
		
	}
	private static void mostrarDadosPet() {
		
		for (Pet pet : pets) {
			
			System.out.println("\n Código : "+pet.getCodigo()
			                  +"\n raça : "+pet.getRaca()
			                  +"\n Data de Nascimento : "+pet.getDataNascimento()
			                  +"\n Cor : "+pet.getCor()
			                  +"\n peso : "+pet.getPeso()
			                  +"\n data de Vacinação : "+pet.getDataVacina()
			                  +"\n Tipo de Vacinas  :"+pet.getTipoVacina());
		}
		
	}
	private static void cadasrarPet() {
		// TODO Auto-generated method stub
		Pet p1 =new Pet();
		
		TelaPet.lerCadastroPet(p1);
		
		pets.add(p1);
	}

}
;