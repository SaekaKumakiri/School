package entryList;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EntryLsitDao {

	Connection conn;
	ResultSet rs;

	EntryLsitDao() throws ClassNotFoundException, SQLException{
		Class.forName("org.h2.Driver");
	conn = DriverManager.getConnection("jdbc:h2:file:C:/school", "root", "donachan38");
	}

	public ResultSet findAll(){
		try {

			String sql = "";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			rs = pStmt.executeQuery();

		}catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
		return rs;
	}

}
