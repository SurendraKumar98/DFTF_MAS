package day4;

public class EmployeeMain {

	public static void main(String[] args) {
		
			Employee e = new Employee();
			e.setAge(22);
			e.setEmpCode(51933130);
			e.setEmpName("Suri");
			e.setSalary(100);

			 System.out.println("Employee Name:" + e.getEmpName());
			System.out.println(e);

	}

}
