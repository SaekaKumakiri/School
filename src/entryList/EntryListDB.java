package entryList;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class EntryListDB {

	ResultSet rs;
	Connection conn;
	List<EntryListBean> entryList = new ArrayList<EntryListBean>();


	public List<EntryListBean> selectEntry(String ID) throws ClassNotFoundException{

	try {

		EntryLsitDao List = new EntryLsitDao();

		rs = List.findAll(ID);

		while(rs.next()) {
		String staffID = rs.getString(1);
		String scheduleID = rs.getString(2);
		String schoolID = rs.getString(3);
		String entryDate = rs.getString(4);
		String entrySchool = rs.getString(5);

		EntryListBean entryListBean = new EntryListBean();
		entryListBean.setStaffID(staffID);
		entryListBean.setScheduleID(scheduleID);
		entryListBean.setSchoolID(schoolID);
		entryListBean.setEntryDate(entryDate);
		entryListBean.setEntrySchool(entrySchool);
		entryList.add(entryListBean);
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
	return entryList;
	}





}
