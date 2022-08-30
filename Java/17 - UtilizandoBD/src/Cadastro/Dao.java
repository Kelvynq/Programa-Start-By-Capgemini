//Conectando o bd 
//Build Path - Configure Build Path - Libaries - ClassPath - Add external JARs - Seleciona o arquivo

// Classe responsável pela conexão com o bd
package Cadastro;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Dao {
	Connection con;  // Conexao ao Banco de Dados
	PreparedStatement stmt; // Acessa a Tabela ( insert, update, delete , select)
	ResultSet rs; // Consulta a Tabela( select )
	CallableStatement call; // Procedures e Function
	
	
	//open => abre o banco
	public void open() throws Exception{
	    String url = "jdbc:mysql://localhost:3306/cadastros";
	    String user = "root";
	    String password = "***";
	    try {
	    	//nome do drive
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        con = DriverManager.getConnection(url, user, password);      
	    } catch (SQLException | ClassNotFoundException ex) {
	        System.out.println("Erro ao conectar com o banco");
	    }
	}
	
	public void close() throws Exception{		
		con.close();
	}
}