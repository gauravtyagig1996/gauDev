package point3;

class TestThis2 {

	int rollno;
	String name;
	float fee;

	TestThis2(int rollno, String name, float fee) {
		this.rollno = rollno;
		this.name = name;
		this.fee = fee;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + fee);
	}
}

public class N7 {
	public static void main(String args[]) {
		TestThis2 s1 = new TestThis2(111, "ankit", 5000f);
		TestThis2 s2 = new TestThis2(112, "sumit", 6000f);
		s1.display();
		s2.display();
	}

}
