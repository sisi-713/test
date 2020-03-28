package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBC {

	private String url = "jdbc:mysql://127.0.0.1:3306/test";
	private String username = "root";
	private String password = "2879026694xs";

	//连接数据库
	public Connection getCon() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, username, password);
		return con;
	}
	//断开连接
	public void closeCon(java.sql.Connection con) throws Exception {

		if(con != null) {
			con.close();
		}
	}

}
