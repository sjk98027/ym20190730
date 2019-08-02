package employee.controller;


import java.sql.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import employee.impl.DeptDAO;
import employee.impl.EmpDAO;
import employee.impl.EmpServiceImpl;
import employee.model.EmpService;
import employee.model.Employee;

public class EmpProc {
	Scanner sc = new Scanner(System.in);
	EmpService service = new EmpServiceImpl();

	public void execute() {
		
		boolean breakpoint = true;
		while (breakpoint) {
			System.out.println("1)리스트 2)단건검색 3)추가 4)수정 5)삭제 6)나가기");
			int menu = sc.nextInt();
			Employee emp = new Employee();
			switch (menu) {
			case 1:
				List<Employee> list = service.getEmployeeList();
				for (Employee e : list) {
					System.out.println(e.getEmployeeId() + e.getFirstName());
				}
				break;
			case 2:
				System.out.println("사번입력하세요");
				int empId = sc.nextInt();sc.nextLine();
				emp = service.getEmployee(empId);
				System.out.println(emp);
				break;
			case 3:
				System.out.println("사번을 입력하세요");
				empId = sc.nextInt();sc.nextLine();
				emp.setEmployeeId(empId);
				System.out.println("이름을 입력하세요");
				String lastName = sc.nextLine();
				emp.setLastName(lastName);
				System.out.println("이메일을 입력하세요");
				String email = sc.nextLine();
				emp.setEmail(email);
				System.out.println("잡이름을 입력하세요");
				String jobId = sc.nextLine();
				emp.setJobId(jobId);
				service.insertEmp(emp);
				break;
			case 4:
				System.out.println("사번을 입력하세요");
				empId = sc.nextInt();sc.nextLine();
				emp.setEmployeeId(empId);
				System.out.println("이름을 입력하세요");
				lastName = sc.nextLine();
				emp.setLastName(lastName);
				System.out.println("이메일을 입력하세요");
				email = sc.nextLine();
				emp.setEmail(email);
				System.out.println("잡이름을 입력하세요");
				jobId = sc.nextLine();
				emp.setJobId(jobId);
				service.updateEmp(emp);
				break;
			case 5:
				System.out.println("사번을 입력하세요");
				empId = sc.nextInt();sc.nextLine();
				service.deleteEmp(empId);
				break;

			default:
				System.out.println("종료");
				breakpoint = false;
				break;
			}
		}

	}

	public void thresh() {
		DeptDAO dao = new DeptDAO();
		Map<String, Integer> map = dao.getMemberByDept();
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		for (Map.Entry<String, Integer> mapEntry : entrySet) {
			System.out.println(mapEntry.getKey() + "\t " + mapEntry.getValue());
		}

		// 잠시주석
//		DeptDAO dao = new DeptDAO();
//		Map<Integer, String> map = dao.getDetp();
//		Set<Integer> keySet = map.keySet();
//		for(Integer intValue : keySet) {
//			System.out.println(intValue + ", " + map.get(intValue));
//		}
//		Set<Map.Entry<Integer, String>>entrySet = map.entrySet();
//		for(Map.Entry<Integer, String> mapEntry : entrySet) {
//			System.out.println(mapEntry.getKey() + "  ," + mapEntry.getValue());
//		}
//		Iterator<Map.Entry<Integer, String>> itr = entrySet.iterator();

		// 잠시주석
//		Map<String,Employee> mapEmp = new HashMap<>();
//		Map<String,List<Employee>>mapEmp1 = new HashMap<>();
//				

		System.out.println("1)리스트 2)단건");
		int menu = sc.nextInt();
		if (menu == 1) {

			List<Employee> list = service.getEmployeeList();
			for (Employee e : list) {
				System.out.println(e.getEmployeeId() + e.getFirstName());
			}
		} else
			System.out.println("조회할 사번 >> ");
		int empId = sc.nextInt();
		Employee emp = service.getEmployee(empId);
		System.out.println(emp);

		// service.getEmployeeList();

	}
}
