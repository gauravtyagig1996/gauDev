package point4;

class Shape {
	void draw() {
		System.out.println("drawing...");
	}
}

class Rectangle extends Shape {
	void draw() {
		System.out.println("drawing rectangle...");
	}
}

class Gola extends Shape {
	void draw() {
		System.out.println("drawing Gola...");
	}
}

class Triangle extends Shape {
	void draw() {
		System.out.println("drawing triangle...");
	}
}

public class N16 {
	public static void main(String args[]) {
		Shape s;
		s = new Rectangle();
		s.draw();
		s = new Gola();
		s.draw();
		s = new Triangle();
		s.draw();
	}

}
