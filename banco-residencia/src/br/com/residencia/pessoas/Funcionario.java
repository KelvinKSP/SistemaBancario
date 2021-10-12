package br.com.residencia.pessoas;

public class Funcionario {
	
	//Variaiveis 
	protected String nome;
	protected String cpf;
	protected double salario;
	
	
	//------- Get e Set ----------
	public double getSalario() {
		return salario + (salario * 0.10);
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}



	

	
	
}
