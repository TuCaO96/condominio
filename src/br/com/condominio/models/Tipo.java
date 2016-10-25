package br.com.condominio.models;

/**
 * @author 71500286 - Arthur Mendonça Ribeiro <71500286@aluno.faculdadecotemig.br>
 * @author 71401377 - João Vitor Guimarães Gomes <71401377@aluno.faculdadecotemig.br>
 */
public class Tipo {

    private int Id;

    private String Tipo;

    public int getId() {
        return Id;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public String getTipo() {
        return Tipo;
    }
}
