package br.com.condominio.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public abstract class Conexao {
	private static Connection con = null;
	
	public static Connection getConexao(){
	
		try {
			if(con == null || con.isClosed()){
				Class.forName("oracle.jdbc.driver.OracleDriver");
				con = DriverManager.getConnection("jdbc:oracle:thin:@186.249.13.156:1521:xe", "a71500286", "a71500286");
			}
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} finally{
			if(con != null){
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		return con;
	};
}
