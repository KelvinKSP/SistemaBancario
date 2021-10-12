package br.com.residencia.main;

import br.com.residencia.pessoas.*;

import java.text.DecimalFormat;

import br.com.residencia.contas.Conta;
import br.com.residencia.contas.ContaCorrente;
import br.com.residencia.contas.ContaCorrenteEspecial;
import br.com.residencia.contas.ContaPoupanca;
import br.com.residencia.contas.ContaPoupancaEspecial;

public class Principal {

	public static void main(String[] args) {
		
		DecimalFormat decimal = new DecimalFormat("0.00");
		
		OperadorCaixa operador = new OperadorCaixa();
		Gerente gerente = new Gerente();
		
		operador.setSalario(1500);
		gerente.setSalario(30000);
		
		
		System.out.println("------------------------------------");
		
		System.out.println("O salário do operador com bonificação = " + decimal.format(operador.getSalario(operador))  
			+ "\nO salário do gerente com bonificação = " + decimal.format(gerente.getSalario(gerente)));
		
		
	}


}
	