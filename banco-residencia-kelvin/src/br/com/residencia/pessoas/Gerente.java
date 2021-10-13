package br.com.residencia.pessoas;

public class Gerente extends Funcionario {

	public double getSalario(){
		return this.salario += getSalario();	
	}
	
	public double getBonificacao() {
		return this.bonificacao = (this.salario * 0.15);
	}
	

	
}
