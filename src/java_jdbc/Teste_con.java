package java_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Teste_con {

	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/";
		String user = "root";
		String senha = "";
		
		try {
			Connection conexao = DriverManager.getConnection(url, user, senha);
			System.out.println("Deu certo!");
			
			conexao.close();
		} catch (Exception e) {	
			System.out.println("Deu errado pq? " + e);
		}
	}
}