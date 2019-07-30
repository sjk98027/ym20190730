package employee.impl;

import employee.model.Department;
import employee.model.EmpService;
import employee.model.Employee;

public class EmpServiceImpl implements EmpService {

	@Override
	public void registerEmp(Employee emp, Employee[] ary) {
		for (int i = 0; i < ary.length; i++) {
			if (ary[i] == null) {
				ary[i] = emp;
				break;
			}
		}

	}

	@Override
	public void searchEmp(int empId, Employee[] ary) {
		for (int i = 0; i < ary.length; i++) {
			if (ary[i] != null && ary[i].getEmpployeeId() == empId) {
				System.out.println(ary[i]);
			}
		}

	}

	public Employee returnEmp(int empId, Employee[] ary) {
		for (int i = 0; i < ary.length; i++) {
			if (ary[i] != null && ary[i].getEmpployeeId() == empId) {
				return ary[i];
			}
		}

		return null;
	}

	@Override
	public void empList(Employee[] ary) {
		
		
		System.out.println("=====================================");
		System.out.println("사번\t 이름\t 성\t 급여\t 부서\t");
		System.out.println("=====================================");
		for (int i = 0; i < ary.length; i++) {
			if (ary[i] != null) {
				
				String value = ary[i].getEmpployeeId() + "\t" + ary[i].getFirstName() + "\t" + ary[i].getLastName()
						+ "\t" + ary[i].getSalary() + "\t" + returnDeptName(ary[i].getDepartmentId());
				System.out.println(value);
			}
		}
	}

	private String returnDeptName(int deptNo) {
		Department[] departments = {
			new Department(10,"Administration"),
			new Department(20,"Marketing"),
			new Department(30,"Purchasing"),
			new Department(40,"Human Resource"),
		
	};
		for(int i=0; i<departments.length;i++)
		{
			if(departments[i].getDepartmentId() == deptNo) {
				return departments[i].getDepartmentName();
			}
		} 		
			return ""; 
	}
	
	@Override
	public void empUpdate(Employee emp, Employee[] ary) {
		for (int i = 0; i < ary.length; i++) {
			if (ary[i].getEmpployeeId() == emp.getEmpployeeId()) {
				ary[i] = emp;
				break;
			}
		}

	}

	@Override
	public void empDelete(int empId, Employee[] ary) {
		boolean successDel = false;
		int delnum = 0;
		for (int i = 0; i < ary.length; i++) {
			if (ary[i].getEmpployeeId() == empId) {
				ary[i] = null;
				successDel = true;
				delnum = i;
				break;
			}
		}
		if (successDel) {
			for (int i = delnum; i < ary.length - 1; i++) {

				ary[i] = ary[i + 1];

			}
		}

	}

}
