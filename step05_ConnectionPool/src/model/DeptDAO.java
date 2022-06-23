package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.DBUtil;

public class DeptDAO {
	
	public static String getDname(int deptno) throws SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement("select dname from dept where deptno = ?");
			pstmt.setInt(1, deptno);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				return rs.getString(1);
			}
		
		} finally {
			DBUtil.close(rs, pstmt, conn);
		}
		return null;
		
		
	}

}
