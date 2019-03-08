package point3;

class Employee {

	float salary = 40000;
}

public class N14 extends Employee {
	int bonus = 10000;

	public static void main(String args[]) {
		N14 p = new N14();
		System.out.println("Programmer salary is:" + p.salary);
		System.out.println("Bonus of Programmer is:" + p.bonus);
	}

}
