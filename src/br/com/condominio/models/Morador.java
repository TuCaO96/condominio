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

    private Tipo Tipo;

    public int getId() {
        return Id;
    }

    private void setId(int id) {
        Id = id;
    }

    private Usuario getUsuario() {
        return Usuario;
    }

    public void setUsuario(Usuario usuario) {
        Usuario = usuario;
    }

    private Tipo getTipo() {
        return Tipo;
    }

    public void setTipo(Tipo tipo) {
        Tipo = tipo;
    }

    private int getApartamento() {
        return Apartamento;
    }

    public void setApartamento(int apartamento) {
        Apartamento = apartamento;
    }

    private String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public Morador getById(int id) {
        Connection con = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@186.249.13.156:1521:xe", "poo", "poo");

            String sql = "SELECT * FROM morador WHERE id = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            Morador[] moradores = new Morador[0];
            while (rs.next()) {
                moradores[0].setId(rs.getInt("id"));
                moradores[0].setNome(rs.getString("nome"));
                moradores[0].setApartamento(rs.getInt("apartamento"));
            }

            return moradores[0];

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public boolean salva() {

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
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }


    }

}
