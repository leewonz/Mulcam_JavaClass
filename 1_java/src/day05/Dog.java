package day05;

public class Dog extends Animal{
	String kind = "강아지 종류";
	String name;
	
	public Dog() {
		super("강아지");
	}

	public Dog(String kind, String name) {
		super("강아지");
		this.kind = kind;
		this.name = name;
	}

	public Dog(String skind, String kind, String name) {
		super(skind); //Animal의 생성자를 통해 kind를 할당함
		//super.kind = kind;
		this.kind = kind;
		this.name = name;
	}

	@Override
	public void breath() {
		System.out.println("폐로 숨쉬어");
		
	}
	
	public void print() {
		System.out.printf("Dog[%s, %s, %s]%n",
						  super.kind,
						  this.kind,
						  this.name);
	}
}
