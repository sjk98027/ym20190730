package employee.common;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {

	public static Connection getConnect() {
		String user = "hr";
		String pw = "hr";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			return conn = DriverManager.getConnection(url, user, pw);
		} catch (Exception e) {
			e.getStackTrace();
		}

		return conn;
	}

}
