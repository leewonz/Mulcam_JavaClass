package day05;

public class Fish extends Animal {
	String name;
	
	public Fish() {
		super("물고기");
	}
	
	public Fish(String name) {
		super("물고기");
		this.name = name;
	}
	
	@Override
	public void breath() {
		System.out.println("아가미로 숨쉬어");
	}
	
	public void print() {
		System.out.printf("Fish[%s, %s, %s]%n",super.kind, kind, name);
	}
}
