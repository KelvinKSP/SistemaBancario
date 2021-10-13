package br.com.residencia.pessoas;

public class Funcionario {
	
	//Variaiveis 
	protected String nome;
	protected String cpf;
	protected double salario;
	protected double bonificacao;
	
	
	//------- Get e Set ----------
	
	public double getBonificacao() {
		return this.bonificacao = salario * 0.10;
	}

	public void setBonificacao(double bonificacao) {
		this.bonificacao = bonificacao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}



	

	
	
}
