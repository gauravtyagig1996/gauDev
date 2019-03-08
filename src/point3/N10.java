package point3;

class A4 {

	int rollno;
	String name, course;
	float fee;

	A4(int rollno, String name, String course) {
		this.rollno = rollno;
		this.name = name;
		this.course = course;
	}

	A4(int rollno, String name, String course, float fee) {
		this(rollno, name, course);
		this.fee = fee;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + course + " " + fee);
	}
}

public class N10 {
	public static void main(String args[]) {
		A4 s1 = new A4(111, "ankit", "java");
		A4 s2 = new A4(112, "sumit", "java", 6000f);
		s1.display();
		s2.display();
	}

}
