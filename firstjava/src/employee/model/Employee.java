package employee.model;

public class Employee {
	private	int employeeId;
	private String firstName;
	private String lastName;
	private int salary;
	private int departmentId;
	
	

	public Employee(int employeeId, String firstName, String lastName, int salary) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public int getEmpployeeId() {
		return employeeId;
	}

	public void setEmpployeeId(int empployeeId) {
		this.employeeId = empployeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return  "사원번호 : "+ employeeId+"\n"+
				"성 : "+firstName+"\n"+
				"이름 : "+lastName+"\n"+
				"급여 : "+salary+"\n"+
				"부서 : " + departmentId;
	}

	public void setDepartmentId(int deptId) {
		this.departmentId = deptId;
		
	}
	public int getDepartmentId() {
		return departmentId;
	}
	
	
	
}
