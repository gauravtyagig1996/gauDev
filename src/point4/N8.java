package point4;

class A {

	A get() {
		return this;
	}
}

public class N8 extends A {
	N8 get() {
		return this;
	}

	void message() {
		System.out.println("welcome to covariant return type");
	}

	public static void main(String args[]) {
		new N8().get().message();
	}

}
