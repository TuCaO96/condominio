package br.com.condominio.models;

/**
 * @author 71500286 - Arthur Mendonça Ribeiro <71500286@aluno.faculdadecotemig.br>
 * @author 71401377 - João Vitor Guimarães Gomes <71401377@aluno.faculdadecotemig.br>
 */

public class Usuario {

    private int Id;

    private String Login;

    private String Senha;

    public int getId() {
        return Id;
    }

    public String getLogin() {
        return Login;
    }
    
    public String getSenha() {
        return Senha;
    }

    public void setLogin(String login) {
        Login = login;
    }

    public void setSenha(String senha) {
        Senha = senha;
    }

	public void setId(int id) {
		Id = id;
		
	}
}
