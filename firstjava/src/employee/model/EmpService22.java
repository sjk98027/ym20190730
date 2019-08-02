package employee.model;

public interface EmpService22 {
	public void registerEmp(Employee22 emp, Employee22[] ary);
	public void searchEmp(int empId, Employee22[] ary);
	public void empList(Employee22[] ary);
	public void empUpdate(Employee22 emp, Employee22[] ary);
	public void empDelete(int empId, Employee22[] ary);
	default void setDetp(int empId,int deptId,Employee22[] ary) {
		for(int i=0; i<ary.length; i++) {
			if(ary[i] !=null && ary[i].getEmpployeeId() == empId)
				ary[i].setDepartmentId(deptId);
		}
	}
	
	public Employee22 returnEmp(int employeeId, Employee22[] employees);
	static void showDept(Department[] departments) {
		for(int i=0; i<departments.length; i++) {
			System.out.println(departments[i].toString());
		}
	}
}
