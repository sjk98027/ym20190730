package employee.model;

import java.util.List;

public interface EmpService {
	public Employee getEmployee(int empId);
	public List<Employee> getEmployeeList();
	public List<Employee> getEmployeeList(String hireDate);
	public void insertEmp(Employee emp);
	public void updateEmp(int empId, int salary);
	public void updateEmp(Employee emp);
	public void deleteEmp(int empId);
	
	
	
}
