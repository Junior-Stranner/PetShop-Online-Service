package model;

public class Pet {
	
	private int codigo;
	private String raca;
	private Long dataNascimentoPet;
	private String cor;
	private double peso;
	private Long dataVacina;
	private String tipoVacina;
	
	
	
	public Pet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pet(int codigo, String raca, Long dataNascimentoPet, String cor, double peso, Long dataVacina, String tipoVacina) {
		super();
		this.codigo = codigo;
		this.raca = raca;
		this.dataNascimentoPet = dataNascimentoPet;
		this.cor = cor;
		this.peso = peso;
		this.dataVacina = dataVacina;
		this.tipoVacina = tipoVacina;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public Long getDataNascimentoPet() {
		return dataNascimentoPet;
	}
	public void setDataNascimentoPet(Long dataNascimentoPet) {
		this.dataNascimentoPet = dataNascimentoPet;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public Long getDataVacina() {
		return dataVacina;
	}
	public void setDataVacina(Long dataVacina) {
		this.dataVacina = dataVacina;
	}
	public String getTipoVacina() {
		return tipoVacina;
	}
	public void setTipoVacina(String tipoVacina) {
		this.tipoVacina = tipoVacina;
	}
	
	

}
