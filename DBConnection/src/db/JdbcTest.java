package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcTest {

	//필드
	static String driverClass = "oracle.jdbc.OracleDriver"; //오라클 드라이버
	static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	static String username = "system";
	static String password = "12345";
	
	
	public static void main(String[] args) {
		Connection conn = null;

		try {
			Class.forName(driverClass);
			System.out.println("Oracle 드라이버 로딩");
			conn = DriverManager.getConnection(url, username, password);
			System.out.println("Connection 객체 생성: " + conn);
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
