package Tela;

import java.sql.Date;
import java.util.Scanner;

import model.Dono;

public class TelaDono {

	static Scanner lerStr = new Scanner(System.in);
	static Scanner lerInt = new Scanner(System.in);
	static Scanner lerLong= new Scanner(System.in);

	public static void lerDadosCliente(Dono dono) {
		System.out.println(dono.getCodigo());

		System.out.println("Digite o Nome ");
		String nome = lerStr.nextLine(); 

		System.out.println(" Digite seu Apelido ");
		String apelido = lerStr.nextLine(); 

		System.out.println("Digite sua Data de Nascimento ");
		long dataNascimento = Long.parseLong(lerLong.nextLine()); 

		System.out.println("Digite Animais de Estimação");
		String pet = lerStr.nextLine(); 

		try {
			dono.setCodigo(1);
			dono.setNome(nome);
			dono.setApelido(apelido);
			dono.setDataNascimento(dataNascimento);
			dono.setPet(pet);

		}
		catch (NullPointerException erro) {
			System.out.println("Erro na instanciação de objeto");
		}
	}

	public static int menuCadastroDono() {
		System.out.println("\n Cadastro Dono "
				+ "\n 1 - Cadastrar"
				+ "\n 2 - Mostrar Dados Dono"
				+ "\n 3 - Voltar"
				+ "\n 4 - Finalizar Sistema");
		return lerInt.nextInt();

	}

/*	public static int lerCodigo(Dono dono) {
		for(dono.setCodigo(dono.getCodigo()); dono.getCodigo() < 100;dono.setCodigo(+1)) {

			
		}
		return dono.getCodigo();
	}*/
}
