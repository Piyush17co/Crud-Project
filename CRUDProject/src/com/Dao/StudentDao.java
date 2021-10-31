package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.Bean.StudentBean;
import com.Util.StudentUtil;

public class StudentDao {
    public static void doInsert(StudentBean s) {
    	System.out.println("Doinsert done");
    	Connection conn =null;
    	try {
			conn = StudentUtil.createConnection();
			String sql = "insert into Student1 (fname,lname,email,password) values(?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, s.getFname());
			pst.setString(2, s.getLname());
			pst.setString(3, s.getEmail());
			pst.setString(4, s.getPassword());
			pst.executeUpdate();
			System.out.println("Data Inserted");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    }
    public static List<StudentBean> getAllStudent(){
    	List<StudentBean> list = new ArrayList<>();
    	try {
			Connection conn = StudentUtil.createConnection();
			String sql = "Select * from Student1";
			PreparedStatement pst = conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				StudentBean s = new StudentBean();
				s.setId(rs.getInt("id"));
				s.setFname(rs.getString("fname"));
				s.setLname(rs.getString("lname"));
				s.setEmail(rs.getString("email"));
				s.setPassword(rs.getString("password"));
				list.add(s);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    	return list;
    }
    
    public static StudentBean getStudentById(int id) {
    	StudentBean s =null;
    	try {
    		System.out.println("GetStudentBy ID method Called");
			Connection conn = StudentUtil.createConnection();
			String sql = "Select * from Student1 where id = ?";
			PreparedStatement pst  = conn.prepareStatement(sql);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				s = new StudentBean();
				s.setId(rs.getInt("id"));
				s.setFname(rs.getString("fname"));
				s.setLname(rs.getString("lname"));
				s.setEmail(rs.getString("email"));
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    	return s;
    }
    public static void UpdateStudent(StudentBean s) {
    	try {
			Connection conn = StudentUtil.createConnection();
			String sql = "Update Student1 set fname =?,lname=?,email=? where id=? ";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, s.getFname());
			pst.setString(2, s.getLname());
			pst.setString(3, s.getEmail());
			pst.setInt(4, s.getId());
			pst.executeUpdate();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    }
    
     public static void deleteStudent(int id) {
    	try {
			Connection conn = StudentUtil.createConnection();
			String sql = "delete from student1 where id=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
			pst.executeUpdate();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}	
	
}

