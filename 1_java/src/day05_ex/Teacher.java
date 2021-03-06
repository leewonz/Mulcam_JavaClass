package day05_ex;

public class Teacher extends Person {
	private String subject;

	public Teacher(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}
	
	@Override
	public void print() {
		System.out.printf("이    름 : %s    나    이 : %d    담당과목 : %s%n",
						  name, age, subject);
	}
}
