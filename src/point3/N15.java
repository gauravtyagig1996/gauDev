package point3;

class aa {
	// inheritance
	void eat() {
		System.out.println("eating...");
	}
}

class Dog extends aa {
	void bark() {
		System.out.println("barking...");
	}
}

public class N15 {
	public static void main(String args[]) {
		Dog d = new Dog();
		d.bark();
		d.eat();
	}

}
