package employee.impl;

import java.util.List;

import employee.model.EmpService;
import employee.model.Employee;
import employee.model.Employee22;

public class EmpServiceImpl implements EmpService {
	EmpDAO dao = new EmpDAO();
	@Override
	public Employee getEmployee(int empId) {
		
		return dao.getEmployee(empId);
	}

	@Override
	public List<Employee> getEmployeeList() {
		return dao.getEmpList();
	}

	@Override
	public List<Employee> getEmployeeList(String hireDate) {
		return null;
	}

	@Override
	public void insertEmp(Employee emp) {
		dao.insertEmployee(emp);
		
	}

	@Override
	public void updateEmp(int empId, int salary) {
		dao.updateEmployee(empId,salary);
		
	}

	@Override
	public void updateEmp(Employee emp) {
		dao.updateEmployee(emp);
		
	}


	@Override
	public void deleteEmp(int empId) {
		dao.deleteEmployee(empId);
		
	}



}
