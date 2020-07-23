package day05;

public abstract class Animal {
	String kind = "동물의 종류";

	public Animal() {
		super();
	}

	public Animal(String kind) {
		super();
		this.kind = kind;
	}
	
	/*
	public void breath() {
		System.out.println("스읍하아");
	}*/
	public abstract void breath();
	
	public void print() {};
}
