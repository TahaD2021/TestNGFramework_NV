package selenium.basics;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class DBUtilities {

	// Creating private static obj of Connection class
	// it is used to create connection with database
	private static Connection conn;

	// Creating private static obj of Statement class
	// It is used to create a Statement to execute the query
	private static Statement stmt;

	// Creating private static obj of ResultSet class
	// It is used to create a resultset to store query result.
	private static ResultSet resultSet;

	// create db url
	// syntax for db url conection or url string
	// jdbc:typeofdatabase://host:port/databasename
	private static String dbURL = "jdbc:postgresql://localhost:5432/dvdrental";

	// databse user username
	private static String dbUserName = "postgres";

	// databse user password
	private static String dbPassword = "root";

	// sql query
	private static String dbQuery = "select * from public.actor";

	/*
	 * This method creartes connection with DB
	 */

	public static void setupConnection() {

		try {
			conn = DriverManager.getConnection(dbURL, dbUserName, dbPassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/*
	 * This method will execute the query from DB
	 */
	public static void runQuery(String query, String c1, String c2, String c3, String c4) {

		try {

			stmt = conn.createStatement();
			resultSet = stmt.executeQuery(query);

//			CSVWriter csvWriter;
//			File file = new File("C:\\Users\\SDET\\Documents\\Book1.csv"); 
//			try {
//				FileWriter outputfile = new FileWriter(file); 
//				csvWriter = new CSVWriter(outputfile);
//
//				csvWriter.writeAll(resultSet,true);
//				csvWriter.close();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}

//			
			System.out.printf("%-10s %-10s %-10s %-10s\n", c1, c2, c3, c4);

			try {
				while (resultSet.next()) {

					System.out.printf("%-10s %-10s %-10s %-10s\n", resultSet.getString(c1), resultSet.getString(c2),
							resultSet.getString(c3), resultSet.getString(c4));
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void closeConnection() {

		if (conn != null) {
			try {
				conn.close();
			} catch (Exception e) {
			}
		}

	}

}
