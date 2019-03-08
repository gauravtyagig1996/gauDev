package point1;

public class N12 {
	// nasted if else

	public static void main(String[] args) {

		int age = 20;
		int weight = 50;

		if (age > 18) {
			if (weight > 40) {
				System.out.println("eligible to join the group");
			} else {
				System.out.println("weight must be greater than 40");
			}
		} else {
			System.out.println("age must be greater than 18");
		}
	}

}
