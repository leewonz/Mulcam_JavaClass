package day05_ex;

public class Student extends Person {
	private int id;

	public Student(String name, int age, int id) {
		super(name, age);
		this.id = id;
	}
	
	@Override
	public void print() {
		System.out.printf("이    름 : %s    나    이 : %d    학    번 : %d%n",
						  name, age, id);
	}
}
