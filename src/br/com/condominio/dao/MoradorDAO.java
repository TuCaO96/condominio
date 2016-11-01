package br.com.condominio.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.imageio.plugins.jpeg.JPEGImageWriteParam;

import br.com.condominio.models.Morador;

public class MoradorDAO {
	
	private Connection con;

	public MoradorDAO(Connection con) {
		this.con = Conexao.getConexao();
	}
	
	public List<Morador> buscaTodos() {
		Morador morador = new Morador();
		List<Morador> moradores = null;
        try {
        	
            String sql = "SELECT * FROM morador";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
            	morador.setId(rs.getInt("id"));
            	morador.setNome(rs.getString("nome"));
            	morador.setApartamento(rs.getInt("apartamento"));
            	moradores.add(morador);
            }

            return moradores;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } finally {
        	try {
				con.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
        }

    }
	
	public Morador buscaUm(int id) {
		Morador morador = new Morador();
        try {
            String sql = "SELECT * FROM morador WHERE id = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
            	morador.setId(rs.getInt("id"));
                morador.setNome(rs.getString("nome"));
                morador.setApartamento(rs.getInt("apartamento"));
            }

            return morador;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } finally {
        	try {
				con.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
        }

    }

    public boolean inserir(Morador morador) {
        try {
            String sql = "INSERT INTO morador VALUES (null, ?, ?, ?, ?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            //id usuario
            stmt.setInt(1, morador.getUsuario().getId());
            //apartamento
            stmt.setInt(2, morador.getApartamento());
            //nome
            stmt.setString(3, morador.getNome());
            //tipo
            stmt.setString(4, morador.getTipo());

            stmt.execute();
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
        	try {
				con.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
        }
    }

    public boolean atualizar(Morador morador) {
        try {
            String sql = "UPDATE morador SET (null, ?, ?, ?, ?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            //id usuario
            stmt.setInt(1, morador.getUsuario().getId());
            //apartamento
            stmt.setInt(2, morador.getApartamento());
            //nome
            stmt.setString(3, morador.getNome());
            //tipo
            stmt.setString(4, morador.getTipo());

            stmt.execute();
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
        	try {
				con.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
        }
    }
    
    public boolean deletar(int apartamento){
    	
    	try {
            String sql = "DELETE morador WHERE apartamento = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            //apartamento
            stmt.setInt(1, apartamento);
            stmt.execute();
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
        	try {
				con.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
        }
    }
}
