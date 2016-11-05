package br.com.condominio.controllers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.io.File;

import br.com.condominio.models.Pagamento;

/**
 * @author 71500286 - Arthur Mendonça Ribeiro <71500286@aluno.faculdadecotemig.br>
 * @author 71401377 - João Vitor Guimarães Gomes <71401377@aluno.faculdadecotemig.br>
 */

public class MoradorController {
    
    public List<Pagamento> lerPagamento(File f) {
    	ArrayList<Pagamento> pagamentos = new ArrayList<Pagamento>();
    	
		try {
		    BufferedReader in;
		    in = new BufferedReader(new FileReader(f));
			String linha;
			
			while((linha = in.readLine()) != null){	
				Pagamento pagamento = new Pagamento();
				//pega substring
				pagamento.setCnpj(linha.substring(0, 14));
				System.out.println(pagamento.getCnpj());
				pagamento.setCpf(linha.substring(14, 24));
				System.out.println(pagamento.getCpf());
				pagamento.setData(linha.substring(25, 31));
				System.out.println(pagamento.getData());
				pagamento.setValor(linha.substring(31, 39));
				System.out.println(pagamento.getValor());
				pagamentos.add(pagamento);
				System.out.println("----------");
			}
						
			in.close();
		} catch (Exception eX) {
			System.out.println("Erro ao abrir arquivo. " + eX.getMessage());
		}
		
		return pagamentos;
		
	}

}
