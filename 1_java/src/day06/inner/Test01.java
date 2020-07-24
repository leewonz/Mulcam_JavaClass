package day06.inner;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		A.B b = new A().new B();
		b.print();
	}
}

class A{
	String name = "A";
	static String sName = "A";
	
	class B{
		void print() {
			System.out.printf("B class %s %n",  name);
		}
	}
	
	static class C{
		void print() {
			System.out.printf("B class %s %n",  sName);
		}
	}
}

