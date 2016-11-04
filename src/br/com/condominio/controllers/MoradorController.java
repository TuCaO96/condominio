package br.com.condominio.controllers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import java.io.File;

import br.com.condominio.models.Morador;
import br.com.condominio.models.Pagamento;

/**
 * @author 71500286 - Arthur Mendonça Ribeiro <71500286@aluno.faculdadecotemig.br>
 * @author 71401377 - João Vitor Guimarães Gomes <71401377@aluno.faculdadecotemig.br>
 */

public class MoradorController {
    
    public List<Pagamento> lerPagamento(File f) {
    	List<Pagamento> pagamentos = null;
    	
		try {
			
		    BufferedReader in;
		    in = new BufferedReader(new FileReader(f));
			String linha = in.readLine();
			System.out.println("Tamanho string: " + linha.length());
			while(linha != null){
				//pega substring
				String cnpj = linha.substring(0, 14);
				String cpf = linha.substring(14, 24);
				String data = linha.substring(25, 31);
				String valor = linha.substring(31, 39);
				//adiciona dados ao objeto
				Pagamento pagamento = new Pagamento();
				pagamento.setCnpj(cnpj);
				pagamento.setCpf(cpf);
				pagamento.setData(data);
				pagamento.setValor(valor);
				pagamentos.add(pagamento);
			}
			
			in.close();
		} catch (Exception eX) {
			System.out.println("Erro ao abrir arquivo. " + eX.getMessage());
		}
		
		return pagamentos;
		
	}

}
