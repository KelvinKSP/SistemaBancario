package br.com.residencia.pessoas;

public class Gerente extends Funcionario {
	
	
	public double getSalario(Funcionario funcionario){
		return this.salario += (this.salario * 0.15) + (funcionario.salario * 0.10);
	}
	
	
	
}
