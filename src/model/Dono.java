package model;

import java.util.Date;

public class Dono {

	private String nome;
	private int codigo;
	private String apelido;
	private Long dataNascimento;
	private  String pet;
	
	/*public String mostrarDono() {
		return " \n Código : "+codigo
				+ "\n nome :"+nome
				+ "\n Apelido :"+apelido 
				+ "\n Data der Nascimento :"+dataNascimento
				+ "\n Pets : "+pet;
		
		
	}*/
	
	
	public Dono() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Dono(String nome, int codigo, String apelido, Long dataNascimento, String pet) {
		super();
		this.nome = nome;
		this.codigo = codigo;
		this.apelido = apelido;
		this.dataNascimento = dataNascimento;
		this.pet = pet;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getApelido() {
		return apelido;
	}


	public void setApelido(String apelido) {
		this.apelido = apelido;
	}


	public Long getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(Long dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	public String getPet() {
		return pet;
	}


	public void setPet(String pet) {
		this.pet = pet;
	}
}