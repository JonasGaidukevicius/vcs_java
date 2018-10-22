package lt.gaidukevicius.duombazes_projektas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException {
		
		
		// load the sqlite-JDBC driver using the current class loader
	    Class.forName("org.sqlite.JDBC");
	    
	    Connection connection = null;
	    try
	    {
	      // create a database connection
	      connection = DriverManager.getConnection("jdbc:sqlite:C:/Users/jgaid/Documents/Vilnius coding school/2. Java mokymai 2018.08.09/vcs_java/Duombaze/db.db");
	      
	      // - pavyzdys - "jdbc:sqlite:C:/work/mydatabase.db"
	      Statement statement = connection.createStatement();
	      statement.setQueryTimeout(30);  // set timeout to 30 sec.
	      
	      /*statement.executeUpdate("drop table if exists person");
	      statement.executeUpdate("create table person (id integer, name string)");
	      statement.executeUpdate("insert into person values(1, 'leo')");
	      statement.executeUpdate("insert into person values(2, 'yui')");*/
	      
	      statement.executeUpdate("insert into ZMONES values('', 'Kazys', '858585')");
	      
	      
	      ResultSet rs = statement.executeQuery("select * from zmones");
	      while(rs.next())
	      {
	        // read the result set
	    	  System.out.println("id = " + rs.getInt("id"));
	    	  System.out.println("vardas = " + rs.getString("Vardas"));
	    	  
	       
	      }
	    }
	    catch(SQLException e)
	    {
	      // if the error message is "out of memory", 
	      // it probably means no database file is found
	      System.err.println(e.getMessage());
	    }
	    finally
	    {
	      try
	      {
	        if(connection != null)
	          connection.close();
	      }
	      catch(SQLException e)
	      {
	        // connection close failed.
	        System.err.println(e);
	      }
	    }
	  		
	}

}
