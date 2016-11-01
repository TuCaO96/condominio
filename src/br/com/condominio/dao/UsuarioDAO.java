package br.com.condominio.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.imageio.plugins.jpeg.JPEGImageWriteParam;

import br.com.condominio.models.Usuario;

public class UsuarioDAO {
	
	private Connection con;

	public UsuarioDAO(Connection con) {
		this.con = Conexao.getConexao();
	}
	
	public List<Usuario> buscaTodos() {
		Usuario usuario = new Usuario();
		List<Usuario> usuarios = null;
        try {
        	
            String sql = "SELECT * FROM usuario";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
            	usuario.setId(rs.getInt("id"));
            	usuario.setLogin("login");
            	usuario.setSenha("senha");
            	usuarios.add(usuario);
            }

            return usuarios;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }
	
	public Usuario buscaUm(int id) {
		Usuario usuario = new Usuario();
        try {
            String sql = "SELECT * FROM morador WHERE id = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
            	usuario.setId(rs.getInt("id"));
            	usuario.setLogin("login");
            	usuario.setSenha("senha");
            }

            return usuario;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }

    public boolean inserir(Usuario usuario) {
        try {
            String sql = "INSERT INTO usuario VALUES (null, ?, ?, ?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            //id usuario
            stmt.setInt(1, usuario.getId());
            //apartamento
            stmt.setString(2, usuario.getLogin());
            //nome
            stmt.setString(3, usuario.getSenha());

            stmt.execute();
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean atualizar(Usuario usuario) {
        try {
        	String sql = "INSERT INTO usuario VALUES (null, ?, ?, ?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            //id usuario
            stmt.setInt(1, usuario.getId());
            //apartamento
            stmt.setString(2, usuario.getLogin());
            //nome
            stmt.setString(3, usuario.getSenha());

            stmt.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean deletar(int id){
    	
    	try {
            String sql = "DELETE usuario WHERE id = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            //apartamento
            stmt.setInt(1, id);
            stmt.execute();
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
