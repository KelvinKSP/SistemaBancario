package br.com.residencia.pessoas;



public class OperadorCaixa extends Funcionario {
	
	public double getSalario(){
		return this.salario += getSalario();	
	}
	
	public double getBonificacao() {
		return this.bonificacao;
	}
	
	
	

	
}
