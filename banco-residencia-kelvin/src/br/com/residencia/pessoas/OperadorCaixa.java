package br.com.residencia.pessoas;

public class OperadorCaixa extends Funcionario {
	
	public double getSalario(Funcionario funcionario){
		return this.salario += funcionario.getSalario() * 0.10;	
	}
	
	
	
	
}
