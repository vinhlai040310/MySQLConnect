package lai.dev;

import java.sql.DriverManager;

public class MainApp {
	
	public static void main(String[] args) {
		final String DB_URL = "jdbc:mysql://localhost:3306/shop";
		final String USER = "ROOT";
		final String PASS = "";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			DriverManager.getConnection(DB_URL, USER, PASS);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
