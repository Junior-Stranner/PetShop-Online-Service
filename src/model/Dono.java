package model;

import java.util.Date;

public class Dono {

	private String nome;
	private int codigoDono;
	private String apelido;
	private Long dataNascimentoDono;
	private  String animal;
	
	
	public Dono() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Dono(String nome, int codigoDono, String apelido, Long dataNascimentoDono, String animal) {
		super();
		this.nome = nome;
		this.codigoDono = codigoDono;
		this.apelido = apelido;
		this.dataNascimentoDono = dataNascimentoDono;
		this.animal = animal;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getCodigoDono() {
		return codigoDono;
	}


	public void setCodigoDono(int codigoDono) {
		this.codigoDono = codigoDono;
	}


	public String getApelido() {
		return apelido;
	}


	public void setApelido(String apelido) {
		this.apelido = apelido;
	}


	public Long getDataNascimentoDono() {
		return dataNascimentoDono;
	}


	public void setDataNascimentoDono(Long dataNascimentoDono) {
		this.dataNascimentoDono = dataNascimentoDono;
	}


	public String getAnimal() {
		return animal;
	}


	public void setAnimal(String animal) {
		this.animal = animal;
	}
}