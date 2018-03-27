package model;

public class Socio extends Pessoa {
	
	private String codigo;
	private float milhagemTotal;
	

	public Socio(String nome, String cpf, int idade, char genero, String codigo) {
		super(nome, cpf, idade, genero);
		this.codigo = codigo;
		this.milhagemTotal = 0;
	}

	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public float getMilhagemTotal() {
		return milhagemTotal;
	}


	public void setMilhagemTotal(float milhagemTotal) {
		this.milhagemTotal = milhagemTotal;
	}
	
	
}
