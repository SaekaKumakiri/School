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

	public ResultSet findAll(String ID){
		try {

			String sql = "select A.staff_ID, A.schedule_ID, B.school_ID, B.start_date, C.school_name from attend A, schedule B, school C where " + ID + " = A.staff_ID and A.schedule_ID = B.schedule_ID and B.school_ID = C.school_ID and A.attend_flag = '0'";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			rs = pStmt.executeQuery();

		}catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
		return rs;
	}

}
