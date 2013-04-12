package backstage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Database {
	public String executeCheckQuery(String query) throws SQLException{
		
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultset = null;
		String result = "";
		String DRIVER = "com.mysql.jdbc.Driver";
		String URL = "jdbc:mysql://localhost:3306/cs542test";
		String passedInQuery = query;
		
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(URL, "root", "");
			statement = connection.prepareStatement(passedInQuery);
			resultset = statement.executeQuery();

			if (resultset.next())
				result = resultset.getString(1).trim();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			if (resultset != null)
				resultset.close();

			if (statement != null)
				statement.close();

			if (connection != null)
				connection.close();
		}
		
		return result;
	}
	
	public void executeInsertQuery(String query) throws SQLException {
		Connection connection = null;
		PreparedStatement statement = null;
		String DRIVER = "com.mysql.jdbc.Driver";
		String URL = "jdbc:mysql://localhost:3306/cs542test";
		String passedInQuery = query;
		
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(URL, "root", "");
			statement = connection.prepareStatement(passedInQuery);
			statement.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (statement != null)
				statement.close();

			if (connection != null)
				connection.close();
		}
	}
	
	public void executeInsertCarQuery(String query) throws SQLException{
		Connection connection = null;
		PreparedStatement statement = null;
		String DRIVER = "com.mysql.jdbc.Driver";
		String URL = "jdbc:mysql://localhost:3306/cs542test";
		String passedInQuery = query;
		
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(URL, "root", "");
			statement = connection.prepareStatement(passedInQuery);
			statement.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (statement != null)
				statement.close();

			if (connection != null)
				connection.close();
		}
	}
}
