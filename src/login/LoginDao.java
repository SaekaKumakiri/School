package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class LoginDao {

	Connection conn;
	ResultSet rs;

	LoginDao() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root", "donachan38");
	}

	public ResultSet findAll(String ID, String pw){
		try {

			String sql = "SELECT Staff_ID, Password, Staff_name FROM staff WHERE Staff_ID = " + ID + " AND Password = " + pw + " AND Control_Flg = 1";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			rs = pStmt.executeQuery();

		}catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
		return rs;
	}

}
