package br.com.residencia.main;

import br.com.residencia.pessoas.*;
import br.com.residencia.contas.Conta;
import br.com.residencia.contas.ContaCorrente;
import br.com.residencia.contas.ContaCorrenteEspecial;
import br.com.residencia.contas.ContaPoupanca;
import br.com.residencia.contas.ContaPoupancaEspecial;

public class Principal {

	public static void main(String[] args) {
		
		Funcionario operador = new Funcionario();
		Gerente gerente = new Gerente();
		
		operador.setSalario(1500);
		gerente.setSalario(1500);
		
		System.out.println("O sal�rio do operador com bonifica��o = " + operador.getSalario() 
			+ "\nO sal�rio do gerente com bonifica��o = " + gerente.getSalario(gerente));
		

	}


}
	