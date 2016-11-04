package br.com.condominio.models;

import java.sql.*;

/**
 * @author 71500286 - Arthur Mendonça Ribeiro <71500286@aluno.faculdadecotemig.br>
 * @author 71401377 - João Vitor Guimarães Gomes <71401377@aluno.faculdadecotemig.br>
 */

public class Morador {

    private int Id;

    private Usuario Usuario;

    private int Apartamento;

    private String Nome;
    
    private String Cpf;

    private String Tipo;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public Usuario getUsuario() {
        return Usuario;
    }

    public void setUsuario(Usuario usuario) {
        Usuario = usuario;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public int getApartamento() {
        return Apartamento;
    }

    public void setApartamento(int apartamento) {
        Apartamento = apartamento;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

	public String getCpf() {
		return Cpf;
	}

	public void setCpf(String cpf) {
		Cpf = cpf;
	}

    
}
