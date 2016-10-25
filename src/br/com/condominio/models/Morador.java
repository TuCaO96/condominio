package br.com.condominio.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author 71500286 - Arthur Mendonça Ribeiro <71500286@aluno.faculdadecotemig.br>
 * @author 71401377 - João Vitor Guimarães Gomes <71401377@aluno.faculdadecotemig.br>
 */

public class Morador {

    private int Id;

    private Usuario Usuario;

    private int Apartamento;

    private String Nome;

    private Tipo Tipo;

    public int getId() {
        return Id;
    }

    public Usuario getUsuario() {
        return Usuario;
    }

    public void setUsuario(Usuario usuario) {
        Usuario = usuario;
    }

    public Tipo getTipo() {
        return Tipo;
    }

    public void setTipo(Tipo tipo) {
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

    public boolean salva(){

        Connection con = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@186.249.13.156:1521:xe", "poo", "poo");

            String sql = "INSERT INTO morador VALUES (null, ?, ?, ?, ?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            //id usuario
            stmt.setInt(1, this.getUsuario().getId());
            //apartamento
            stmt.setInt(2, this.getApartamento());
            //nome
            stmt.setString(3, this.getNome());
            //tipo
            stmt.setInt(4, this.getTipo().getId());

            stmt.execute();
            return true;

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            return false;
        } finally{
            if(con != null){
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }


    }

}
