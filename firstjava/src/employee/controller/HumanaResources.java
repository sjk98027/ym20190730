package employee.controller;

import java.util.Scanner;
import employee.impl.EmpServiceImpl22;
import employee.model.Department;
import employee.model.EmpService22;
import employee.model.Employee22;

public class HumanaResources {
	Scanner sc = new Scanner(System.in);
	Employee22[] employees = new Employee22[10];
	Department[] departments = {
			new Department(10,"Administration"),
			new Department(20,"Marketing"),
			new Department(30,"Purchasing"),
			new Department(40,"Human Resource"),
	};
	EmpService22 service = new EmpServiceImpl22();

	public void execute() {
		int menu = 0;
		while (true) {
			printMenu();
			menu = sc.nextInt();
			sc.nextLine();

			if (menu == 1) {
				System.out.println("등록화면");
				register();

			} else if (menu == 2) {
				System.out.println("조회화면");
				search();
			} else if (menu == 3) {
				System.out.println("리스트화면");
				list();

			} else if (menu == 4) {
				System.out.println("갱신화면");
				update();
			} else if (menu == 5) {
				System.out.println("삭제화면");
				delete();
				
			}else if(menu == 6) {
				System.out.println("부서수정");
				deptUpdate();
			}
			
			else {
				System.out.println("프로그램 종료");
				System.exit(0);
			}

		}
	}
	
	public void deptUpdate() {
		System.out.print("사번입력 >>");
		int employeeId = sc.nextInt();sc.nextLine();
		
		EmpService22.showDept(departments);
		System.out.println("부서번호를 입력해주세요");
		int deptId=sc.nextInt();sc.nextLine();
		
		Employee22 emp = service.returnEmp(employeeId, employees);
		emp.setDepartmentId(deptId);
		service.empUpdate(emp, employees);
		
	}

	public void printMenu() {
		System.out.println("메뉴를 선택하세요 1)등록 2)조회 3)전체리스트 4)갱신 5)삭제 6)부서수정 7)종료");
	}

	public void register() {
		System.out.print("사번입력 >>");
		int employeeId = sc.nextInt();
		sc.nextLine();
		System.out.print("이름 입력>>");
		String firstName = sc.nextLine();
		System.out.print("성 입력>>");
		String lastName = sc.nextLine();
		System.out.print("급여입력>>");
		int salary = sc.nextInt();
		sc.nextLine();
		Employee22 emp = new Employee22(employeeId, firstName, lastName, salary);
		service.registerEmp(emp, employees);

	}

	public void search() {
		System.out.print("조회할 사번입력 >>");
		int empId = sc.nextInt();
		sc.nextLine();
		service.searchEmp(empId, employees);
	}

	public void list() {
		System.out.println("전체 사원 리스트");
		service.empList(employees);
	}

	public void update() {
		System.out.print("사번입력 >>");
		int employeeId = sc.nextInt();
		sc.nextLine();
		System.out.print("급여입력>>");
		int salary = sc.nextInt();
		sc.nextLine();
		Employee22 emp = service.returnEmp(employeeId, employees);
		emp.setSalary(salary);
		service.empUpdate(emp, employees);
	}

	public void delete() {
		System.out.print("사번입력 >>");
		int employeeId = sc.nextInt();
		sc.nextLine();
		Employee22 emp = service.returnEmp(employeeId, employees);
		service.empDelete(employeeId, employees);
	}

}

//update delete 추가(거기에 delete 할경우 뒤에 있는 데이터 앞으로 땡기기까지)
