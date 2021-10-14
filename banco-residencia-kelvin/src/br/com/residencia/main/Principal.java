package br.com.residencia.main;

import br.com.residencia.pessoas.*;

import java.text.DecimalFormat;
import java.util.Random;
import java.io.IOException;
import br.com.residencia.IO.LeituraEscrita;
import br.com.residencia.contas.Conta;
import br.com.residencia.contas.ContaCorrente;
import br.com.residencia.contas.ContaCorrenteEspecial;
import br.com.residencia.contas.ContaPoupanca;
import br.com.residencia.contas.ContaPoupancaEspecial;

public class Principal {

	public static void main(String[] args) throws IOException {
		
		LeituraEscrita.leitor("entradaDados.txt");
		LeituraEscrita.escritor("./temp/");
		
		
	}


}
	