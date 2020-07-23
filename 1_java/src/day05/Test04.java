package day05;

public class Test04 {

	public static void main(String[] args) {
		//Animal a1 = new Animal();
		//Animal a2 = new Animal("강아지");
		System.out.println("----------");
		
		Dog d1 = new Dog("강아지", "진돗개", "쫑쫑");
		
		System.out.println(d1.kind);
		System.out.println(d1.name);
		
		System.out.println(((Animal)d1).kind);
		Animal aa = d1;
	}

}
