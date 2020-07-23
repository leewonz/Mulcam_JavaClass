package ex;

public class Prob5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] persons = {
				new Student("홍길동", 20, 200201),
				new Teacher("이순신", 20, "JAVA"),
				new Employee("유관순", 20, "교무과")
		};
		
		for (Person person:persons) {
			person.print();
		}
	}

}
