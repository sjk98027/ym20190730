package employee.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import employee.common.DAO;

public class DeptDAO {
	public Map<String,Integer>getMemberByDept(){
		Connection conn =DAO.getConnect();
//		String sql = "select d.department_name department_name, count(*) as cnt" 
//				+ "from employees e, departments d"
//				+ "where 1=1 and e.department_id = d.department_id"
//				+ "and e.department_id is not null"
//				+ "group by d.department_name,e.department_id";
		String sql = "select d.department_name department_name, count(*) as cnt\r\n" + 
				"				from employees e, departments d\r\n" + 
				"				where 1=1 and e.department_id = d.department_id\r\n" + 
				"				and e.department_id is not null\r\n" + 
				"				group by d.department_name,e.department_id";
		Map<String,Integer> map = new HashMap<String, Integer>();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs= pstmt.executeQuery();
			while(rs.next()) {
				map.put(rs.getString("department_name"),rs.getInt("cnt"));
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return map;
	}
	
	
	
	public Map<Integer, String> getDetp(){
		Connection conn = DAO.getConnect();
		String sql = "select DEPARTMENT_ID, DEPARTMENT_NAME from departments"; 
		Map<Integer , String> map =new HashMap<Integer,String>();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs =  pstmt.executeQuery();
			while(rs.next()) {
				map.put(rs.getInt("DEPARTMENT_ID"), rs.getString("DEPARTMENT_NAME"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return map;
	}
}
