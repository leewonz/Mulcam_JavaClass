package day07;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee<String> emp1 = new Employee<String>("홍길동", "202001");
		
		System.out.println(emp1);
		System.out.println(emp1.number.substring(0,4));
	}

}
