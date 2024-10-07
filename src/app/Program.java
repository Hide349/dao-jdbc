package app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;

public class Program {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement st = null;
	
		
		try {
			conn = DB.getConnection();
			st = conn.prepareStatement(
					"UPDATE seller "+
					"SET BaseSalary = ? "+
					"WHERE "+
					"(Name = ?)");
			
			st.setDouble(1, 3000.00);
			st.setString(2, "Bob Brown");
			int rowsAffected = st.executeUpdate();
			System.out.println("rows affecteds : " + rowsAffected);
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
