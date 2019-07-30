package employee.model;

public interface EmpService {
	public void registerEmp(Employee emp, Employee[] ary);
	public void searchEmp(int empId, Employee[] ary);
	public void empList(Employee[] ary);
	public void empUpdate(Employee emp, Employee[] ary);
	public void empDelete(int empId, Employee[] ary);
	default void setDetp(int empId,int deptId,Employee[] ary) {
		for(int i=0; i<ary.length; i++) {
			if(ary[i] !=null && ary[i].getEmpployeeId() == empId)
				ary[i].setDepartmentId(deptId);
		}
	}
	
	public Employee returnEmp(int employeeId, Employee[] employees);
	static void showDept(Department[] departments) {
		for(int i=0; i<departments.length; i++) {
			System.out.println(departments[i].toString());
		}
	}
}
