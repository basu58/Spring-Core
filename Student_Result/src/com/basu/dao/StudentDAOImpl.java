package com.basu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.basu.bo.StudentBO;

public class StudentDAOImpl implements StudentDAO{
	private DataSource drds;
	private Connection con;
	private PreparedStatement ps;
	
	private String STUDENT_RESULT="insert into student_rslt values(?, ?, ?, ?, ?)";
	
	public StudentDAOImpl(DataSource drds) {
		this.drds = drds;
	}

	@Override
	public int insert(StudentBO bo) {
		try {
			con=drds.getConnection();
			ps=con.prepareStatement(STUDENT_RESULT);
			ps.setInt(1, bo.getSno());
			ps.setString(2, bo.getSname());
			ps.setString(3, bo.getResult());
			ps.setFloat(4, bo.getAvg());
			ps.setInt(5, bo.getTotal());
			int result=ps.executeUpdate();
			return result;
			
		}
		catch (SQLException se) {
			return 0;
		}
		catch(Exception e) {
			return 0;
		}
	}
	
}
