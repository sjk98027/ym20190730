package employee.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import employee.common.DAO;
import employee.model.Employee;

public class EmpDAO {
	public List<Employee> getEmpList() {

		Connection conn = DAO.getConnect();
		String sql = "select * from emp_temp order by 1";
		Employee emp = null;
		List<Employee> list = new ArrayList<Employee>();

		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				emp = new Employee();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				list.add(emp);
			}

		}

		catch (Exception e) {
			e.printStackTrace();
		}
		return list;

	}

	public Employee getEmployee(int empId) {
		Employee emp = new Employee();
		Connection conn = DAO.getConnect();
		String sql = "select * from emp_temp where employee_id = ?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, empId);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {

				emp.setFirstName(rs.getString("first_name"));
				emp.setEmployeeId(rs.getInt("employee_id"));

			}

		}

		catch (Exception e) {
			e.printStackTrace();
		}
		return emp;

	}

	public void insertEmployee(Employee emp) {
		
		Connection conn = DAO.getConnect();
		String sql = "insert into emp_temp(last_name, email, hire_date,job_id,employee_id)"
				+ "values(?,?,sysdate,?,?)";
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, emp.getLastName());
			pstmt.setString(2, emp.getEmail());
			pstmt.setString(3,emp.getJobId());
			pstmt.setInt(4, emp.getEmployeeId());
			int r = pstmt.executeUpdate();
			System.out.println(r + "삽입");
			
			
		}

		catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void updateEmployee(int empId, int salary) {
		Connection conn = DAO.getConnect();
		String sql = "update emp_temp "
				+ "set SALARY = ?,"
				+ "where employee_id =?";
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, salary);
			pstmt.setInt(2, empId);
			int r = pstmt.executeUpdate();
			System.out.println(r + "삽입");
			
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void updateEmployee(Employee emp) {
		Connection conn = DAO.getConnect();
		String sql = "update emp_temp "
				+ "set LAST_NAME = ?,"
				+ "EMAIL = ?,"
				+ "JOB_ID=?"
				+ "where employee_id =?";
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, emp.getLastName());
			pstmt.setString(2, emp.getEmail());
			
			pstmt.setString(3, emp.getJobId());
			pstmt.setInt(4, emp.getEmployeeId());
			int r = pstmt.executeUpdate();
			System.out.println(r + "수정");
			//ResultSet rs = pstmt.executeQuery();
			
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void deleteEmployee(int empId) {
		Connection conn = DAO.getConnect();
		String sql = "delete from emp_temp "
				+ "where employee_id =? ";
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, empId);
			
			int r = pstmt.executeUpdate();
			System.out.println(r+"삭제");
			
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
