package day06;

abstract class Shape {
	public abstract double getArea();
}

class Point {
	int x;
	int y;
}

interface Drawable {
	void draw();
}

interface Movable {
	void move();
}

interface T extends Drawable, Movable{}

public class Circle extends Shape implements T {

	Point p;
	double r;

	public Circle(Point p, Double r) {
		super();
		this.p = p;
		this.r = r;
	}

	@Override
	public void move() {
		System.out.println("move");

	}

	@Override
	public void draw() {
		System.out.println("draw");

	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI * r * r;
	}

}
