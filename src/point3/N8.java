package point3;

class A1 {
	int rollno;
	String name;
	float fee;

	A1(int r, String n, float f) {
		rollno = r;
		name = n;
		fee = f;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + fee);
	}
}

public class N8 {
	public static void main(String args[]) {
		A1 s1 = new A1(111, "ankit", 5000f);
		A1 s2 = new A1(112, "sumit", 6000f);
		s1.display();
		s2.display();
	}

}
