package factory;
// faz as importações de classes necessárias para o funcionamento do programa 
import java.sql.Connection; 
// conexão SQL para Java 
import java.sql.DriverManager; 
// driver de conexão SQL para Java 
import java.sql.SQLException; 
// classe para tratamento de exceções 
public class ConnectionFactory {
     public Connection getConnection() {
		 try {
			return DriverManager.getConnection("jdbc:mysql://127.0.0.1/projetojava","pedro","augustinho48");
		 }         
		 catch(SQLException excecao) {
			throw new RuntimeException(excecao);
		 }
     }
}
