package day06;

public class Test01 {

	public static void main(String[] args) {
		String s1 = new String("hello");
		String s2 = new String("hello");
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		
		System.out.println(s1.equals(s2));
		
		Employee emp1 = new Employee("홍길동", "행정실");
		Employee emp2 = new Employee("홍길동", "행정실");
		
		System.out.println(emp1.toString());
		System.out.println(emp2.toString());
		
		System.out.println(emp1.equals(emp2));
	}
}


class Employee{
	String name;
	String dept;
	
	public Employee() {
		
	}
	public Employee(String name, String dept) {
		this.name = name;
		this.dept = dept;
		
	}
	
	@Override
	public String toString() {
		StringBuffer sb =  new StringBuffer();
		sb.append("Employee [name = ");
		sb.append(name);
		sb.append(", dept = ");
		sb.append(dept);
		sb.append("]");
		return sb.toString();
	}
	/*
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		
		if (!(obj instanceof Employee)){
			return false;
		}
		
		Employee eObj = (Employee)obj;
		
        return (this.name.equals(eObj.name) && 
        		this.dept.equals(eObj.dept));
    }*/
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dept == null) ? 0 : dept.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (dept == null) {
			if (other.dept != null)
				return false;
		} else if (!dept.equals(other.dept))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}