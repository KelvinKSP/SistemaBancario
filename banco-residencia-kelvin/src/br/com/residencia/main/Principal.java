package br.com.residencia.main;

import br.com.residencia.pessoas.*;

import java.text.DecimalFormat;
import java.util.Random;

import br.com.residencia.contas.Conta;
import br.com.residencia.contas.ContaCorrente;
import br.com.residencia.contas.ContaCorrenteEspecial;
import br.com.residencia.contas.ContaPoupanca;
import br.com.residencia.contas.ContaPoupancaEspecial;

public class Principal {

	public static void main(String[] args) {
		
		DecimalFormat decimal = new DecimalFormat("0.00");
		Funcionario funcionario = new Funcionario();
		OperadorCaixa operador = new OperadorCaixa();
		Gerente gerente = new Gerente();
		
		operador.setSalario(1000);
		//alteração no valor do setSalario
		gerente.setSalario(2500);
		
		
		System.out.println("---------------- BANCO CH ----------------------");

		
		System.out.println(gerente.getBonificacao());
		System.out.println(funcionario.getBonificacao());
		
	}


}
	