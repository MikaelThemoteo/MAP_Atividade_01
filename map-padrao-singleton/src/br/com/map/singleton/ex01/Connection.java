package br.com.map.singleton.ex01;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Connection {
	
	private static Connection instance;
	private static java.sql.Connection conn;
	public String valor;
	
	private Connection(String valor)  {
		
		this.valor = valor;
		
		//Criar uma conexão com o banco de dados H2
		try {
			Class.forName ("org.h2.Driver"); 
			java.sql.Connection conn = DriverManager.getConnection ("jdbc:h2:~/test", "sa","");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
	} 
		
	}
	
	public static Connection getInstance(String valor){
		
		Connection result = instance;
		
		if (result != null) {
            return result;
        }
		
		synchronized(Connection.class) {
            if (instance == null) {
                instance = new Connection(valor);
            }
            return instance;
		}
	
	}
}
