package common;

import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {
	static Connection conn;

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Employee emp = new Employee();
		emp.setEmployeeId(999);
		emp.setSalary(10000);
		emp.setLastName("lastet");
		emp.setEmail("asdfasfd");
		emp.setHireDate("2010-05-01");
		emp.setJobId("IT_PROD");

		//insertEmp(emp);
		//updateEmp(emp);
		deleteEmp(emp);
		
		
		
		
		
		
		
		
		
	}
static void updateEmp(Employee e) {
	try {
		getconn();
		
		String sql = "update emp_temp"
				+ " set salary = ? "
				+ "where employee_id = ?";
		PreparedStatement pstmt =  conn.prepareStatement(sql);
		pstmt.setInt(1, e.getSalary());
		pstmt.setInt(2, e.getEmployeeId());
		
		int r = pstmt.executeUpdate();
		System.out.println(r+"업데이트");
		
	}
	catch (Exception e1) {
		e1.printStackTrace();
	}
}
	

private static void deleteEmp(Employee e) {
	try {
		getconn();
		
		String sql = "delete from emp_temp "
				+ "where employee_id = ?";
		PreparedStatement pstmt =  conn.prepareStatement(sql);
		pstmt.setInt(1, e.getEmployeeId());
				
		int r = pstmt.executeUpdate();
		System.out.println(r+"삭제");
		
	}
	catch (Exception e1) {
		e1.printStackTrace();
	}
}
	
	private static void asdf() {
//		List<Department> listDept = getDeptList();
//		for (Department dept : listDept) {
//			System.out.println(dept.getDepartmentId()+"\t"+dept.getDepartmentName()
//			+"\t"+dept.getManagerId()+"\t"+dept.getLocationId());
//		}
	}

	public static void insertEmp (Employee e) {
		try {
			getconn();
			
			String sql = "insert into emp_temp (EMPLOYEE_ID, LAST_NAME, EMAIL, HIRE_DATE, JOB_ID)"
					+ " values (?,?,?,?,?)";
			PreparedStatement pstmt =  conn.prepareStatement(sql);
			pstmt.setInt(1, e.getEmployeeId());
			pstmt.setString(2, e.getLastName());
			pstmt.setString(3, e.getEmail());
			pstmt.setString(4, e.getHireDate());
			pstmt.setString(5, e.getJobId());
			
			int r = pstmt.executeUpdate();
			System.out.println(r+"업데이트");
			
		}
		catch (Exception e1) {
			e1.printStackTrace();
		}
	}
	public static void getconn() throws ClassNotFoundException, SQLException {
		String user = "hr";
		String pw = "hr";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection(url, user, pw);
	}

	public static List<Employee> getEmpList() throws ClassNotFoundException, SQLException {
		getconn();
		List<Employee> list = new ArrayList<Employee>();
		String sql = "select * from employees";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				
				Employee emp = new Employee();
				emp.setEmployeeId(rs.getInt("EMPLOYEE_ID"));
				
				emp.setFirstName(rs.getString("FIRST_NAME"));
				emp.setLastName(rs.getString("LAST_NAME"));
				emp.setSalary(rs.getInt("SALARY"));
				list.add(emp);
				//list.add(rs.getString("first_name"));

				// System.out.println(rs.getString("first_name") + " " +
				// rs.getString("last_name"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return list;
	}
	public static List<Department> getDeptList() throws ClassNotFoundException, SQLException {
		getconn();
		List<Department> list = new ArrayList<Department>();
		String sql = "select * from departments";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				
				Department dept = new Department();
				dept.setDepartmentId(rs.getInt("DEPARTMENT_ID"));
				
				dept.setDepartmentName(rs.getString("DEPARTMENT_NAME"));
				dept.setManagerId(rs.getInt("MANAGER_ID"));
				dept.setLocationId(rs.getInt("LOCATION_ID"));
				list.add(dept);
				//list.add(rs.getString("first_name"));

				// System.out.println(rs.getString("first_name") + " " +
				// rs.getString("last_name"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return list;
	}

}
