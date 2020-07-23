package day05;

//Singleton class
//Singleton class
//Singleton class
//Singleton class
//Singleton class
//Singleton class
//Singleton class
//Singleton class
//Singleton class
//Singleton class
//Singleton class
//Singleton class
//Singleton class
//Singleton class
//Singleton class

public class Test03 {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
	}

}

class Singleton{
	static Singleton s = new Singleton();
	private Singleton() {
		
	}
	public static Singleton getInstance() {
		if (s == null) {
			new Singleton();
		}
		return s;
	}
}