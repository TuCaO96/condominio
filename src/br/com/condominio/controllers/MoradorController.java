package br.com.condominio.controllers;

import br.com.condominio.models.Morador;
import br.com.condominio.models.Tipo;
import br.com.condominio.models.Usuario;

/**
 * @author 71500286 - Arthur Mendonça Ribeiro <71500286@aluno.faculdadecotemig.br>
 * @author 71401377 - João Vitor Guimarães Gomes <71401377@aluno.faculdadecotemig.br>
 */

public class MoradorController {

    public boolean criaMorador(Usuario usuario, Tipo tipo, int apartamento, String nome){

        Morador moradorModel = new Morador();
        moradorModel.setUsuario(usuario);
        moradorModel.setTipo(tipo);
        moradorModel.setNome(nome);
        moradorModel.setApartamento(apartamento);

        return moradorModel.salva();
    }

    public boolean atualizaMorador(int id, Usuario usuario, Tipo tipo, int apartamento, String nome){

        Morador moradorModel = new Morador();
        moradorModel.setUsuario(usuario);
        moradorModel.setTipo(tipo);
        moradorModel.setNome(nome);
        moradorModel.setApartamento(apartamento);

        return moradorModel.salva();
    }

}
