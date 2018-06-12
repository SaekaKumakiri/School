package login;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class LoginDB {

	ResultSet rs;
	Connection conn;
	List<LoginBean> loginList = new ArrayList<LoginBean>();


	public List<LoginBean> selectUser(String ID, String pw) throws ClassNotFoundException{

	try {

		LoginDao loginDao = new LoginDao();

		rs = loginDao.findAll(ID, pw);

		while(rs.next()) {
		String staffID = rs.getString(1);
		String password = rs.getString(2);
		String staffName = rs.getString(3);

		LoginBean loginBean = new LoginBean();
		loginBean.setStaffId(staffID);
		loginBean.setPassword(password);
		loginBean.setPassword(staffName);
		loginList.add(loginBean);
		}
	}catch(SQLException e) {
		e.printStackTrace();
		return null;
	}finally {
		if(conn != null) {
			try {
				conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
				return null;
			}
		}
	}
	return loginList;
	}

}
