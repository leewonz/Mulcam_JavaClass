package day07;

public class Employee<T> {
	String name;
	T number;
	public Employee(String name, T number) {
		super();
		this.name = name;
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public T getNumber() {
		return number;
	}
	public void setNumber(T number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", number=" + number + "]";
	}
	
	
}
