package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	public static Connection obterConexao() {

		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cliente", "root", "");
				//System.out.println("Banco de dados conectado com sucesso! ");
		} catch (SQLException e) {
			System.err.println("Falha na conexão com o banco" + e.getMessage());
			e.printStackTrace();
		}
		return con;
	}
}
