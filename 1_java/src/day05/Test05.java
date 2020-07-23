package day05;

public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal[] animals = {
				new Dog("진돗개", "쫑쫑"),
				new Fish("쿠쿠"),
				new Dog("시츄","시시")
		};
		
		for(Animal a : animals) {
			exec(a);
		}
		
		System.out.println("==========================");
		
		Dog d = new Dog("진돗개", "--");
		exec(d);
		Fish f = new Fish("코코");
		exec(f);
	}
	public static void exec(Animal d) {
		d.print();
		d.breath();
	}
}
