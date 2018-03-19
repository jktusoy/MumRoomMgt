/**
 * 
 */
package co.mum.roommgt.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseConnectionFactory {

	private static final Logger LOGGER = Logger.getLogger(DatabaseConnectionFactory.class.getName());
	private static String dbURL = "jdbc:mysql://localhost:3306/roommgt";

	public DatabaseConnectionFactory() {
		super();
		LOGGER.setLevel(Level.FINE);
	}

	public static Connection createConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Error: unable to load driver class!");
			LOGGER.fine("Error: unable to load driver class!");
			System.exit(1);
		}
		try {
			con = DriverManager.getConnection(dbURL);
		} catch (SQLException e) {
			System.out.println("Error: While Creating connection to database");
			LOGGER.fine("Error: unable to load driver class!");
			System.exit(1);
		}
		return con;
	}

}
