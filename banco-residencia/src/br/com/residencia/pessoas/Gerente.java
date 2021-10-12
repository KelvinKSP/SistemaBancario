package br.com.residencia.pessoas;

public class Gerente extends Funcionario {
	
	
	
	public double getSalario(Funcionario funcionario){
		return this.salario += (this.getSalario() * 0.15) + (funcionario.getSalario() * 0.10);
	}
		
}
