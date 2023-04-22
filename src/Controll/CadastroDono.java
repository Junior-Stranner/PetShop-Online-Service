package Controll;

import java.util.ArrayList;
import java.util.Scanner;

import Tela.TelaDono;
import model.Dono;

public class CadastroDono {
	
	static Scanner lerStr = new Scanner(System.in);
	static ArrayList <Dono> donos = new ArrayList();
	public static void cadastroDono() {

		int op ;
		do {
			op = TelaDono.menuCadastroDono();

			switch(op) {
			case 1: cadastrarDono();break;
			case 2: mostrarDadosDono();break;
			case 3: break;
			case 4:System.out.println("Finalizar Sistema !!");
			default: System.out.println("Opcão Inválida !");
			}
		}while(op != 4);

	}
	private static void mostrarDadosDono() {
		// TODO Auto-generated method stub
		for (Dono dono : donos) {
			System.out.println( " \n Código : "+dono.getCodigo()
					+ "\n nome :"+dono.getNome()
					+ "\n Apelido :"+dono.getApelido() 
					+ "\n Data der Nascimento :"+dono.getDataNascimento()
					+ "\n Pets : "+dono.getPet());
		}
		
	}
	private static void cadastrarDono() {
		// TODO Auto-generated method stub
		Dono d1 = new Dono();
		TelaDono.lerDadosCliente(d1);
		
		donos.add(d1);

	}
}
