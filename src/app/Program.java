package app;

import java.sql.Connection;
import java.sql.PreparedStatement;

import model.entities.Department;

public class Program {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement st = null;
	
		Department obj = new Department(1,"books");
	}

}
